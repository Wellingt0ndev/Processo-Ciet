function calculaTopOcorrenciasDeQueries(texto,queries,k) {
    //Pega os termos e itera
    const queryOcurrences = queries.map(querie => {
    //Expressão regular serve para criar uma chave de identificação
    const regex = new RegExp(querie, 'g');
    //Atribui os match para as ocorrencias dentro do texto
    const res = texto.match(regex);
    //retorna um objeto com o termo e a quantidade de vezes que encontrou no texto
       return { querie, length: res.length };
    });
    //Faz a ordenação pelo tamanho do maior para o menor
    const sortedQueryOcurrences = queryOcurrences.sort((a, b) => b.length - a.length);
    //retorna o array de termos ordenados, corta o array de acordo com o parametro k e itera com o valor desejado
    return sortedQueryOcurrences.slice(0, k).map(item => item.querie);
  }