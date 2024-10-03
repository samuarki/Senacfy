document.getElementById('loginForm').addEventListener('submit', function (event) {
    event.preventDefault();

    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;

    if (username === 'admin' && password === '1234') {
        window.location.href = '/administracao';
    } else {
        const errorMessage = document.getElementById('error-message');
        errorMessage.textContent = 'Usuário ou senha inválidos.';
        errorMessage.style.display = 'block';
    }
});
