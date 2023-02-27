package conversor;

public class Conversor {

	public static void main(String[] args) {

		int nFinal = 0;
		// Carrega dados iniciais
		if (Datos.carregaDatos()) {
			// Mantem o programa funcionando até que explicitamente se le pida para sair
			while (nFinal == 0) {
				// Atualiza os dados iniciais com o carregamento das cotaçôes atuais das moedas
				// via API
				if (Conexao.conexao()) {
					// Solicita o tipo de conversão que quer fazer. Tem 5 opçôes.
					String nInicial = Caixa.setCaixa();
					// Se fecha a janela ou selecciona cancelar pergunta se quer continuar ou sair
					// do programa
					if (nInicial != null) {
						// Carrega o tipo de conversão seleccionado.
						// Carrega todas medidas que há para esse tipo.
						// Abre nova janela com todas as medidas disponiveis ordenadas alfabeticamente
						int tipo = TiposDeConversao.getTipoDeConversao(nInicial);
						String[] MedidasPorTipo = Medidas.getMedidasPorTipo(tipo);
						if (MedidasPorTipo.length != 0) {
							String nDe = Caixa.setCaixa("Escolha uma opção de conversão", "Possibilidades", MedidasPorTipo);
							// Se fecha a janela ou selecciona cancelar pergunta se quer continuar ou sair
							// do programa
							if (nDe != null) {
								// Solicita o valor a ser convertido e valida o valor
								String nValor = Caixa.setCaixa2();
								// Se fecha a janela ou selecciona cancelar pergunta se quer continuar ou sair
								// do programa
								if (nValor != null) {
									// Abre nova janela com todas as medidas disponiveis ordenadas alfabeticamente
									String nPara = Caixa.setCaixa("Escolha para que quer converter", "Para",
											MedidasPorTipo);
									// Se fecha a janela ou selecciona cancelar pergunta se quer continuar ou sair
									// do programa
									if (nPara != null) {
										// Recupera os simbolos das medidas de e para da conversão
										String nDeSimbolo = Medidas.getSimbolo(nDe);
										String nParaSimbolo = Medidas.getSimbolo(nPara);
										// Se os simbolos são válidos mostra o resultado numa caixa e da a opção de
										// fazer outra conversão ou sair do programa
										if (nDeSimbolo != null && nParaSimbolo != null) {
											float resultado = Convertidor.getResultado(nInicial, nDe, nPara, nDeSimbolo,
													nParaSimbolo, nValor);
											Caixa.mostraResultado(nValor, nDe, nPara, resultado);
										} else {
											// Se os simbolos não conseguem ser recuperados significa que os dados foram
											// corrompidos e dá uma menssagem de erro
											nFinal = Caixa.caixaException(
													"Não foram encontrados os simbolos das moedas seleccionadas."
															+ System.lineSeparator() + " Dados corrompidos");
										}
									}
	
								}
	
							}

						}
						else
						{
							nFinal = Caixa.caixaException("Não foram encontradas as medidas para o tipo seleccionado."
								+ System.lineSeparator() + "Dados corrompidos");
						}
						
					}
					// Mostra a opção de fazer outra conversão ou fechar o programa
					nFinal = Caixa.setCaixaFinal();

				} else {
					// Houve um problema com o carregamento das cotações das moedas e o usuario
					// decididio sair do programa
					break;
				}

			}
			// Sai do programa
			Caixa.fecha();

		} else {
			// Da uma menssagem de que não consiguiu carregar nenhum dato e sai do programa
			Caixa.nSemDatos();

		}

	}

}
