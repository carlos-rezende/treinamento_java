package fundamentos.desafios;

import java.util.Scanner;


public class alturaTriangulo {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.print("Digite uma Base: ");
		double base = scanner.nextDouble();
		
		System.out.print("Digite a Altura: ");
		double altura = scanner.nextDouble();
		
		double area = (base * altura) / 2;
		
		System.out.print("A ?rea do triangulo ?: " + area);
		
		scanner.close();
	}

}
