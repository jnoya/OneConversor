package conversor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import java.util.Map.Entry;

public class Medidas {

	private static Map<String, String> nomeComSimbolo = new HashMap<>();
	private static Map<String, Float> valorComSimbolo = new HashMap<>();
	private static Map<String, Integer> nomeComTipo = new HashMap<>();

	public Medidas(String nome, String simbolo, Float valor, int tipo) {
		//Construtor de Medidas
		nomeComSimbolo.put(nome, simbolo);
		valorComSimbolo.put(simbolo, valor);
		nomeComTipo.put(nome, tipo);

	}

	public static void carregaCotacoes(Map<String, Float>cotacoes) {

		//Atualiza os valores das moedas com as cotações recebidas via API
		valorComSimbolo.keySet().forEach(simbolo -> {
			if (cotacoes.containsKey(simbolo)) {
				valorComSimbolo.put(simbolo, cotacoes.get(simbolo));
			}
		});
	}

	public static String[] getMedidasPorTipo(int tipo) {
		//Retorna um vetor ordenado alfabeticamente
		//das medidas existentes para o tipo passado por parametro
		Set<Entry<String, Integer>> associacoes = nomeComTipo.entrySet();
		int i = 0;
		
		for (Entry<String, Integer> associacao : associacoes) {

			if (associacao.getValue() == tipo) {
				i++;
			}

		}
		
		String[] r = new String[i];
		i = 0;
		for (Entry<String, Integer> associacao : associacoes) {
		
			if (associacao.getValue() == tipo) { 
				r[i] = associacao.getKey(); 
				i++;
			}
		
		}
				
		Arrays.sort(r);
		return r;

	}

	public static String getSimbolo(String nome) {
		//Retorna o simbolo para uma determinada medida passada por parametro
		Set<Entry<String, String>> associacoes = nomeComSimbolo.entrySet();

		for (Entry<String, String> associacao : associacoes) {

			if (associacao.getKey() == nome) {

				return associacao.getValue();
			}

		}

		return null;

	}

	public static Float getValor(String idSimbolo) {
		//Retorna o valor para uma determinada medida passada por parametro
		Set<Entry<String, Float>> associacoes = valorComSimbolo.entrySet();

		for (Entry<String, Float> associacao : associacoes) {

			if (associacao.getKey() == idSimbolo) {

				return associacao.getValue();
			}

		}

		return 0f;

	}

}
