package exerciciosJavaNivel1;

import java.util.Scanner;

public class IdadeEmDias {
	public static void main(String[] args){
		/* Faça um algoritmo que leia a idade de uma pessoa expressa em anos,
		 * meses e dias e escreva a idade dessa pessoa expressa apenas em dias.
		 * Considerar ano com 365 dias e mês com 30 dias.
		 */
		
		Scanner input = new Scanner(System.in);
		
		int idade, meses, dias, idade_dias;
		
		System.out.println("Digite sua idade: ");
		idade = input.nextInt();
		
		System.out.println("Digite os meses: ");
		meses = input.nextInt();
		
		System.out.println("Digite os dias: ");
		dias = input.nextInt();
		
		idade_dias = idade * 365 + meses + 30 * dias;
		System.out.println("Sua idade em dias é equivalente a: "+ idade_dias+" dias");
		
		
		
	}

}
