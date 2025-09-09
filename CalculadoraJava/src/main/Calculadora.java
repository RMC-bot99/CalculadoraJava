package calculadora;

/**
 * Classe Calculadora que implementa operações matemáticas básicas.
 * 
 * @author Rodrigo Madeira Cervantes
 * @author Cauan Henrique Silva
 * @version 1.0
 */
public class Calculadora {

	/**
	 * Realiza a operação de soma entre dois números.
	 * 
	 * @param primeiroNumero O primeiro número a ser somado
	 * @param segundoNumero O segundo número a ser somado
	 * @return O resultado da soma
	 */
	public double somar(double primeiroNumero, double segundoNumero) {
		return primeiroNumero + segundoNumero;
	}

	/**
	 * Realiza a operação de subtração entre dois números.
	 * 
	 * @param primeiroNumero O número do qual será subtraído
	 * @param segundoNumero O número que será subtraído
	 * @return O resultado da subtração
	 */
	public double subtrair(double primeiroNumero, double segundoNumero) {
		return primeiroNumero - segundoNumero;
	}

	/**
	 * Realiza a operação de divisão entre dois números.
	 * 
	 * @param dividendo O número a ser dividido
	 * @param divisor O número pelo qual será dividido
	 * @return O resultado da divisão
	 * @throws IllegalArgumentException Se o divisor for zero
	 */
	public double dividir(double dividendo, double divisor) {
		if (divisor == 0.0) {
			throw new IllegalArgumentException("Divisão por zero não é permitida");
		}
		return dividendo / divisor;
	}
}


