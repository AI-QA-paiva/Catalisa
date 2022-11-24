const form = document.getElementById("usuario-form")

form.addEventListener('submit', event => { //o addEventListener, fica monitorando algo a receber
    event.preventDefault();

    const formData = new FormData(form);
    const data = Object.fromEntries(formData);

    fetch("http://localhost:8080/usuarios", {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(data)
    }).then(res => res.json())
        .then(data => console.log(data))
        .catch(error => console.log(error));
});

function msg() {
    alert("Salvo com sucesso!");
    window.location.reload(true);
}

fetch("http://localhost:8080/usuarios").then((data) => {
    return data.json();
}).then((todosUsuarios) => {
    let data1 = "";//aqui é uma variavel que  vai receber o que veio la na tabela no html; essa variavel começa vazio
    todosUsuarios.map((values) => { //agora, preciso que todosUsuarios, o que chegou, setar na variavel data1, com uma funça +=. cada dado que chegar, data mais a quatidade de informação que chegou
        data1 += ` 
                <tbody> 
                <tr>
                <th scope="row">${values.id} </td>
                <td>${values.nomeUsuario}</td>
                <td>${values.dataNascimento}</td>
                <td>${values.cpf} </td>
                <td>${values.email}</td>
                </tr>
                </tbody>
                `
    })
    document.getElementById("usuarioDados").innerHTML = data1; //essa linha é que vai listar na tela os dados trazido em data1+=
    console.log(todosUsuarios);
})
