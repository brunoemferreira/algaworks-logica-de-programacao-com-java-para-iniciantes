package CursoLogicaCapitulo03;

public class TipoLogico {

	public static void main(String[] args) {
		Boolean variavelVerdadeira = true;
		System.out.println("Variável verdadeira: " + variavelVerdadeira);
		
		Boolean variavelFalse = false;
		System.out.println("Variável Falsa: " + variavelFalse);

		System.out.println("-------------------------------------------");
		
		Integer idade = 20;
		
		Boolean podeTirarCarteira = idade >= 18;
		
		if (podeTirarCarteira) {
			System.out.println("Sim! Ele(a) pode tirar carteira.");
		} else {
			System.out.println("Não! Ele(a) não pode tirar carteira.");
		}
		
		System.out.println("Pode tirar carteira ? " + podeTirarCarteira);
	}

}
