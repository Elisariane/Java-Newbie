package exerciciosJavaNivel1;

import java.util.Scanner;

public class CelsiusParaFahrenheit {
	public static void main(String[] args){
		/**Ler uma temperatura em graus Celsius e apresentá-Ia convertida em graus Fahrenheit.
		 * A fórmula de conversão de temperatura a ser utilizada é F = (9 * C + 160) / 5, 
		 * em que a variável F representa é a temperatura em graus Fahrenheit e a variável
		 *  C representa é a temperatura em graus Celsius.
		 */
		
			
		Scanner input = new Scanner(System.in);
		
		double f, c;
		
		
		System.out.println("Informe a temperatura em graus Celsius: ");
		c = input.nextDouble();
		
		f = (9 * c + 160)/ 5;
		
		System.out.println("Temperatura "+c+" graus Celsius"+" ==> " +
				" "+"Temeratua "+f+" graus Fahrenheit");
		
		
		
	}

}
