package fundamentos.desafios;

import java.util.Scanner;

public class temperaturaConversao {
	
	// programa que converte a temperatura de celsius para fahrenheit.

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.println("Digite a temperatura em Celsius: ");
		 double celsius = scanner.nextDouble();
		 
		 double conversao  = (celsius - 32 ) / 1.8;
		 
		 System.out.print(" valor em farenheit: " + conversao);
		 
		 scanner.close();
		 
	
	}
	
	
	
	
	
	
}
