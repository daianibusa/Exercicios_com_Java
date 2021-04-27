/* Escrever um algoritmo para ler o salário mensal atual de um funcionário e o percentual de reajuste.
Calcular e escrever o valor do novo salário.
 */

import java.util.Scanner;

public class Exercicio06 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Informe o valor do salário do funcionário em R$: ");
        double salario = scan.nextDouble();
        System.out.println("Informe o percentual de reajuste: ");
        double reajuste = scan.nextDouble();

        double novoSalario = salario + (salario * (reajuste/100));

        System.out.println("O novo salário é de R$ " + novoSalario);

    }
}
