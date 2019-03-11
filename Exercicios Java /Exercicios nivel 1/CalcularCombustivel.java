package exerciciosJavaNivel1;

import java.util.Scanner;

public class CalcularCombustivel {

	public static void main(String[] agrs){
		/**Efetuar o cálculo da quantidade de litros de combustível gasta em
		 * uma viagem, utilizando um automóvel que faz 12 Km por litro. Para 
		 * obter o cálculo, o usuário deve fornecer o tempo gasto na viagem e
		 * a velocidade média. Desta forma, será possível obter a distância 
		 * percorrida com a fórmula DISTANCIA = TEMPO * VELOCIDADE.Tendo o valor
		 * da distância, basta calcular a quantidade de litros de combustível
		 * utilizada na viagem com a fórmula: LITROS_USADOS = DISTANCIA / 12.
		 * O programa deve apresentar os valores da velocidade média, 
		 * tempo gasto, a distância percorrida e a quantidade de litros
		 * utilizada na viagem. Dica: trabalhe com valores reais.
		 */
		
		Scanner input = new Scanner(System.in);
		
		double tempo, velocidade, distancia, litros_usados ;
		System.out.println("Digite o tempo gasto na viagem: ");
		tempo = input.nextDouble();
		
		System.out.println("Digite a velocidade media: ");
		velocidade = input.nextDouble();
		
		distancia = tempo * velocidade;
		litros_usados = distancia/12;
		System.out.println("Velocidade média: "+velocidade+"\n"+
		"Tempo gasto: "+tempo+"\n"+"Distância percorrida: "+distancia+
		"\n"+"Litros gastos: "+litros_usados);
		
		
		
	}	
}
