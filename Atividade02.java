package AVsomativa;

import java.util.Scanner;

public class Atividade02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		   double base, altura,area;
	       Scanner ler = new Scanner (System.in);
	       
	       System.out.print("Informe o valor do tamanho da base do triângulo:");
	       base = ler.nextDouble();
	    
	       System.out.print("Informe o valor do tamanho da altura do triângulo:");
	       altura = ler.nextDouble();
	       
	       //processamento
	       
	       area = (base*altura)/2;
	       
	       //saída
	       System.out.print("O resultado da área do triângulo é:" + area);
	       ler.close();
	}

}
