document.getElementById('loginForm').addEventListener('submit', function (event) {
    event.preventDefault(); // Impede o envio do formulário

    // Obtém os valores do formulário
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    // Verifica as credenciais
    if (username === 'admin' && password === '1234') {
        // Se as credenciais estiverem corretas, redireciona para a página de administração
        window.location.href = '/administracao';
    } else {
        // Se as credenciais estiverem incorretas, exibe uma mensagem de erro
        const errorMessage = document.getElementById('error-message');
        errorMessage.textContent = 'Usuário ou senha inválidos.';
        errorMessage.style.display = 'block';
    }
});
