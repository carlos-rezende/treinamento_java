package fundamentos.desafios;

import java.util.Scanner;

public class equacoesSegundoGrau {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(" Equa??o: ax2 + bx + c = 0 ");
		
		
		System.out.println("\n Digite o valor de A: ");
		int a = scanner.nextInt();
		
		System.out.println("\n Digite o valor de B: ");
		int b = scanner.nextInt();
		
		System.out.println("\n Digite o valor de C: ");
		int c = scanner.nextInt();
		
		
		int delta = (b * b) - (4 * a * c);
		
		
		System.out.printf("\nSua equa??o ?: %dx? + %dx + %d = 0", a, b, c);
		
		System.out.println("\nO Delta ?: " + delta);
		
		double x1 = (-b + Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("O x1 da equa??o e: %.2f " ,x1);
		
		double x2 = (-b - Math.sqrt(delta)) / (2 * a);
		
		System.out.printf("\nO x2 da equa??o ?: %.2f " ,x2);
		
		scanner.close();
	
	}
	

}
