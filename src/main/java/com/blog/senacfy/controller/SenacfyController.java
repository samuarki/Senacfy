package com.blog.senacfy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SenacfyController {

    @GetMapping("/")
    public String index() {
        return "index"; // Renderiza a página inicial
    }

    @GetMapping("/musicas")
    public String musicas(Model model) {
        // Você pode adicionar a lógica de passar músicas para a model aqui, se necessário
        return "musicas"; // Renderiza a página de músicas
    }

    @GetMapping("/musica/{id}")
    public String detalhesMusica(Model model) {
        // Lógica para passar detalhes de uma música específica pode ser adicionada
        return "detalhesMusica"; // Renderiza a página de detalhes da música
    }

    @GetMapping("/adicionar-musica")
    public String adicionarMusicaForm() {
        return "adicionarMusica"; // Renderiza o formulário para adicionar música
    }

    @GetMapping("/administracao")
    public String administracao(Model model) {
        // Lógica para passar músicas para a model pode ser adicionada
        return "administracao"; // Renderiza a página de administração
    }

    @GetMapping("/login")
    public String login() {
        return "login"; // Renderiza a página de login
    }
}
