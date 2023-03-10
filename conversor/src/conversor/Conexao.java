package conversor;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.apache.hc.client5.http.fluent.Content;
import org.apache.hc.client5.http.fluent.Request;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Conexao {

	private static Map<String, Float> cotacoes = new HashMap<String, Float>();

	public static boolean conexao() {

		try {
			// Estabelece uma conexão com a API
			Content content = Request.get(
					"https://exchange-rates.abstractapi.com/v1/live/?api_key=3c8f647e33c34cf6997903f760bb5ec1&base=USD")
					.execute().returnContent();
			JSONParser parser = new JSONParser();
			JSONObject jsonObject = (JSONObject) parser.parse(content.toString());
			// Faz o tratamento dos dados recebidos para ficarem do formato desejado
			String cot = jsonObject.get("exchange_rates").toString();
			String[] cota = cot.split(",");
			String[] cotac = null;

			for (int i = 0; i < cota.length; i++) {

				cotac = cota[i].split(":");
				for (int c = 0; c < cotac[0].length(); c++) {

					if (cotac[0].charAt(0) < 65 || cotac[0].charAt(0) > 90) {

						cotac[0] = cotac[0].substring(1);
					}

					if (cotac[0].charAt(cotac[0].length() - 1) < 65 || cotac[0].charAt(cotac[0].length() - 1) > 90) {

						cotac[0] = cotac[0].substring(0, (cotac[0].length() - 1));
					}
				}
				for (int c = 0; c < cotac[1].length(); c++) {

					if (cotac[1].charAt(0) < 48 || cotac[1].charAt(0) > 57) {

						cotac[1] = cotac[1].substring(1);
					}

					if (cotac[1].charAt(cotac[0].length() - 1) < 48 || cotac[1].charAt(cotac[1].length() - 1) > 57) {

						cotac[1] = cotac[1].substring(0, (cotac[1].length() - 1));
					}
				}
				// Carrega as cotações
				cotacoes.put(cotac[0], Float.valueOf(cotac[1]).floatValue());
			}
			Medidas.carregaCotacoes(cotacoes);
		} catch (IOException | ParseException ex) {
			String exception = ex.getMessage();
			int reposta = Caixa.caixaException(exception + "Error ao atualizar os dados das cotações de moedas desde o servidor."
					+ System.lineSeparator() + " Verifique sua conexão a internet." + System.lineSeparator()
					+ "Se desejar pode continuar com a conversão de outro tipo de medidas");
			if (reposta != 0) {
				return false;
			}
		}
		return true;

	}

}