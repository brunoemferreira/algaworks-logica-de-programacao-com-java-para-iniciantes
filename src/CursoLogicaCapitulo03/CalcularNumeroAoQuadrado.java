package CursoLogicaCapitulo03;

import java.util.Scanner;

public class CalcularNumeroAoQuadrado {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("****** Calcula Quadrado de um Numero ******");

		System.out.print("Insira um numero : ");

		Double numero = scanner.nextDouble();

		Double numeroQuadrado = numero * numero;

		System.out.print(numero + " elevado ao quadrado é : " + numeroQuadrado);

		scanner.close();

	}

}
