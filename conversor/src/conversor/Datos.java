package conversor;

public class Datos {

	public static boolean carregaDatos() {

		boolean a = false;
		// Carrega os tipos de conversão.
		new TiposDeConversao(1, "Moeda");
		new TiposDeConversao(2, "Peso");
		new TiposDeConversao(3, "Longitude");
		new TiposDeConversao(4, "Velocidade");
		new TiposDeConversao(5, "Temperatura");
		// Carrega as medidas.
		new Medidas("Dolar Americano", "USD", 1f, 1);
		new Medidas("Quilograma", "Kg", 1f, 2);
		new Medidas("Metro", "m", 1f, 3);
		new Medidas("Quilometro/hora", "Km/h", 1f, 4);
		new Medidas("Grau Celsius", "C°", 0.2f, 5);
		new Medidas("Real Brasileiro", "BRL", 0f, 1);
		new Medidas("Libra", "lb", 2.20462f, 2);
		new Medidas("Polegada", "''", 39.3701f, 3);
		new Medidas("Milha/hora", "mi/h", 0.621371f, 4);
		new Medidas("Grau Fahrenheit", "°F", 0.6444f, 5);
		new Medidas("Euro", "EUR", 0f, 1);
		new Medidas("Onça", "oz", 35.274f, 2);
		new Medidas("Milimetro", "mm", 1000f, 3);
		new Medidas("Metro/segundo", "m/s", 0.277778f, 4);
		new Medidas("Kelvin", "K", 274.15f, 5);
		new Medidas("Libra esterlina britanica", "GBP", 0f, 1);
		new Medidas("Grama", "g", 1000f, 2);
		new Medidas("Milha", "mi", 0.000621371f, 3);
		new Medidas("Nó", "Nò", 0.539957f, 4);
		new Medidas("Yuan chines", "CNY", 0f, 1);
		new Medidas("Rand da Sul-africano", "ZAR", 0f, 1);
		new Medidas("Ripple", "XRP", 0f, 1);
		new Medidas("Coroa Dinamarquesa", "DKK", 0f, 1);
		new Medidas("Won sul coreano", "KRW", 0f, 1);
		new Medidas("Peso argentino", "ARS", 0f, 1);
		new Medidas("Dolar australiano", "AUD", 0f, 1);
		new Medidas("Bitcoin cash", "BCH", 0f, 1);
		new Medidas("Lev bulgaro", "BGN", 0f, 1);
		new Medidas("Moeda binance", "BNB", 0f, 1);
		new Medidas("Bitcoin", "BTC", 0f, 1);
		new Medidas("Dolar canadiense", "CAD", 0f, 1);
		new Medidas("Franco suizo", "CHF", 0f, 1);
		new Medidas("Coroa da Republica Tcheca", "CZK", 0f, 1);
		new Medidas("Dogecoin", "DOGE", 0f, 1);
		new Medidas("Dinar Argelino", "DZD", 0f, 1);
		new Medidas("Ethereum", "ETH", 0f, 1);
		new Medidas("Dolar de Hong Kong", "HKD", 0f, 1);
		new Medidas("Kuna croata", "HRK", 0f, 1);
		new Medidas("Rupia indonesia", "IDR", 0f, 1);
		new Medidas("Florin hungaro", "HUF", 0f, 1);
		new Medidas("Novo shekel israelense", "ILS", 0f, 1);
		new Medidas("Rupia indiana", "EMR", 0f, 1);
		new Medidas("Coroa islandesa", "ISK", 0f, 1);
		new Medidas("Yen japones", "JPY", 0f, 1);
		new Medidas("Litecoin", "LTC", 0f, 1);
		new Medidas("Dirham marroquino", "MAD", 0f, 1);
		new Medidas("Peso mexicano", "MXN", 0f, 1);
		new Medidas("Ringgit malaio", "MYR", 0f, 1);
		new Medidas("Coroa Norueguesa", "NOK", 0f, 1);
		new Medidas("Dolar de Nova Zelandia", "NZD", 0f, 1);
		new Medidas("Peso filipino", "PHP", 0f, 1);
		new Medidas("Zloti polones", "PLN", 0f, 1);
		new Medidas("Leu romeno", "RON", 0f, 1);
		new Medidas("Rublo russo", "RUB", 0f, 1);
		new Medidas("Coroa sueca", "SEK", 0f, 1);
		new Medidas("Dolar de Singapura", "SGD", 0f, 1);
		new Medidas("Dinar Argelino", "DZD", 0f, 1);
		new Medidas("Baht tailandes", "THB", 0f, 1);
		new Medidas("Lira turca", "TRY", 0f, 1);
		new Medidas("Novo dolar taiwanes", "TWD", 0f, 1);
		a = true;
		return a;

	}

}
