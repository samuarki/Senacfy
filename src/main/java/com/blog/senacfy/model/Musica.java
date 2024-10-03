package com.blog.senacfy.model;

public class Musica {

    private int id;
    private String nome;
    private String artista;
    private String genero;
    private String estilo;
    private int anoLancamento;
    private String link;
    private boolean aprovado;

    public Musica() {
    }

    public Musica(int id, String nome, String artista, String genero, String estilo, int anoLancamento, String link, boolean aprovado) {
        this.id = id;
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.estilo = estilo;
        this.anoLancamento = anoLancamento;
        this.link = link;
        this.aprovado = aprovado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstilo() {
        return estilo;
    }

    public void setEstilo(String estilo) {
        this.estilo = estilo;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public String getEmbedLink() {
        if (link == null || link.isEmpty()) {
            return null;
        }
        String videoId = link.substring(link.lastIndexOf('/') + 1);
        if (videoId.contains("?")) {
            videoId = videoId.substring(0, videoId.indexOf('?'));
        }
        return "https://www.youtube.com/embed/" + videoId;
    }

}
