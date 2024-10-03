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
        listaMusicas.add(new Musica(nextId++, "Change (In the House of Flies)", "Deftones", "Metal", "Alternativa", 2000, "https://youtu.be/WPpDyIJdasg?si=a8AVsqQ_0O2tySCZ", true));
        listaMusicas.add(new Musica(nextId++, "My Own Summer (Shove It)", "Deftones", "Metal", "Alternativa", 1997, "https://youtu.be/XOzs1FehYOA?si=6dLbcQp4daG3YSmz", true));
        listaMusicas.add(new Musica(nextId++, "Be Quiet and Drive (Far Away)", "Deftones", "Metal", "Alternativa", 1997, "https://youtu.be/KvknOXGPzCQ?si=mEgvb5cT7mGNVCGv", true));
        listaMusicas.add(new Musica(nextId++, "Diamond Eyes", "Deftones", "Metal", "Alternativa", 2010, "https://www.youtube.com/watch?v=gRlHBTYKyVg", true));
        listaMusicas.add(new Musica(nextId++, "Sextape", "Deftones", "Metal", "Alternativa", 2010, "https://www.youtube.com/watch?v=f0pdwd0miqs", true));
        listaMusicas.add(new Musica(nextId++, "You’ve Seen the Butcher", "Deftones", "Metal", "Alternativa", 2010, "https://youtu.be/woAcXSMyCEw?si=HIFM_wb9JOzwkNE8", true));
        listaMusicas.add(new Musica(nextId++, "Root", "Deftones", "Metal", "Alternativa", 1995, "https://youtu.be/344xGZeoGhI?si=N7oJWmwmYLlNipzo", true));
        listaMusicas.add(new Musica(nextId++, "Minerva", "Deftones", "Metal", "Alternativa", 2003, "https://youtu.be/mLa0-sQg1YM?si=AkvGrGVXBAnpvg02", false));
        listaMusicas.add(new Musica(nextId++, "Lhabia", "Deftones", "Metal", "Alternativa", 1997, "https://youtu.be/730KnmtbhUo?si=ZqXit6iAiwjBhby_", false));
        listaMusicas.add(new Musica(nextId++, "Hexagram", "Deftones", "Metal", "Alternativa", 2003, "https://youtu.be/yP4dFHSd-iw?si=L6AGLKTKz7ESf5YW", true));

        listaAvaliacoes.add(new Avaliacao(1, 9, "Uma das melhores músicas da banda!", 1));
        listaAvaliacoes.add(new Avaliacao(1, 8, "Muito poderosa e intensa.", 2));
        listaAvaliacoes.add(new Avaliacao(1, 10, "Perfeita para momentos emocionais.", 3));
        listaAvaliacoes.add(new Avaliacao(1, 7, "Adoro a melodia dessa música!", 4));
        listaAvaliacoes.add(new Avaliacao(1, 8, "Uma faixa clássica do Deftones.", 5));

        listaAvaliacoes.add(new Avaliacao(2, 8, "Energia incrível!", 1));
        listaAvaliacoes.add(new Avaliacao(2, 9, "Excelente trabalho vocal.", 2));
        listaAvaliacoes.add(new Avaliacao(2, 7, "A música é ótima para se animar.", 3));
        listaAvaliacoes.add(new Avaliacao(2, 6, "Bela combinação de ritmos.", 4));
        listaAvaliacoes.add(new Avaliacao(2, 8, "A parte instrumental é incrível.", 5));

        listaAvaliacoes.add(new Avaliacao(3, 9, "Adoro a atmosfera dessa música!", 1));
        listaAvaliacoes.add(new Avaliacao(3, 8, "Uma das melhores do álbum.", 2));
        listaAvaliacoes.add(new Avaliacao(3, 7, "Os riffs são muito bons.", 3));
        listaAvaliacoes.add(new Avaliacao(3, 9, "Essa música é um hino!", 4));
        listaAvaliacoes.add(new Avaliacao(3, 8, "Uma obra-prima do Deftones.", 5));

        listaAvaliacoes.add(new Avaliacao(4, 10, "Simplesmente incrível!", 1));
        listaAvaliacoes.add(new Avaliacao(4, 9, "A letra é profunda e tocante.", 2));
        listaAvaliacoes.add(new Avaliacao(4, 8, "Uma experiência auditiva única.", 3));
        listaAvaliacoes.add(new Avaliacao(4, 9, "Perfeita para ouvir a noite.", 4));
        listaAvaliacoes.add(new Avaliacao(4, 10, "Uma das minhas favoritas!", 5));

        listaAvaliacoes.add(new Avaliacao(5, 7, "Bela melodia, mas a letra poderia ser melhor.", 1));
        listaAvaliacoes.add(new Avaliacao(5, 8, "Bom uso de dinâmicas.", 2));
        listaAvaliacoes.add(new Avaliacao(5, 6, "Não é das minhas favoritas, mas ainda assim boa.", 3));
        listaAvaliacoes.add(new Avaliacao(5, 7, "As guitarras são impressionantes!", 4));
        listaAvaliacoes.add(new Avaliacao(5, 8, "Uma música que cresce com o tempo.", 5));

        listaAvaliacoes.add(new Avaliacao(6, 9, "Adoro essa música!", 1));
        listaAvaliacoes.add(new Avaliacao(6, 8, "Incrível energia ao vivo!", 2));
        listaAvaliacoes.add(new Avaliacao(6, 9, "Os vocais são impressionantes.", 3));
        listaAvaliacoes.add(new Avaliacao(6, 10, "Uma faixa obrigatória!", 4));
        listaAvaliacoes.add(new Avaliacao(6, 9, "Maravilhosa!", 5));

        listaAvaliacoes.add(new Avaliacao(7, 8, "Clássica do Deftones!", 1));
        listaAvaliacoes.add(new Avaliacao(7, 7, "Riffs marcantes.", 2));
        listaAvaliacoes.add(new Avaliacao(7, 8, "A música tem um clima diferente.", 3));
        listaAvaliacoes.add(new Avaliacao(7, 9, "Uma faixa poderosa!", 4));
        listaAvaliacoes.add(new Avaliacao(7, 10, "Imperdível!", 5));

        listaAvaliacoes.add(new Avaliacao(8, 6, "Não me chamou muito a atenção.", 1));
        listaAvaliacoes.add(new Avaliacao(8, 5, "Esperava mais dessa faixa.", 2));

        listaAvaliacoes.add(new Avaliacao(9, 7, "Boa música, mas não tão marcante.", 1));
        listaAvaliacoes.add(new Avaliacao(9, 6, "A letra é um pouco fraca.", 2));

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
    public String adicionarMusica(
            @RequestParam("nome") String nome,
            @RequestParam("artista") String artista,
            @RequestParam("genero") String genero,
            @RequestParam("estilo") String estilo,
            @RequestParam("anoLancamento") int anoLancamento,
            @RequestParam(value = "link", required = false) String link) {
        Musica novaMusica = new Musica(nextId++, nome, artista, genero, estilo, anoLancamento, link, false);
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
