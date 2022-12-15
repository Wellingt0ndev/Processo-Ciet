import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
    /*Durante uma expedição tecnológica, sua equipe encontrou o que parece ser a senha que lhes dá acesso a um grande tesouro digital. Por sorte, sua equipe é formada pelas pessoas mais feras em programação e vocês rapidamente descobriram como decifrá-la.
Com a possibilidade de que vocês encontrem mais códigos contendo outras senhas, você foi designado à tarefa de desenvolver um algoritmo que decifra os códigos para não precisarem fazer isso de forma manual.
A senha é representada por um número binário de 10 dígitos formado pelo dígito predominante de cada coluna. Caso a coluna tenha a mesma quantidade de dígitos 0 e 1, deve se considerar o número 1.
Exemplo: A primeira coluna da lista tem como dígito predominante o número 1, sendo assim, o primeiro dígito - dos 10 - da senha é 1.
0110100000
1001011111
1110001010
0111010101
0011100110
1010011001
1101100100
1011010100
1001100111
1000011000
Desenvolva um algoritmo que receba um array de valores binários (como o exemplo acima) e retorne a representação decimal da senha.
     */
        System.out.println(calculaNumeroDaSenha(Arrays.asList("0110100000","1001011111","1110001010","0111010101","0011100110","1010011001","1101100100","1011010100","1001100111","1000011000")));
    }

        public static Integer calculaNumeroDaSenha(List<String> senha) {
            int count1 = 0;
            int count0 = 0;
            String senhaMaster = "";
            for (int i = 0; i < 10; i++) {
                for (String senhas : senha) {
                    char c = senhas.charAt(i);
                    if (c == '1') {
                        count1++;
                    } else {
                        count0++;
                    }
                }
                if (count1 >= count0) {
                    senhaMaster += "1";
                } else {
                    senhaMaster += "0";
                }
                count1 = 0;
                count0 = 0;
            }
            int converterSenha = Integer.parseInt(senhaMaster, 2);
            return converterSenha;
        }
    }







