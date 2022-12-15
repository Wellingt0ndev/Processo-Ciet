import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    /*
    Ao se comparar se uma string é maior que outra, considera-se a ordem alfabética ou lexicográfica. No caso, “abcd” < “adbc” < “bacd”.

Escreva uma função que receba uma string A e retorne uma string B, sendo que B é composta pelos mesmos caracteres que A reordenados.

B deve obedecer às seguintes condições:

Ser maior que A
Ser a menor string possível que cumpra as condições acima
Caso não seja possível encontrar uma string que cumpra as condições, retorne a string “sem reposta”.
Por exemplo:

A = “ab”
Logo, o resultado será “ba”

A = “abcde”
Logo, o resultado será “abced”

A = “ba”
Nesse caso, o resultado será “sem resposta"


     */
    public static void main(String[] args) {
        System.out.println(menorStringMaior("abcde"));
    }

    public static String menorStringMaior(String name) {
        if (name == null || name.length() == 0) {
            return "sem resposta";
        }
        List<String> partial = new ArrayList<>();
        partial.add(String.valueOf(name.charAt(0)));
        for (int i = 1; i < name.length(); i++) {
            for (int j = partial.size() - 1; j >= 0; j--) {
                String s = partial.remove(j);
                for (int k = 0; k <= s.length(); k++) {
                    partial.add(s.substring(0, k) + name.charAt(i) + s.substring(k));
                }
            }
        }
        Collections.sort(partial, Comparator.naturalOrder());
        for (String s : partial) {
            if (s.compareTo(name) > 0) {
                return s;
            }
        }
        return "sem resposta";
    }
}