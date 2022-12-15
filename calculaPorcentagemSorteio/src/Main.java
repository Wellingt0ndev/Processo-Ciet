import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    /*
    Uma famosa empresa de streams de jogos quer fornecer para seus streamers um mecanismo para que eles possam realizar sorteios nas suas lives de formas a dar mais chances para seus fãs mais fiéis. Você foi contratado com a missão de ajudar a automatizar esse sorteio, sendo que ele deve seguir as seguintes regras:

A chance de uma pessoa ser sorteada é diretamente proporcional às horas de conteúdo que ela assistiu naquele canal. Assim sendo, uma pessoa que ficou 20 horas acompanhando esse streamer tem o dobro de chances de ser sorteado do que uma pessoa que o assistiu durante 10 horas, se ambas não forem assinantes pagos. O número de horas é recebido em minutos e é sempre arredondado para cima, ou seja:

181 minutos = 4 horas
239 min = 4h
180 min = 3h
Se você possui uma assinatura paga da plataforma, suas chances são dobradas. Assim, no caso acima, se a pessoa que assistiu 10 horas for assinante premium e a que assistiu 20 horas não, ambos terão a mesa chance no sorteio

Assuma que você vai receber os dados de horas assistidas e de assinaturas em dois vetores, no modelo mostrado abaixo:

assinante = [True, False, False, False, True, False, True, True, False, False, False]
minutos_assistidos = [6144, 2742, 330, 30, 1500, 4032, 24036, 3288, 2076, 24540, 4716]
Considere que as mesmas posições do vetor representam a mesma pessoa. Ex:

A pessoa número 1 é assinante e viu 103 horas de conteúdo
A pessoa número 4 não é assinante e viu meia hora de conteúdo
Escreva um código que retorne um vetor com o percentual de chances de cada uma das pessoas ser sorteada. Retorne os valores arredondados para o inteiro mais próximo.

Exemplo:
assinante = [True, False]
horas_assistidas = [ 60, 120]

Output:
[50, 50]
     */
    public static void main(String[] args) {
        System.out.println(calculaPorcentagemSorteio(Arrays.asList(true, false, false, false, true, false, true, true, false, false, false),
                Arrays.asList(6144, 2742, 330, 30, 1500, 4032, 24036, 3288, 2076, 24540, 4716)));
    }

    public static List<Integer> calculaPorcentagemSorteio(List<Boolean> assinante, List<Integer> minutosAssistidos) {
        //Inicia duas listas
        List<Integer> percentual = new ArrayList<>();
        List<Integer> horas = new ArrayList<>();
        //Inicia a variável soma e resultado
        float soma = 0;
        float resultado = 0;
        //Inicia o iterator para percorrer a List assinante
        Iterator<Boolean> iterator = assinante.iterator();
        //Esse for vai percorrer a List minutosAssistidos
        for (Integer hora : minutosAssistidos) {
            //Verifica se a hora dividido por 60 retorna resto diferente de 0, se sim, ele faz hora dividido por 60
            //para transfomrar em horas e arredonda para menos, e adiciona mais um.
            if (hora % 60 != 0) {
                hora = Math.round(hora / 60) + 1;
                //Caso contrário ele só divide por 60 para transformar os minutos em horas
            } else {
                hora /= 60;
            }
            //Verifica se assinante é igual a true, se sim ele multiplica a hora equivalente por 2
            if (iterator.next() == true) {
                hora *= 2;
            }
            //Soma todas as horas
            soma += hora;
            //Adiciona as horas na List horas
            horas.add(hora);
        }
        //Esse for percorre a List horas
        for (Integer hora : horas) {
            //Divide 100 pela soma e multiplica com a hora de cada loop e adiciona na List percentual
            resultado = (100 / soma) * hora;
            percentual.add(Math.round(resultado));

        }
        return percentual;
    }
}

/* JAVASCRIPT
  function calculaPorcentagemSorteio(assinante, minutosAssistidos) {
  const horas = minutosAssistidos.map((item, index) => {
            // Transforma em horas e arredonda.
    const arredondaHoras = Math.ceil(item / 60);
            return assinante[index] ? arrendondaHoras * 2 : arredondaHoras;
        });

        // Soma todas as horas de assinante arredondadas com bônus incluído
  const totalHoras = horas.reduce(
                (valorAnterior, valorAtual) => valorAnterior + valorAtual
  );

        // Gera um array com o percentual arredondado
        return horas.map(item => Math.round((item / totalHoras) * 100));

    }*/


