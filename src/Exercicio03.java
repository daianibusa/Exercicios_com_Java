/* Escreva um algoritmo para ler as dimensões de um retângulo (base e altura),
calcular e escrever a área do retângulo. */

import java.util.Scanner;

public class Exercicio03 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor da base do retângulo: ");
        double base = scan.nextDouble();

        System.out.println("Informe o valor da altura do retângulo: ");
        double altura = scan.nextDouble();

        System.out.println("A área do retângulo é = " + (base * altura));
    }
}
