package ListaA.pessoa;

public class Pessoa {

    String nome;
    Integer idade;
    Double peso = 0.0;
    Double altura;

    public Pessoa(String nome, Integer idade, Double altura) {
        this.nome = nome;
        this.idade = idade;
        this.peso = 0.0;
        this.altura = altura;
    }



    public Integer Envelhevercer(Integer envelhecer){

        Integer idadeOld = this.idade;
        Integer newIdade = idadeOld + envelhecer;
        System.out.println("[----------------------------------------]");
        System.out.println("[-- Calculo do quanto você envelheceu ---]");
        System.out.println("A nova idade é: " + newIdade);
        return envelhecer;
    }

    public Double Engordar(Double engordar){
        Double pesoOld = this.peso;
        Double newPeso = pesoOld + engordar;
        System.out.println("[----------------------------------------]");
        System.out.println("[-------- Quantos você engordou ---------]");
        System.out.println("Você estava pesando antes: " + pesoOld);
        System.out.println("Você está pesando agora depois de engordar: " + newPeso);
        return engordar;
    }

    public Double Emagrecer(Double emagrecer){

        Double pesoOld = this.peso;
        Double newPeso = pesoOld - emagrecer;
        System.out.println("[----------------------------------------]");
        System.out.println("[-------- Quantos você emagreceu --------]");
        System.out.println("Você estava pesando antes: " + pesoOld);
        System.out.println("Você está pesando agora: " + newPeso);
        return emagrecer;
    }

    public Double Crescer() {

        Double crescer = 0.5;
        Double alturaOld = this.altura;
        Double newAltura = 0.0;
        if(alturaOld < 21) {
            newAltura = alturaOld + crescer;
            return newAltura;
        }

        return newAltura;
    }
}
