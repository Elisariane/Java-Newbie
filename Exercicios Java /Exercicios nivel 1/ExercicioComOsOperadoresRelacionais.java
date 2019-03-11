package exerciciosJavaNivel1;

import java.util.Scanner;

public class ExercicioComOsOperadoresRelacionais {
	public static void main(String[] args){
		/*Escrever um programa que leia dois números inteiros e mostre todos os relacionamentos
		 * de ordem existentes entre eles. Os relacionamentos possíveis são:
		 *  Igual, Não igual, Maior, Menor, Maior ou igual, Menor ou igual
		 */
		
		Scanner input = new Scanner (System.in);
		
		int num1, num2;
		
		System.out.println("Digite o primeiro número: ");
		num1 = input.nextInt();
		
		System.out.println("Digite o primeiro número: ");
		num2 = input.nextInt();
		boolean igual =  num1 == num2;
		boolean diferente =  num1!=num2;
		boolean maior = num1>num2;
		boolean menor = num1<num2;
		boolean maiorIgual = num1>=num2;
		boolean menorIgual = num1<=num2;
		System.out.println(num1+"=="+num2+" = "+ igual);
		System.out.println(num1+"!="+num2+" = "+ diferente);
		System.out.println(num1+">"+num2+" = "+ maior );
		System.out.println(num1+"<"+num2+" = "+ menor );
		System.out.println(num1+">="+num2+" = "+ maiorIgual);
		System.out.println(num1+"<="+num2+" = "+ menorIgual);
		
		
		
	}

}
