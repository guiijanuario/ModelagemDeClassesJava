package ListaA.retangulo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a Largura do retângulo: ");
        Double ladoA = sc.nextDouble();

        System.out.println("Digite o comprimento do retângulo: ");
        Double ladoB = sc.nextDouble();


        Retangulo retangulo = new Retangulo(ladoA, ladoB);

        // Retornar os valores dos lados
        Double[] lados = retangulo.retornarLados();
        System.out.println("A largura do retângulo é: " + lados[0]);
        System.out.println("O comprimento do retângulo é: " + lados[1]);


        System.out.println("[---- Vamos mudar os valores dos lados? ---- ]");
        System.out.println("Digite uma nova Largura do retângulo: ");
        Double newLadoA = sc.nextDouble();
        System.out.println("Digite um novo comprimento do retângulo: ");
        Double newLadoB = sc.nextDouble();

        retangulo.mudarLados(newLadoA, newLadoB);

        lados = retangulo.retornarLados();
        System.out.println("A largura do retângulo é: " + lados[0]);
        System.out.println("O comprimento do retângulo é: " + lados[1]);

        System.out.println("[---- Calculo da área do retângulo ---- ]");
        Double areaRetangulo = retangulo.calcularArea();
        System.out.println("Área do retângulo: " + areaRetangulo);

        System.out.println("[---- Calculo do perímetro do retângulo ---- ]");
        Double perimetroRetangulo = retangulo.calcularPerimetro();
        System.out.println("Perímetro do retângulo: " + perimetroRetangulo);

        }
    }
