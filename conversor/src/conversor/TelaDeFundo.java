package conversor;

import java.awt.Color;
import java.awt.GraphicsEnvironment;

import javax.swing.JFrame;

public class TelaDeFundo extends JFrame {

	public TelaDeFundo() {

		if (!GraphicsEnvironment.isHeadless()) {
			//Construtor da tela de fundo
			getContentPane().setBackground(Color.BLUE);
			setTitle("CONVERSOR");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setVisible(true);
			setResizable(false);
			setSize(900, 600);
			getContentPane().setLayout(null);
			setLocation(200, 50);

		}
	}

	public static void closeIt(TelaDeFundo TELA) {
		//Fecha a tela de fundo ao sair do programa
		TELA.getContentPane().setVisible(false);
		TELA.dispose();
		System.exit(0);

	}

}