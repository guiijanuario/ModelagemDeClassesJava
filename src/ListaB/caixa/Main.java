package ListaB.caixa;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Caixa caixa = new Caixa();

        System.out.println("Bem-vindo ao caixa!");
        System.out.println("Saldo inicial: R$" + caixa.getSaldo());

        System.out.print("Quantos lançamentos deseja fazer? ");
        int quantidadeLancamentos = scanner.nextInt();

        for (int i = 1; i <= quantidadeLancamentos; i++) {
            System.out.print("Lançamento " + i + ": (C)rédito ou (D)ébito? ");
            String tipoLancamento = scanner.next();

            if (tipoLancamento.equalsIgnoreCase("C")) {
                System.out.print("Valor do crédito: R$");
                double valorCredito = scanner.nextDouble();
                caixa.credito(valorCredito);
            } else if (tipoLancamento.equalsIgnoreCase("D")) {
                System.out.print("Valor do débito: R$");
                double valorDebito = scanner.nextDouble();
                caixa.debito(valorDebito);
            }
        }
    }
    }
