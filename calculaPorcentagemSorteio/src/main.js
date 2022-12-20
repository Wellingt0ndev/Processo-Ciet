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
  
      }