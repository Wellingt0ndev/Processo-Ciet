import java.util.Arrays;
import java.util.List;

/*
Você e seu time estão desenvolvendo um sistema de indicações de postos de gasolina que ficam próximos da localização atual do veículo. No modo de direção “viagem”, a funcionalidade a ser desenvolvida é de indicar ao condutor o posto mais distante possível dentro do limite atual de combustível. E caso não exista posto de gasolina, retornar -1

A pessoa responsável por fazer a especificação do sistema informou que você terá as seguintes informações: consumo médio de combustível, quantidade de combustível restante no veículo e um array contendo distâncias dos postos de gasolinas.

Exemplo:
Combustivel (em litros): 2
Consumo médio (km/l): 8
Postos de Gasolina (km): [2, 15, 22, 10.2]
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(ultimaParada(2,8, Arrays.asList(2,15,22,11)));

    }
    public static Integer ultimaParada(Integer combustivel, Integer consumo, List<Integer> postosDeGasolina) {
        Integer kmTotal = combustivel * consumo;
        Integer ultimoPosto = 0;
        for(int i = 0; i <= kmTotal; i++){
            boolean temPosto = postosDeGasolina.contains(i);
            if(temPosto){
                ultimoPosto = i;
            }
        }
        if(ultimoPosto == 0){
            return -1;
        } else {
            return ultimoPosto;
        }
    }
}

