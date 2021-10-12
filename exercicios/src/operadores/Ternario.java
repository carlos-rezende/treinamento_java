package operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double media = 8.6;
		String resultadoFinal = media >= 7.0 ?
				" Aprovado" : " em Recuperação";
		
		System.out.println(" O aluno esta " + resultadoFinal);
		
		double nota = 9.9;
		boolean BomComportamento = true;
		boolean PassouPorMedia = nota >= 7; 
		boolean TemDesconto = BomComportamento && PassouPorMedia;
		String resultado = TemDesconto ? "Sim." : "Nao.";
		
		System.out.printf(" Tem desconto? %s", resultado);
	}

}
