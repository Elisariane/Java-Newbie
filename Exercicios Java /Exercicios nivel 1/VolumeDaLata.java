package exerciciosJavaNivel1;

import java.util.Scanner;

public class VolumeDaLata {
	public static void main(String[] args ){
		/*Calcular e apresentar o valor do volume de uma lata de óleo, utilizando a fórmula:
		 * V = 3.14159 * R * R * A
		 * Onde as variáveis: V, R e A representam respectivamente o volume, o raio e a altura.
		 */
		Scanner input = new Scanner(System.in);
		
		double v, r, a;
				
		System.out.println("Digite o raio da lata: ");
		r = input.nextDouble();
		
		System.out.println("Digite a altura da lata: ");
		a = input.nextDouble();
		
		v = 3.14159 * r * r*a;
		System.out.println("Volume da lata: "+v);
		
				
	}
}
