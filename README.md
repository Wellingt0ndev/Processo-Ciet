<h1 align="center"> Processo seletivo para estágio CI&T</h1>

Esses exercícios fazem parte da primeira fase do processo seletivo para estágio na empresa CI&T.

>calculaNumeroDaSenha: 
```
Durante uma expedição tecnológica, sua equipe encontrou o que parece ser a senha que lhes dá acesso a um grande tesouro digital. Por sorte, sua equipe é formada pelas pessoas mais feras em programação e vocês rapidamente descobriram como decifrá-la.
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
```
> calculaPorcentagemSorteio: 
```
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
```
>calculaTopOcorrenciasDeQueries: 
```
Dada um texto qualquer e um lista de queries de pesquisa (sequencia de caracteres), retorne os primeiros K queries mais recorrentes na string, onde K é um parâmetro configurável.
Exemplo:String: "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua"
Lista de queries: ["a", "em", "i", "el"]
K: 2
Resultado: ["i", "a"]
Explicação:
Ocorrências de cada termo,"i": 11, "a": 7, "em": 2, "el": 1, com K = 2, retornamos "i" e "a" ordenados conforme a quantidade de ocorrências de cada termo.
Obs: Quando houver queries com quantidades iguais, priorizar o retorno de acordo com a ordem de ocorrência do termo na string.
```
>calculaTotalLeds: 
```
Uma empresa fabrica painéis de LED compostos por quadrados de 1 cm de lado. Nos vértices de cada quadrado fica um LED, sendo que o tamanho de cada painel é escolhido pelo cliente conforme a sua necessidade. A imagem abaixo mostra um painel de 2 cm por 4 cm, composto por 15 LEDs no total.
Atualmente os funcionários desta fábrica perdem muito tempo (que poderia ser utilizado para inovação) com o cálculo manual desses painéis. A alta diretoria da fábrica decidiu então contratar você para evoluir e construir um cálculo automatizado, modernizando assim os sistemas deles.
Considerando um painel de n por m centímetros, desenvolva um código para calcular o número total de LEDs no painel.
A imagem demonstra um painel de leds que possuem 4 quadrados agrupados em cima e 4 embaixo onde em cada ponta possuem 4 pontos vermelhos de led totalizando 15 pontos.
OBS:Os valores da altura e da largura devem ser recebidos por meio de parâmetros
```
> checaNumeroEscondido: 
```
Dizemos que um número natural X esconde o Y quando, ao apagar alguns algarismos de X, o número Y aparece. Por exemplo, o número 12345 esconde o número 235, uma vez que pode ser obtido ao apagar os números 1 e 4. Por outro lado, ele não esconde o número 154.
A imagem demonstra números: 1,2,3,4,5 todos estão em azul, mas o número 1 e 4 estão com um risco vermelho.
Escreva um código que recebe dois números e que retorna um booleano dizendo se o primeiro esconde o segundo.
```
> escolheTaxi: 
```
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
```
>menorStringMaior: 
```
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
```
>retornaMenorEMaiorValorDeVendas:
```
Você está trabalhando para uma empresa que fornece materiais escolares e precisa da sua ajuda para entrar no mundo digital. Como primeira atividade, você identificou que não existe uma funcionalidade que é muito importante para a empresa ter mais controle sobre os valores dos produtos vendidos. Esta funcionalidade consiste em descobrir o maior e o menor valor dos produtos vendidos em um período de tempo, para cada vendedor.
Os valores das vendas que devem ser consideradas podem variar entre 20 e 500 reais e estão agrupados por vendedores. Além disso, deve-se ignorar as devoluções, que estão indicadas com o valor 0.
A sua função/método deverá receber uma lista vendas agrupadas por vendedores, (e.g. [[200, 100], [300]]) e retornar um array onde a primeira posição contém o menor valor e a segunda posição o maior valor (e.g. [100, 300]).
Mas preste atenção! Algum vendedor pode não ter realizado vendas no período.
```
>shuffleMusicas: 
```
Sua equipe está trabalhando em um app de streaming de músicas e uma das funcionalidades é criar um embaralhador de músicas. Uma pesquisa feita pela equipe de UX (experiência do usuário) mostrou que essa é uma das funcionalidades mais importantes para os usuários e por isso foi priorizada a criação de um experimento para testar a melhor solução.
A ideia é criar vários embaralhadores diferentes e realizar um teste com partes dos usuários (chamado de teste A/B), onde cada grupo de usuários selecionado recebe uma versão e através de pesquisas e métricas de utilização saberemos qual terá a maior aceitação.
Sua tarefa será desenvolver um desses embaralhadores. Você deve criar uma função que receberá uma lista de pesos que representa as músicas mais ouvidas pelo usuário. Sua função deve retornar uma lista organizada intercalando as músicas mais ouvidas com as músicas menos ouvidas. Por exemplo:
Na situação onde a lista de pesos é: [2, 10, 5, 3] sua função deverá retornar [10, 2, 5, 3]
```
>ultimaParada: 
```
Você e seu time estão desenvolvendo um sistema de indicações de postos de gasolina que ficam próximos da localização atual do veículo. No modo de direção “viagem”, a funcionalidade a ser desenvolvida é de indicar ao condutor o posto mais distante possível dentro do limite atual de combustível. E caso não exista posto de gasolina, retornar -1
A pessoa responsável por fazer a especificação do sistema informou que você terá as seguintes informações: consumo médio de combustível, quantidade de combustível restante no veículo e um array contendo distâncias dos postos de gasolinas.
Exemplo:
Combustivel (em litros): 2
Consumo médio (km/l): 8
Postos de Gasolina (km): [2, 15, 22, 10.2]
```
