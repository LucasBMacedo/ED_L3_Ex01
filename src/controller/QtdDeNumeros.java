package controller;

public class QtdDeNumeros {

	public QtdDeNumeros() {
		super();
	}
	public int QtdResultado (int numero) {
		if (numero < 10) {
			return 1; /* Condicao de parada: Quando o numero fornecido for menor que 10 ele vai retornar 1 como digito. 
			Poderá somar também esse 1 com os retornosß else. */
		}
		else {
			return 1 + QtdResultado(numero/10); /* Se o numero for maior que 10, haverá 
			o retorno de 1 + o numero dividido por 10 e ira fazer isso até o numero ser menor que 10. 
			No final, irá somar 1 em todos os retornos e no finbal retornará apenas a parte inteira. */
		}
	}
}