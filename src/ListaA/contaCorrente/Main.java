package ListaA.contaCorrente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o número da sua conta: ");
        Integer numeroConta = sc.nextInt();

        System.out.println("Qual seu nome: ");
        String nomeCorrentista = sc.next();

        System.out.println("Você deseja fazer um deposito? (Sim/Não) ");
        String respDeposito = sc.next();

        Integer saldo = null;
        if (respDeposito.equalsIgnoreCase("sim")){
            System.out.println("Qual valor você deseja depositar? Não aceitamos moedas. ");
            saldo = sc.nextInt();
        }

        ContaCorrente conta = new ContaCorrente(numeroConta, nomeCorrentista);

        System.out.println("[ -------------------------------------------------------- ]");
        conta.depositoConta(saldo);

        System.out.println("Você deseja sacar algum dinheiro? (Sim/Não)");
        String respSaque = sc.next();

        Integer saque = null;
        if (respSaque.equalsIgnoreCase("sim")){
            System.out.println("Qual valor você deseja sacar? Somente notas. ");
            saque = sc.nextInt();
        }

        System.out.println("[ -------------------------------------------------------- ]");
        conta.saqueConta(saque);
        }
    }
