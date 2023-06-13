package ListaA.bola;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Insira por favor a circunferência da bola: ");
        Double circuferencia = sc.nextDouble();

        System.out.println("Insira por favor a cor da bola: ");
        String cor = sc.next();

        System.out.println("Insira por favor a marca da bola: ");
        String marca = sc.next();

        System.out.println("Insira por favor o material da bola: ");
        String material = sc.next();

        System.out.println("Insira por favor a velocidade da bola: ");
        Double velocidade = sc.nextDouble();

        Bola bola1 = new Bola(circuferencia, cor, marca, material, velocidade);

        bola1.mostraCor();

        bola1.trocaCor("Preto");

    }
}
