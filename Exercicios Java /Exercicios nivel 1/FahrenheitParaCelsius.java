package exerciciosJavaNivel1;

import java.util.Scanner;

public class FahrenheitParaCelsius {

	public static void main(String[] agrs){
		/**Ler uma temperatura em graus Fahrenheit e apresentá-Ia convertida em graus Celsius. 
		 * A fórmula de conversão de temperatura a ser utilizada é C = (F - 32) * 5 / 9,
		 * em que a variável F é a temperatura em graus Fahrenheit e a variável C é
		 * a temperatura em graus Celsius.
		 */
		
		Scanner input = new Scanner (System.in);
		
		double f, c;
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		f = input.nextDouble();
		
		c= (f -32) * 5 /9;
		
		System.out.println("Temperatura "+f+" graus Fahrenheit"+" ==> " +
				" "+"Temeratua "+c+" graus Celsius");
		
		
		
	}
}
