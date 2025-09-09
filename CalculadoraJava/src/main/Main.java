package calculadora;

import java.util.Scanner;

/**
 * Classe principal que demonstra o uso da Calculadora.
 * 
 * @author Rodrigo Madeira Cervantes
 * @author Cauan Henrique Silva
 * @version 1.0
 */
public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		System.out.println("=== CALCULADORA JAVA ===");
		System.out.println("Bem-vindo à calculadora!");
		
		try {
			// Exemplo com valores fixos
			System.out.println("\n--- Exemplo com valores fixos ---");
			double a = 12;
			double b = 4;
			
			System.out.println("Valores: " + a + " e " + b);
			System.out.println("Soma: " + calc.somar(a, b));
			System.out.println("Subtração: " + calc.subtrair(a, b));
			System.out.println("Multiplicação: " + calc.multiplicar(a, b));
			System.out.println("Divisão: " + calc.dividir(a, b));
			
			// Exemplo com entrada do usuário
			System.out.println("\n--- Calculadora interativa ---");
			System.out.print("Digite o primeiro número: ");
			double num1 = scanner.nextDouble();
			
			System.out.print("Digite o segundo número: ");
			double num2 = scanner.nextDouble();
			
			System.out.println("\nResultados:");
			System.out.println(num1 + " + " + num2 + " = " + calc.somar(num1, num2));
			System.out.println(num1 + " - " + num2 + " = " + calc.subtrair(num1, num2));
			System.out.println(num1 + " * " + num2 + " = " + calc.multiplicar(num1, num2));
			
			// Tratamento especial para divisão
			try {
				System.out.println(num1 + " / " + num2 + " = " + calc.dividir(num1, num2));
			} catch (IllegalArgumentException e) {
				System.out.println("Erro: " + e.getMessage());
			}
			
		} catch (Exception e) {
			System.out.println("Erro inesperado: " + e.getMessage());
		} finally {
			scanner.close();
			System.out.println("\nObrigado por usar a calculadora!");
		}
	}
}


