package fundamentos.desafios;

import java.util.Scanner;

public class calculoIMC {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Digite o peso: ");
		double peso = scanner.nextDouble();
		
		System.out.printf("Digite a altura: ");
		double altura = scanner.nextDouble();
		
		double imc = peso / ( altura * altura );
		
		System.out.print("IMC: " + imc);
		
		scanner.close();
		
		
	}
	
	

}
