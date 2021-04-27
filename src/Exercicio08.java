/* Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês,
mais uma comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas.
Escrever um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas,
o salaŕio fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.
 */
import java.util.Scanner;

public class Exercicio08 {


    public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

        System.out.println("Informe o salário do vendedor em R$: ");
        double salarioBruto = scan.nextDouble();
        System.out.println("Informe o valor da comissão que o vendedor recebe por carro vendido em R$: ");
        double comissaoPorCarroVendido = scan.nextDouble();
        System.out.println("Informe o número de carros que o vendedor vendeu: ");
        int numeroCarros = scan.nextInt();
        System.out.println("Informe o valor total das vendas do vendedor em R$: ");
        double valorTotalVendas = scan.nextDouble();

        double comissaoFixa = comissaoPorCarroVendido * numeroCarros;
        double comissaoSobreValorVendas = valorTotalVendas * 0.05;
        double salarioTotal = salarioBruto + comissaoFixa + comissaoSobreValorVendas;

        System.out.println("Total da comissão por carro vendido: R$ " + comissaoFixa);
        System.out.println("Valor da comissão sobre o valor total de vendas efetuadas: R$ "
                + comissaoSobreValorVendas);
        System.out.println("Salário total: R$ " + salarioTotal);
    }
}