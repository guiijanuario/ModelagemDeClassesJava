package ListaB.jardinagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("[---------------------]");
        System.out.println("[-- Agricultura Gui --]");
        System.out.println("[---------------------]");

        System.out.println("Digite o nome do Jardim que vai receber o orçamento: ");
        String nomeJardim = sc.nextLine();

        System.out.println("Digite quantos metros: ");
        Double qtdMetros = sc.nextDouble();

        System.out.println("Digite quantidade de plantas: ");
        Integer qtdPlantas = sc.nextInt();

        System.out.println("Digite quantos metros de gramas: ");
        Double qtdMetrosGramas = sc.nextDouble();

        System.out.println("Digite valor o Adubo: ");
        Double valorAdubo = sc.nextDouble();

        System.out.println("Digite valor do metro da grama: ");
        Double valorMetroGrama = sc.nextDouble();

        System.out.println("Digite valor corte grama: ");
        Double valorConteGrama = sc.nextDouble();

        Jardinagem jardim = new Jardinagem(nomeJardim, qtdMetros, qtdPlantas, qtdMetrosGramas, valorAdubo, valorMetroGrama, valorConteGrama);
        jardim.usarAdubo(qtdMetros);
        System.out.println("Preço do adubo: R$" + jardim.precoAdubo(qtdMetros));
        System.out.println("Preço do corte de grama: R$" + jardim.precoCorteGrama(qtdMetros, valorMetroGrama));
    }
}
