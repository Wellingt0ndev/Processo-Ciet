import java.util.*;

public class Main {
    public static void main(String[] args) {
    /*
    Dada um texto qualquer e um lista de queries de pesquisa (sequencia de caracteres), retorne os primeiros K queries mais recorrentes na string, onde K é um parâmetro configurável.

Exemplo:

String: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"

Lista de queries: ["a", "em", "i", "el"]

K: 2

Resultado: ["i", "a"]

Explicação:

Ocorrências de cada termo,"i": 11, "a": 7, "em": 2, "el": 1, com K = 2, retornamos "i" e "a" ordenados conforme a quantidade de ocorrências de cada termo.

Obs: Quando houver queries com quantidades iguais, priorizar o retorno de acordo com a ordem de ocorrência do termo na string.
     */
        System.out.println(calculaTopOcorrenciasDeQueries("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua", Arrays.asList("a", "em", "i", "el"),2));

    }

    public static List<String> calculaTopOcorrenciasDeQueries(String texto, List<String> queries, Integer k) {
        ArrayList<String> ret = new ArrayList<>();
        int[] qtdQueries = new int[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            for (int j = 0; j < texto.length(); j++)
                if (texto.substring(j).startsWith(queries.get(i)))
                    qtdQueries[i]++;
        }

        for (int i = 0; i < Math.abs(k); i++) {
            int maior = 0;
            for (int j = 0; j < qtdQueries.length; j++)
                if (qtdQueries[j] >= qtdQueries[maior])
                    maior = j;
            qtdQueries[maior] = -1;
            ret.add(queries.get(maior));
        }
        return ret;
    }
}

