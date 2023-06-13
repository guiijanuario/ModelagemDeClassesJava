package ListaA.carro;

public class Carro {

    Integer quantidadePortas;
    String modelo;
    String marca;
    Double potencia;

    public Carro(Integer quantidadePortas, String modelo, String marca, Double potencia) {
        this.quantidadePortas = quantidadePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = potencia;
    }

    public Carro(Integer quantidadePortas, String modelo, String marca) {
        this.quantidadePortas = quantidadePortas;
        this.modelo = modelo;
        this.marca = marca;
        this.potencia = 2.0;
    }

    public void ligarCarro() {
        System.out.println("O carro é um " + marca + " " + modelo + " com " + quantidadePortas + " portas, com " + potencia + " de potência " + "foi ligado.");
    }
}
