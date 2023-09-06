/* O seu programa deve receber a nota do aluno pelo console e depois 
você vai fazer uma operação lógica para saber se a nota do aluno 
é maior que 70. O resultado dessa operação lógica deve ser atribuido 
a uma variável do tipo Boolean.
Por último, você deve utilizar a variável do tipo Boolean com a 
estrutura de decisão if para imprimir, no console, uma mensagem 
que vai dizer se o aluno passou ou não passou.
*/
package CursoLogicaCapitulo03;

import java.util.Scanner;

public class VerificaSeAlunoPassouDeAno {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("****** Verifica se Aluno Passou de Ano ******");

		System.out.print("Informe a Nota do Aluno : ");
		Double nota = scanner.nextDouble();

		Boolean passouDeAno = nota >= 70;

		if (passouDeAno) {
			System.out.println("Aluno passou de Ano !!!");
		} else {
			System.out.println("Aluno NÃO passou de Ano !!!");
		}

		scanner.close();
	}

}
