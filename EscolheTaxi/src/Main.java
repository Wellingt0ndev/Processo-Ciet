import java.text.DecimalFormat;
import java.util.Locale;

/*
       Um grande amigo seu mora numa cidade pequena, onde existem apenas duas empresas de táxi - a Empresa 1 e a Empresa 2. Ambas mudam suas taxas a cada dia e calculam o valor de suas corridas da seguinte forma: uma taxa fixa mais um valor por quilômetro rodado.
Seu amigo é fisioterapeuta e pega táxis diariamente para visitar seus clientes ao redor da cidade. Você decidiu escrever um código para ajudá-lo a decidir qual empresa escolher para cada uma das corridas, baseado no preço.

Sua função receberá 4 valores: TF1 (a taxa fixa da empresa 1), VQR1 (o valor por quilômetro rodado da empresa 1), TF2 (a taxa fixa da empresa 2), VQR2 (o valor por quilômetro rodado da empresa 2), todos em formato string. Seu retorno deve ser uma string em uma das seguintes formas:

“Tanto faz” - para o caso de o valor das duas empresas para qualquer corrida ser igual
“Empresa 1” - se o valor da Empresa 1 for sempre menor que o da Empresa 2
“Empresa 2” - para o caso contrário do citado acima
“Empresa Xpto quando a distância < N, Tanto faz quando a distância = N, Empresa Ypto quando a distância > N” para o caso de a escolha depender da distância a ser percorrida (onde Xpto e Ypto representa 1 ou 2 e N representa a distância).
Exemplo:
TF1 = 2,50
VQR1 = 1,00
TF2 = 5,00
VQR2 = 0,75
Output:
“Empresa 1 quando a distância < 10.0, Tanto faz quando a distância = 10.0, Empresa 2 quando a distância > 10.0”
        */
public class Main {
    public static void main(String[] args) {
        System.out.println(escolheTaxi("5.0", "0.75", "2.5", "1.50"));

    }

    public static String escolheTaxi(String tf1, String vqr1, String tf2, String vqr2) {
        //Faz com que os números decimais fiquem com "." no lugar da ","
        Locale.setDefault(Locale.US);
        //Inicia a variável km
        float km = 0;
        //Converte as variáveis String para Float
        float taxaFixa1 = Float.parseFloat(tf1);
        float valorKm1 = Float.parseFloat(vqr1);
        float taxaFixa2 = Float.parseFloat(tf2);
        float valorKm2 = Float.parseFloat(vqr2);

        //Faz as verificações de maior, igual ou menor
        if (taxaFixa1 == taxaFixa2 && valorKm1 == valorKm2)
            return "Tanto faz";
        else if ((taxaFixa1 > taxaFixa2 && valorKm1 == valorKm2) || (taxaFixa1 == taxaFixa2 && valorKm1 > valorKm2) || (taxaFixa1 > taxaFixa2 && valorKm1 > valorKm2))
            return "Empresa 2";
        else if (taxaFixa1 < taxaFixa2 && valorKm1 == valorKm2 || taxaFixa1 == taxaFixa2 || taxaFixa1 < taxaFixa2 && valorKm1 < valorKm2)
            return "Empresa 1";
            //Se não entrar em nenhum if ele entra no else e divide a diferença da taxa fixa pela diferença do valor do km.
            // O resultado é a km que tanto faz a empresa 1 ou a empresa 2
        else
            km = ((taxaFixa1 - taxaFixa2) / (valorKm2 - valorKm1));
            //Define o formato dos números dependendo de quantos números tem antes do ponto
            DecimalFormat dm = new DecimalFormat("0.00");
            DecimalFormat dm2 = new DecimalFormat("00.0");
            String n = dm.format(km);
            String n2 = dm2.format(km);
            //Verifica se o resultado tem um número antes do ponto ou dois números.
            if (km > 0 && km <= 9) {
                return "Empresa 1 quando a distância < " + n + ", Tanto faz quando a distância = " + n + ", Empresa 2 quando a distância > " + n;
            } else {
                return "Empresa 1 quando a distância < " + n2 + ", Tanto faz quando a distância = " + n2 + ", Empresa 2 quando a distância > " + n2;
            }
        }
    }


