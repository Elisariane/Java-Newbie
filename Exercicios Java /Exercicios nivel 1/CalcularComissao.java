package exerciciosJavaNivel1;

import java.util.Scanner;

public class CalcularComissao {
	public static void main(String[] args){
		/**Faça um programa para pagamento de comissão de vendedores de peças, 
		 * levando-se em consideração que sua comissão será de 5% do total da 
		 * venda e que você tem os seguintes dados:
		 * - Identificação do vendedor
		 * - Código da peça
		 * - Preço unitário da peça
		 * - Quantidade vendida
		 */
		
		Scanner input = new Scanner (System.in);
		String vendedor;
		int cod_peca, qtde_vendida;
		double  preco_uni,comissao;
		
	    System.out.println("Vendedor: ");
	    vendedor = input.next();
	  
	    System.out.println("Código da peça: ");
	    cod_peca = input.nextInt();
	    
	    System.out.println("Preço unitário da peça: ");
	    preco_uni = input.nextInt();
	    
	    System.out.println("Quantidade de peças vendidas: ");
	    qtde_vendida = input.nextInt();
	    
	    comissao = ((preco_uni*qtde_vendida)*0.05);
		
		
		System.out.println("Comissão de "+vendedor+": R$ "+comissao);
		
		
	}

}
