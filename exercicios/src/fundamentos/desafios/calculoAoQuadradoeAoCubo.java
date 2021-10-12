package fundamentos.desafios;

import java.util.Scanner;

public class calculoAoQuadradoeAoCubo {
	public static void main(String[] args) {
		
		// programa que calcula os numeros ao quadrado e ao cubo
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print(" Digite um valor: ");
		double valor = scanner.nextDouble();
		
		double quadrado = Math.pow(valor, 2);
		
		double cubo = Math.pow(valor, 3);
		
		System.out.print(" O valor ao quadrado é: " + quadrado + "\n O valor ao cubo é: " + cubo);
		
		scanner.close();
	}
		

}
