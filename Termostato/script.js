const campoTemperatura = document.getElementById("temperatura");
const botaoAtualizar = document.getElementById("atualizar");
const retangulo = document.getElementById("retangulo");
const mensagem = document.getElementById("mensagem");

botaoAtualizar.addEventListener("click", function () {

    const temperatura = Number(campoTemperatura.value);

    mensagem.textContent = "";

    if (
        campoTemperatura.value === "" ||
        temperatura < 0 ||
        temperatura > 70
    ) {
        retangulo.style.backgroundColor = "white";
        mensagem.textContent = "Valor inválido";
    }
    else if (temperatura <= 29) {
        retangulo.style.backgroundColor = "lightblue";
    }
    else if (temperatura <= 45) {
        retangulo.style.backgroundColor = "lightyellow";
    }
    else if (temperatura <= 60) {
        retangulo.style.backgroundColor = "lightcoral";
    }
    else {
        retangulo.style.backgroundColor = "darkred";
    }

});
