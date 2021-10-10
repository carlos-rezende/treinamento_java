package operadores;

public class Relacionais {
	public static void main(String[] args) {
		
		int a = 97;
		int b = 'a';
		
		System.out.println(a == b);
		System.out.println(3 >= 4);
		System.out.println(3 < 7);
		System.out.println(3 <= 7);
		System.out.println(3 != 7);
		
		double nota = 7.3;
		boolean BomComportamento = true;
		boolean PassouPorMedia = nota >= 7; 
		boolean TemDesconto = BomComportamento && PassouPorMedia;
		
		System.out.println(" Tem desconto? " + TemDesconto);
	}

}
