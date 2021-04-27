/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos, meses e dias
e escreva a idade dessa pessoa expressa em dias. Considerar anos com 365 dias e meses com 30 dias. */


import java.util.Scanner;

public class Exercicio04 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe sua idade em anos: ");
        int anos = scan.nextInt();
        System.out.println("Informe os meses da sua idade: ");
        int meses = scan.nextInt();
        System.out.println("Informe os dias da sua idade: ");
        int dias = scan.nextInt();

        int diasEmAnos = anos * 365;
        int diasEmMeses = meses * 30;

        int quantidadeDeDias = diasEmAnos + diasEmMeses + dias;

        System.out.println("Você já viveu " + quantidadeDeDias + " dias.");

    }
}
