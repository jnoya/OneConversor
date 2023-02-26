package conversor;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class TiposDeConversao {

	private static Map<String, Integer> tipoDeConversaoComNome = new HashMap<>();

	public TiposDeConversao(int idTipo, String nome) {
		//Construtor 
		tipoDeConversaoComNome.put(nome, idTipo);

	}

	public static String[] getTiposDeConversao() {
		//Retorna um vetor ordenado alfabeticamente
		//com os tipos de conversão disponiveis
		Set<Entry<String, Integer>> associacoes = tipoDeConversaoComNome.entrySet();
		int i = 0;
		String[] r = new String[5];

		for (Entry<String, Integer> associacao : associacoes) {

			r[i] = associacao.getKey();
			i++;

		}
		Arrays.sort(r);

		return r;
	}

	public static int getTipoDeConversao(String nome) {
		//Retorna o identificador de um tipo de conversão
		//para o nome passado por parametro
		Set<Entry<String, Integer>> associacoes = tipoDeConversaoComNome.entrySet();

		for (Entry<String, Integer> associacao : associacoes) {

			if (associacao.getKey() == nome) {

				return associacao.getValue();

			}

		}

		return 0;

	}

}