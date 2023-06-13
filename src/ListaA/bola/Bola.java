package ListaA.bola;

public class Bola {

    Double circuferencia;
    String cor;
    String marca;
    String material;
    Double velocidade;


    public Bola(Double circuferencia, String cor, String marca,
                String material, Double velocidade) {
        this.circuferencia = circuferencia;
        this.cor = cor;
        this.marca = marca;
        this.material = material;
        this.velocidade = velocidade;
    }

    public void mostraCor(){
        System.out.println("A cor da bola é: " + this.cor);

    }

    public String trocaCor(String cor){

        System.out.println("[---------------------------------]");
        System.out.println("[ A cor da bola antes da mudança é: " + this.cor);
        this.cor = cor;
        System.out.printf("A nova cor é: " + cor);
        return cor;
    }
}


