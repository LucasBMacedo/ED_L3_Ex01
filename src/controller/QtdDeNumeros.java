package controller;

public class QtdDeNumeros {

	public QtdDeNumeros() {
		super();
	}
	public int QtdResultado (int numero) {
		if (numero < 10) {
			return 1;
		}
		else {
			return 1 + QtdResultado(numero/10);			
		}
	}
}