//Escreva um algoritmo para ler um valor (do teclado) e escrever (na tela) o seu antecessor. 

import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe um número: ");
        int numero = scan.nextInt();

        System.out.println("O antecessor de " + numero + " é " + (numero - 1));


    }

}
