package ListaA.quadrado;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("[------ Criando um quadrado ------]");
        System.out.println("Digite qual o número do lado do quadrado que você deseja: ");
        Double lado = sc.nextDouble();

        Quadrado quadrado = new Quadrado(lado);

        System.out.println("Lado do quadrado: " + quadrado.retornarLado());

        System.out.println("Digite um novo lado: ");
        Double novoLado = sc.nextDouble();

        quadrado.mudarLado(novoLado);

        System.out.println("Novo lado do quadrado é: " + quadrado.retornarLado());

        Double areaQuadrado = quadrado.calcularArea();
        System.out.println("A área do quadrado: " + areaQuadrado);

        }
    }
