package com.blog.senacfy.repository;

import com.blog.senacfy.model.Avaliacao;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AvaliacaoRepository extends JpaRepository<Avaliacao, Integer> {

    // Método para encontrar avaliações por música ID
    List<Avaliacao> findByMusicaId(int musicaId);
}
