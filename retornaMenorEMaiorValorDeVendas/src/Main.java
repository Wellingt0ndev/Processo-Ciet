import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
/*
Você está trabalhando para uma empresa que fornece materiais escolares e precisa da sua ajuda para entrar no mundo digital. Como primeira atividade, você identificou que não existe uma funcionalidade que é muito importante para a empresa ter mais controle sobre os valores dos produtos vendidos. Esta funcionalidade consiste em descobrir o maior e o menor valor dos produtos vendidos em um período de tempo, para cada vendedor.

Os valores das vendas que devem ser consideradas podem variar entre 20 e 500 reais e estão agrupados por vendedores. Além disso, deve-se ignorar as devoluções, que estão indicadas com o valor 0.

A sua função/método deverá receber uma lista vendas agrupadas por vendedores, (e.g. [[200, 100], [300]]) e retornar um array onde a primeira posição contém o menor valor e a segunda posição o maior valor (e.g. [100, 300]).

Mas preste atenção! Algum vendedor pode não ter realizado vendas no período.
 */

public class Main {
    public static void main(String[] args) {
        System.out.println(retornaMenorEMaiorValorDeVendas(Arrays.asList(Arrays.asList(200,100),Arrays.asList(300))));
    }

    public static List<Integer> retornaMenorEMaiorValorDeVendas(List<List<Integer>> tickets) {
        int maior = 0;
        int menor = 501;
        for (List<Integer> vendedor : tickets) {
            for (Integer valorVenda : vendedor) {
                if (valorVenda >= 20 && valorVenda <= 500) {
                    if (valorVenda > maior)
                        maior = valorVenda;
                    if (valorVenda < menor)
                        menor = valorVenda;
                }
            }
        }
        List<Integer> resultado = new ArrayList<>();
        resultado.add(menor);
        resultado.add(maior);
        return resultado;
    }
}