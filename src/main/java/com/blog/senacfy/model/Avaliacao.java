package com.blog.senacfy.model;

import jakarta.persistence.*;

@Entity
@Table(name = "avaliacoes") // Nome da tabela no banco de dados
public class Avaliacao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int nota;

    private String descricao;

    @Column(name = "musica_id") // Mapeando a coluna no banco de dados
    private int musicaId;

    public Avaliacao() {
    }

    public Avaliacao(int id, int nota, String descricao, int musicaId) {
        this.id = id;
        this.nota = nota;
        this.descricao = descricao;
        this.musicaId = musicaId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getMusicaId() {
        return musicaId;
    }

    public void setMusicaId(int musicaId) {
        this.musicaId = musicaId;
    }
}
