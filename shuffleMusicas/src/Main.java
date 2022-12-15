import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    /*
    Sua equipe está trabalhando em um app de streaming de músicas e uma das funcionalidades é criar um embaralhador de músicas. Uma pesquisa feita pela equipe de UX (experiência do usuário) mostrou que essa é uma das funcionalidades mais importantes para os usuários e por isso foi priorizada a criação de um experimento para testar a melhor solução.

A ideia é criar vários embaralhadores diferentes e realizar um teste com partes dos usuários (chamado de teste A/B), onde cada grupo de usuários selecionado recebe uma versão e através de pesquisas e métricas de utilização saberemos qual terá a maior aceitação.

Sua tarefa será desenvolver um desses embaralhadores. Você deve criar uma função que receberá uma lista de pesos que representa as músicas mais ouvidas pelo usuário. Sua função deve retornar uma lista organizada intercalando as músicas mais ouvidas com as músicas menos ouvidas. Por exemplo:

Na situação onde a lista de pesos é: [2, 10, 5, 3] sua função deverá retornar [10, 2, 5, 3]
     */
    public static void main(String[] args) {
        System.out.println(shuffleMusicas(Arrays.asList(2,10,5,3)));
    }
    public static List<Integer> shuffleMusicas(List<Integer> musicasTocadas) {
        List<Integer> organizada = new ArrayList<>();
        Collections.sort(musicasTocadas);
        int i = 0;
        for (int r = musicasTocadas.size() - 1; i < musicasTocadas.size() / 2; i++, r--) {
            organizada.add(musicasTocadas.get(r));
            organizada.add(musicasTocadas.get(i));
        }
        if (musicasTocadas.size() % 2 == 1) {
            organizada.add(musicasTocadas.get(i));
        }
        return organizada;
    }
}