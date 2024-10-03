package com.blog.senacfy.controller;

import com.blog.senacfy.model.Avaliacao;
import com.blog.senacfy.model.Musica;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@Controller
public class SenacfyController {

    private List<Musica> listaMusicas = new ArrayList<>();
    private List<Avaliacao> listaAvaliacoes = new ArrayList<>();
    private int nextId = 1;

    public SenacfyController() {
        listaMusicas.add(new Musica(nextId++, "Song 1", "Artist 1", "Rock", "Indie", 2010, true));
        listaMusicas.add(new Musica(nextId++, "Song 2", "Artist 2", "Pop", "Dance", 2015, true));
        listaMusicas.add(new Musica(nextId++, "Song 3", "Artist 3", "Jazz", "Smooth", 2005, false));

        listaAvaliacoes.add(new Avaliacao(1, 8, "Ótima música!", 1));
        listaAvaliacoes.add(new Avaliacao(2, 7, "Gostei bastante.", 2));
    }

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/musicas")
    public String musicas(Model model) {
        model.addAttribute("musicas", listaMusicas);
        return "musicas";
    }

    @GetMapping("/musica/{id}")
    public String detalhesMusica(Model model, @PathVariable int id) {
        Musica musica = listaMusicas.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
        if (musica == null) {
            return "redirect:/musicas";
        }

        List<Avaliacao> avaliacoesFiltradas = new ArrayList<>();
        for (Avaliacao avaliacao : listaAvaliacoes) {
            if (avaliacao.getFilmeId() == id) {
                avaliacoesFiltradas.add(avaliacao);
            }
        }

        model.addAttribute("musica", musica);
        model.addAttribute("avaliacoes", avaliacoesFiltradas);

        return "detalhesMusica";
    }

    @PostMapping("/avaliar/{id}")
    public String avaliarMusica(@PathVariable int id, @RequestParam("nota") int nota, @RequestParam("descricao") String descricao) {
        if (nota < 0 || nota > 10 || descricao == null || descricao.trim().isEmpty()) {
            return "redirect:/musica/" + id + "?error=invalid";
        }

        Avaliacao novaAvaliacao = new Avaliacao(listaAvaliacoes.size() + 1, nota, descricao, id);
        listaAvaliacoes.add(novaAvaliacao);

        return "redirect:/musica/" + id;
    }

    @GetMapping("/adicionar-musica")
    public String adicionarMusicaForm() {
        return "adicionarMusica";
    }

    @PostMapping("/adicionar-musica")
    public String adicionarMusica(@RequestParam("nome") String nome,
            @RequestParam("artista") String artista,
            @RequestParam("genero") String genero,
            @RequestParam("estilo") String estilo,
            @RequestParam("anoLancamento") int anoLancamento) {
        Musica novaMusica = new Musica(nextId++, nome, artista, genero, estilo, anoLancamento, false);
        listaMusicas.add(novaMusica);

        return "redirect:/musicas";
    }

    @GetMapping("/administracao")
    public String administracao(Model model) {
        model.addAttribute("musicas", listaMusicas);
        return "administracao";
    }

    @PostMapping("/aprovar/{id}")
    public String aprovarMusica(@PathVariable int id) {
        Musica musica = listaMusicas.stream().filter(m -> m.getId() == id).findFirst().orElse(null);
        if (musica != null) {
            musica.setAprovado(true);
        }
        return "redirect:/administracao";
    }

    @PostMapping("/excluir/{id}")
    public String excluirMusica(@PathVariable int id) {
        listaMusicas.removeIf(m -> m.getId() == id);
        return "redirect:/administracao";
    }

    @GetMapping("/login")
    public String login() {
        return "login";
    }
}
