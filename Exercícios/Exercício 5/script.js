function somar() {
    let n1 = Number(document.getElementById("n1").value);
    let n2 = Number(document.getElementById("n2").value);

    let resultado = n1 + n2;

    let botao = document.getElementById("btn");

    if (resultado % 2 === 0) {
        botao.style.backgroundColor = "blue";
    } else {
        botao.style.backgroundColor = "green";
    }

    alert("Resultado: " + resultado);
}