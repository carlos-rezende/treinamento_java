package fundamentos.desafios;

import java.util.Scanner;

public class conversaoTemperatura2 {
	
	// converter a temperatura de fahrenheit em celsius
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		
		double conversao = fahrenheit * 1.8 + 32 ;
		
		System.out.print("Valor em Celsius: " + conversao);
		
		scanner.close();
		
		
		
		
		
	}

}
