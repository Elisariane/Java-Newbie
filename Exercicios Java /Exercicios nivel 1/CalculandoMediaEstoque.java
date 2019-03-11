package exerciciosJavaNivel1;

import java.util.Scanner;

public final class CalculandoMediaEstoque {

	public static void main(String[] args){
		/**Faça um programa para calcular o estoque médio de uma peça, sendo que:
		 * ESTOQUE MÉDIO = (QUANTIDADE_MÍNIMA + QUANTIDADE_MÁXIMA) / 2.
		 */
		
		int qtde_min, qtde_max, med_estoque;
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe a quantidade máxima do estoque: ");
		qtde_max = entrada.nextInt();
		
		System.out.println("Informe a quantidade minima do estoque: ");
		qtde_min = entrada.nextInt();
		
		med_estoque = ((qtde_min + qtde_max)/2);
		System.out.println("A média do estoque é: "+med_estoque);
		
		
		
	}
}
