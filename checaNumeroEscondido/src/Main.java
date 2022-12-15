import java.util.Objects;

public class Main {
    public static void main(String[] args) {
/*
Dizemos que um número natural X esconde o Y quando, ao apagar alguns algarismos de X, o número Y aparece. Por exemplo, o número 12345 esconde o número 235, uma vez que pode ser obtido ao apagar os números 1 e 4. Por outro lado, ele não esconde o número 154.

A imagem demonstra números: 1,2,3,4,5 todos estão em azul, mas o número 1 e 4 estão com um risco vermelho.

Escreva um código que recebe dois números e que retorna um booleano dizendo se o primeiro esconde o segundo.
 */
        System.out.println(checaNumeroEscondido(12310, 21));

    }

    public static boolean checaNumeroEscondido(Integer numero, Integer numeroOculto) {
        //Converte de inteiro para string
        String texto = String.valueOf(numero);
        String textoOculto = String.valueOf(numeroOculto);
        //Inicia a variável que vai receber o retorno
        String retorno = "";
        //Verifica se as entradas são iguais, se sim, retorna true
        if(numero == numeroOculto)
            return true;
        //Verifica se o número é maior que o número oculto
        if (numero > numeroOculto) {
        //Percorre a string textoOculto por carcatere
            for (int i = 0; i < textoOculto.length(); i++) {
                char b = textoOculto.charAt(i);
        //Percorre a string texto por carcatere
                for (int j = 0; j < texto.length(); j++) {
                    char a = texto.charAt(j);
                    //Compara se o caractere do textoOculto é igual ao do texto, se igual, adiciona na variável retorno e para o loop
                    if (a == b) {
                        retorno += a;
                        break;
                    }
                }
            }
        }
        //Compara se o retorno é igual ao texto oculto
        if (retorno.equals(textoOculto))
            return true;
        else
            return false;
    }
}
