package exerciciosJavaNivel1;

import java.util.Scanner;

public class MultiplicandoESomando {

	public static void main(String[] args){
		/**Ler quatro valores numéricos inteiros e apresentar o resultado dois a dois
		 *  da adição e multiplicação entre os valores lidos, baseando-se na
		 * utilização do conceito de propriedade distributiva. Dica: se forem 
		 * lidas as variáveis A, B, C e D, devem ser somados e multiplicados 
		 * os valores de A com B, A com C e A com D; depois B com C, B com D e 
		 * por último C com D. Note que para cada operação serão utilizadas seis 
		 * combinações. Assim sendo, devem ser realizadas doze operações de 
		 * processamento, sendo seis para as adições e seis para as multiplicações.
		 */
		
		Scanner input = new Scanner (System.in);
		
		int a, b, c, d;
		System.out.println("Digite o 1º número: ");
		a = input.nextInt();
		
		System.out.println("Digite o 2º número: ");
		b = input.nextInt();
		
		System.out.println("Digite o 3º número: ");
		c = input.nextInt();
		
		System.out.println("Digite o 4º número: ");
		d = input.nextInt();
		
		System.out.println("Adição de todos os numeros...");
		System.out.println(a+" + "+b+" = "+(a+b));
		System.out.println(a+" + "+c+" = "+(a+c));
		System.out.println(a+" + "+d+" = "+(a+d));
		System.out.println(b+" + "+c+" = "+(b+c));
		System.out.println(b+" + "+d+" = "+(b+d));
		System.out.println(c+" + "+d+" = "+(c+d));
		
		System.out.println("M de todos os numeros...");
		System.out.println(a+" * "+b+" = "+(a*b));
		System.out.println(a+" * "+c+" = "+(a*c));
		System.out.println(a+" * "+d+" = "+(a*d));
		System.out.println(b+" * "+c+" = "+(b*c));
		System.out.println(b+" * "+d+" = "+(b*d));
		System.out.println(c+" * "+d+" = "+(c*d));
	}
}
