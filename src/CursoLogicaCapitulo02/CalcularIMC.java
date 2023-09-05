package CursoLogicaCapitulo02;

import java.util.Scanner;

public class CalcularIMC {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("***** Calculadora de IMC *****");

		System.out.print("Informe seu Peso (kg) : ");
		Double peso = scanner.nextDouble();

		System.out.print("Informe sua altura em metros : ");
		Double altura = scanner.nextDouble();

		Double multiplicaAltura = altura * altura;

		Double imc = peso / multiplicaAltura;

		System.out.print("Seu IMC é de : " + imc);

		scanner.close();

	}

}
