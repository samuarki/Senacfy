package com.blog.senacfy.repository;

import com.blog.senacfy.model.Musica;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MusicaRepository extends JpaRepository<Musica, Integer> {
    // Você pode adicionar métodos de consulta personalizados aqui, se necessário.
}
