/* Crie um programa que lê, do console, o nome e o sobrenome 
 * de uma pessoa e depois imprime o nome completo. Para isso, 
 * você vai precisar de duas variáveis: a primeira você pode 
 * chamar de "nome" e a segunda de "sobrenome". Por último, 
 * você vai juntar o nome e o sobrenome em uma única impressão.
 */

package CursoLogicaCapitulo03;

import java.util.Scanner;

public class ImprimirNomeCompleto {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("****** Imprimir Nome Completo ******");

		System.out.print("Informar o Nome : ");
		String nome = scanner.nextLine();

		System.out.print("Informar o Sobrenome : ");
		String sobreNome = scanner.nextLine();

		System.out.println("O nome Completo é : " + nome + " " + sobreNome);

		scanner.close();
	}

}
