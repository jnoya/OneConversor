package conversor;

import java.awt.GraphicsEnvironment;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Caixa extends JOptionPane {

	private static final TelaDeFundo TELA = new TelaDeFundo();
	private static ImageIcon icon = new ImageIcon("src/images/conversor.png");

	public static String setCaixa() {

		if (!GraphicsEnvironment.isHeadless()) {
			// Mostra uma caixa com os 5 tipos de conversão disponiveis ordenados
			// alfabeticamente
			// Retorna a opção escolhida ou null se cancelar ou fechar a janela
			String[] tipos = TiposDeConversao.getTiposDeConversao();
			String n = (String) JOptionPane.showInputDialog(TELA, "Escolha uma opção de conversão", "Possibilidades",
					JOptionPane.QUESTION_MESSAGE, icon, tipos, tipos[0]);

			return n;
		}
		return null;

	}

	public static String setCaixa(String etiqueta, String titulo, String[] medidas) {

		if (!GraphicsEnvironment.isHeadless()) {
			//Mostra uma caixa com todas as medidas disponiveis para o tipo 
			//de conversão seleccionado anteriormente ordenado alfabeticamente
			//Retorna a opção escolhida ou null se cancelar o fechar a janela
			String n = (String) JOptionPane.showInputDialog(TELA, etiqueta, titulo, JOptionPane.QUESTION_MESSAGE, icon,
					medidas, medidas[0]);
			return n;
		}
		return null;

	}

	public static String setCaixa2() {

		if (!GraphicsEnvironment.isHeadless()) {
			// Mostra uma caixa solicitando ingresar um valor a ser convertido
			//Valida que o valor seja um numero maior que 0
			//Se ingressa um valor invalido outra caixa se abrirá com uma explicação 
			//e solicitando novamente o ingresso de um valor
			//Retorna a opção escolhida ou null se cancelar o fechar a janela
			String n = (String) JOptionPane.showInputDialog(TELA, "Digite o valor a ser convertido", "Valor",
					JOptionPane.QUESTION_MESSAGE);
			boolean valorValido = false;
			while (!valorValido) {
				if (n == null) {
					break;
				}
				if (Float.valueOf(n).floatValue() > 0) {
					break;
				}
				n = Caixa.setCaixa3();
			}
			return n;
		}
		return null;
	}

	public static String setCaixa3() {

		if (!GraphicsEnvironment.isHeadless()) {
			//Caixa de alerta e explicação para o ingresso de um numero valido
			//Retorna a opção escolhida ou null se cancelar o fechar a janela
			String n = (String) JOptionPane.showInputDialog(TELA, "Digite un número inteiro maior que 0", "Valor",
					JOptionPane.INFORMATION_MESSAGE);
			return n;
		}
		return null;
	}

	public static void mostraResultado(String valor, String de, String para, float resultado) {

		if (!GraphicsEnvironment.isHeadless()) {
			//Janela mostra o resultado da conversão e da a opção de fazer outra ou sair do programa
			JOptionPane.showMessageDialog(TELA,
					"O resultado de converter " + valor + " de " + de + " para " + para + " é " + resultado);
		}

	}

	public static int setCaixaFinal() {

		if (!GraphicsEnvironment.isHeadless()) {
			String[] opcoes = { "Sim por favor. De novo!!", "Não obrigado. Pode fechar " };
			//Da a opção de fazer uma nova conversão ou sair do programa
			int i = JOptionPane.showOptionDialog(TELA, "Voce deseja fazer outra conversão?", "Continuamos?",
					JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, icon, opcoes, opcoes[0]);
			return i;
		}
		return 0;
	}

	public static void nSemDatos() {

		if (!GraphicsEnvironment.isHeadless()) {
			//Informa que não foram carregados os dados
			JOptionPane.showMessageDialog(TELA, "Não foi possivel carregar os datos");
		}
	}

	public static int caixaError(String error) {

		if (!GraphicsEnvironment.isHeadless()) {
			//Caixa mostra erro ocorrido e da possibilidade 
			//de continuar com o que é possivel ou sair do programa
			String[] opcoes = { "Continuar com outra conversão", "Não obrigado. Pode fechar " };

			int i = JOptionPane.showOptionDialog(TELA, error, "Error", JOptionPane.YES_NO_OPTION,
					JOptionPane.QUESTION_MESSAGE, icon, opcoes, opcoes[0]);
			return i;
		}
		return 0;
	}

	public static void fecha() {
		//Fecha o programa
		TelaDeFundo.closeIt(TELA);
	}

}