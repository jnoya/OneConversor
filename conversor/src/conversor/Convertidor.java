package conversor;

public class Convertidor {

	public static float getResultado(String nInicial, String nDe, String nPara, String nDeSimbolo, String nParaSimbolo,
			String nValor) {
		//Faz o calculo para converter temperaturas que é um pouco diferente
		float valor = Float.valueOf(nValor).floatValue();

		if (nInicial == "Temperatura") {

			if (nDe == "Grau Celsius" && nPara == "Grau Celsius") {

				return valor;
			} else if (nDe == "Grau Celsius" && nPara == "Grau Fahrenheit") {

				return valor * 1.8f + 32;

			} else if (nDe == "Grau Celsius" && nPara == "Kelvin") {

				return valor + 273.15f;
			}

			if (nDe == "Grau Fahrenheit" && nPara == "Grau Celsius") {

				return (valor - 32) / 1.8f;
			} else if (nDe == "Grau Fahrenheit" && nPara == "Grau Fahrenheit") {

				return valor;

			} else if (nDe == "Grau Fahrenheit" && nPara == "Kelvin") {

				return (valor - 32) / 1.8f + 273.15f;
			}

			if (nDe == "Kelvin" && nPara == "Grau Celsius") {

				return valor - 273.15f;
			} else if (nDe == "Kelvin" && nPara == "Grau Fahrenheit") {

				return (valor - 273.15f) * 1.8f + 32;

			} else if (nDe == "Kelvin" && nPara == "Kelvin") {

				return valor;
			}

			return 0;
		} else {
			//Faz o calculo para converter as medidas e quantidade seleccionadas
			return (valor / Medidas.getValor(nDeSimbolo)) * Medidas.getValor(nParaSimbolo);

		}

	}

}
