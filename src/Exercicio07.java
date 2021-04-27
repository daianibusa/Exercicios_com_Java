/* O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e
dos impostos (aplicados ao custo de fábrica). Supondo que o percentual do distribuidor seja de 28% e
os impostos de 45%, escrever um algoritmo para ler o custo de fábrica de um carro,
calcular e escrever o custo final ao consumidor. */

import java.util.Scanner;

public class Exercicio07 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Inform o valor do custo de fábrica: ");
        double custoFabrica = scan.nextDouble();

        double custoFabricaEImpostos = (custoFabrica * 0.45) + custoFabrica;
        double valorDistribuidor =  (custoFabricaEImpostos * 0.28) + custoFabricaEImpostos;
        double lucroDistribuidor = valorDistribuidor - custoFabricaEImpostos;

        System.out.println("O custo de fábrica com impostos é de R$ " + custoFabricaEImpostos);
        System.out.println("O valor de venda do veículo é de R$ " + valorDistribuidor) ;
        System.out.println("O lucro do distribuidor é de R$ " + lucroDistribuidor);

    }
}
