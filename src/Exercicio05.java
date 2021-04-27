/* Escreva um algoritmo para ler o número total de eleitores de um município,
o número de votos brancos, nulos e válidos. Calcular e escrever o percentual
que cada um representa em relação ao total de eleitores.  */

import java.util.Scanner;

public class Exercicio05 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o número de eleitores: ");
        int eleitores = scan.nextInt();
        System.out.println("Informe o número de votos válidos: ");
        int votosValidos = scan.nextInt();
        System.out.println("Informe o número de votos brancos: ");
        int votosBrancos = scan.nextInt();
        System.out.println("Informe o número de votos nulos: ");
        int votosNulos = scan.nextInt();

        double percentualVotosValidos = ((double)votosValidos / eleitores) * 100;
        double percentualVotosBranco = ((double)votosBrancos / eleitores) * 100;
        double percentualVotosNulos = ((double)votosNulos / eleitores) * 100;

        System.out.println("O percentual de votos válidor é = " + percentualVotosValidos + "%");
        System.out.println("O percentual de votos brancos é = " + percentualVotosBranco + "%");
        System.out.println("O percentual de votos nulos é = " + percentualVotosNulos + "%");



    }
}
