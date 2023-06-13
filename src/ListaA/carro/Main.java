package ListaA.carro;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de portas: ");
        Integer quantidadePortas = sc.nextInt();

        System.out.println("Digite o modelo do veiculo: ");
        String modelo = sc.next();

        System.out.println("Digite a marca do veiculo: ");
        String marca = sc.next();

        Carro carro = new Carro(quantidadePortas, modelo, marca);

        System.out.println("Você deseja colocar uma potencia do carro diferente que 2.0? (Sim/Não)");
        String respPotencia = sc.next();

        if(respPotencia.equalsIgnoreCase("sim")){
            System.out.println("Digite a potencia por favor favor: ");
            carro.potencia = sc.nextDouble();
        }

        carro.ligarCarro();


        }
    }
