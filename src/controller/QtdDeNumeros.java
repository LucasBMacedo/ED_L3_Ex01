package controller;

public class QtdDeNumeros {

	public QtdDeNumeros() {
		super();
	}
	
	public int qtdResultado (int numero) {
		if (numero < 10) {
			return 1; 
		}
		return 1 + qtdResultado(numero/10);
	}
}