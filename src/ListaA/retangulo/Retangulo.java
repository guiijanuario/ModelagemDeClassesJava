package ListaA.retangulo;

public class Retangulo {
    Double ladoA;
    Double ladoB;

    public Retangulo(Double ladoA, Double ladoB) {
        this.ladoA = ladoA;
        this.ladoB = ladoB;
    }

    // Método para mudar o valor dos lados
    public void mudarLados(Double novoLadoA, Double novoLadoB) {
        this.ladoA = novoLadoA;
        this.ladoB = novoLadoB;
    }

    // Método para retornar o valor dos lados
    public Double[] retornarLados() {
        Double[] lados = {ladoA, ladoB};
        return lados;
    }

    // Método para calcular a área do retângulo
    public Double calcularArea() {
        return ladoA * ladoB;
    }

    // Método para calcular o perímetro do retângulo
    public Double calcularPerimetro() {
        return 2 * (ladoA + ladoB);
    }
}
