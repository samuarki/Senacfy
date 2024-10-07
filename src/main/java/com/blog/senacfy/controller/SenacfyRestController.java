package com.blog.senacfy.controller;

import com.blog.senacfy.model.Avaliacao;
import com.blog.senacfy.model.Musica;
import com.blog.senacfy.repository.AvaliacaoRepository;
import com.blog.senacfy.repository.MusicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SenacfyRestController {

    @Autowired
    private MusicaRepository musicaRepository;

    @Autowired
    private AvaliacaoRepository avaliacaoRepository;

    @GetMapping("/musicas")
    public List<Musica> listarMusicas() {
        return musicaRepository.findAll();
    }

    @GetMapping("/musica/{id}")
    public ResponseEntity<Musica> obterMusica(@PathVariable Integer id) {
        // Verifique se o ID não é nulo e é positivo
        if (id == null || id <= 0) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST); // Retorna erro 400 se o ID for inválido
        }

        System.out.println("ID recebido: " + id); // Log para depuração

        return musicaRepository.findById(id)
                .map(musica -> new ResponseEntity<>(musica, HttpStatus.OK))
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping("/musica")
    public ResponseEntity<Musica> adicionarMusica(@RequestBody Musica musica) {
        Musica novaMusica = musicaRepository.save(musica);
        return new ResponseEntity<>(novaMusica, HttpStatus.CREATED);
    }

    @PutMapping("/musica/{id}")
    public ResponseEntity<Musica> atualizarMusica(@PathVariable int id, @RequestBody Musica musicaAtualizada) {
        return musicaRepository.findById(id)
                .map(musica -> {
                    musica.setNome(musicaAtualizada.getNome());
                    musica.setArtista(musicaAtualizada.getArtista());
                    musica.setGenero(musicaAtualizada.getGenero());
                    musica.setEstilo(musicaAtualizada.getEstilo());
                    musica.setAnoLancamento(musicaAtualizada.getAnoLancamento());
                    musica.setLink(musicaAtualizada.getLink());
                    musica.setAprovado(musicaAtualizada.isAprovado());
                    Musica musicaSalva = musicaRepository.save(musica);
                    return new ResponseEntity<>(musicaSalva, HttpStatus.OK);
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("/musica/{id}")
    public ResponseEntity<Void> excluirMusica(@PathVariable int id) {
        if (musicaRepository.existsById(id)) {
            musicaRepository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping("/avaliacao")
    public ResponseEntity<Avaliacao> adicionarAvaliacao(@RequestBody Avaliacao avaliacao) {
        Avaliacao novaAvaliacao = avaliacaoRepository.save(avaliacao);
        return new ResponseEntity<>(novaAvaliacao, HttpStatus.CREATED);
    }

    @GetMapping("/avaliacao/{musicaId}")
    public List<Avaliacao> listarAvaliacoesPorMusica(@PathVariable int musicaId) {
        return avaliacaoRepository.findByMusicaId(musicaId);
    }

    @PostMapping("/aprovar/{id}")
    public ResponseEntity<Void> aprovarMusica(@PathVariable int id) {
        return musicaRepository.findById(id)
                .map(musica -> {
                    musica.setAprovado(true);
                    musicaRepository.save(musica);
                    return new ResponseEntity<Void>(HttpStatus.OK);  // Retorna 200 OK após a aprovação
                })
                .orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));  // Caso não encontre a música, retorna 404
    }
}
