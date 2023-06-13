package ListaA.quadrado;

public class Quadrado {
    Double lado;

    public Quadrado(Double lado) {
        this.lado = lado;
    }

    public void mudarLado(Double novoLado) {
        this.lado = novoLado;
    }

    public Double retornarLado() {
        return lado;
    }

    public Double calcularArea() {
        return lado * lado;
    }
}
