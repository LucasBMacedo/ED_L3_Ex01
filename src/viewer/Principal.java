package viewer;

import controller.QtdDeNumeros;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		QtdDeNumeros qtd = new QtdDeNumeros ();
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Insira um número inteiro maior que 0"));
        JOptionPane.showMessageDialog(null, "A quntidade de dígitos de " + numero + " é: " + qtd.qtdResultado(numero) + ".");
	}
}