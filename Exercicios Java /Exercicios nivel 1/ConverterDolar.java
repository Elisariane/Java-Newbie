package exerciciosJavaNivel1;

import java.util.Scanner;

public class ConverterDolar {

	public static void main(String[] args){
		/** Faça um programa que:
		*	- Leia a cotação do dólar
		*	- Leia um valor em dólares
		*	- Converta esse valor para Real
		*	- Mostre o resultado
		*/
		
		// Criando a classe Scanner para o usuario digitar 
		Scanner input = new Scanner(System.in);
		
		try {
			
			//declaro todas as variaveis como tipo double
			double cotacao, valor_dolar, valor_real;
			
			//Pedir para o usuario digitar a cotação
			System.out.print("Digite a cotação de dólar atual: ");
			//Atribuindo o que usurio informou na variavel cotacao
			cotacao = input.nextDouble();
			
			//Pedir para usuario digitar quantos dolares possui
			System.out.println("Digite  a quantidade de dólar: ");
			//Atribuindo o que usurio informou na variavel valor_real
			valor_dolar = input.nextDouble();
			
			// Fazendo a conversão de dólar para real
			valor_real = cotacao*valor_dolar;
			
			//Mostrar ao usuario o resultado da conversão
			System.out.println("a conversão de dólar para real é: "+valor_real);
			
		}
		
		//Para resolver erro "Resource leak: 'input' is never closed" que ocorreu no eclipse juno 
		finally{
			// fecha a classe Scanner
			input.close();
		}
		
		
	}
}
