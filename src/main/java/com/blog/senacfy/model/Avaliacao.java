package com.blog.senacfy.model;

public class Avaliacao {

    private int id;
    private int nota;
    private String descricao;
    private int filmeId;

    public Avaliacao() {
    }

    public Avaliacao(int id, int nota, String descricao, int filmeId) {
        this.id = id;
        this.nota = nota;
        this.descricao = descricao;
        this.filmeId = filmeId;
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

    public int getFilmeId() {
        return filmeId;
    }

    public void setFilmeId(int filmeId) {
        this.filmeId = filmeId;
    }

}
