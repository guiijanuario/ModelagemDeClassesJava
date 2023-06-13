package ListaA.pessoa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = sc.next();

        System.out.println("Digite sua idade: ");
        Integer idade = sc.nextInt();

        System.out.println("Digite sua altura: ");
        Double altura = sc.nextDouble();

        Pessoa pessoa = new Pessoa(nome, idade, altura);

        System.out.println("Você deseja colocar o seu peso? (Sim/Não)");
        String respPeso = sc.next();

        if(respPeso.equalsIgnoreCase("sim")){
            System.out.println("Digite o seu peso por favor: ");
            pessoa.peso = sc.nextDouble();
        }

        System.out.println("Você acha que engordou quanto, desde quando você preencheu o cadastro pela ultima vez? ");
        Double engordei = sc.nextDouble();

        System.out.println("Você acha que emagreceu quanto, desde quando você preencheu o cadastro pela ultima vez? ");
        Double emagreci = sc.nextDouble();

        System.out.println("Você acha que faz quanto tempo que preencheu o cadastro?  ");
        Integer atualizaIdade = sc.nextInt();

        pessoa.Engordar(engordei);
        pessoa.Emagrecer(emagreci);
        pessoa.Envelhevercer(atualizaIdade);
        pessoa.Crescer();

        }
    }
