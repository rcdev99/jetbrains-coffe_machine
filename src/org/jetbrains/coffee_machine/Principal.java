package org.jetbrains.coffee_machine;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		//Vari�veis necess�rias
		Scanner scanner = new Scanner(System.in);
		//Inicializando sistema
		System.out.println("Seja bem-vindo a sua Coffe-Machine !");
		System.out.println("\nInforme quantas x�caras de caf� deseja: ");
		int qtdXicaras = scanner.nextInt();
		scanner.close();
		System.out.println(infoQtdIngredientesNecessario(qtdXicaras));
	}
	
	/**
	 * Fun��o utilizada para exibir informa��es sobre a quantidade de ingredientes necess�rios para a prepara��o de um dado
	 * n�mero de x�caras de caf�
	 * @return
	 * @param int qtdXicaras n�mero de x�caras a serem preparadas
	 */
	public static String infoQtdIngredientesNecessario(int qtdXicaras) {
		//Instanciando vari�vel que conter� o texto do resualtado
		StringBuilder sb = new StringBuilder();
		//Construindo texto do resultado
		sb.append("Para preparar " + qtdXicaras + " x�caras de caf� s�o necess�rios : ");
		sb.append("\n - " + qtdXicaras * 200 + " ml de �gua");
		sb.append("\n - " + qtdXicaras * 50 + " ml de leite");
		sb.append("\n - " + qtdXicaras * 15 + " g de gr�os de caf�");
		//Retornando informa��o sobre a quantiade necess�ria de ingredientes
		return sb.toString();
	}
}
