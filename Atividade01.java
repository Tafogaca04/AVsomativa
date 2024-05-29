package AVsomativa;

import java.util.Scanner;

public class Atividade01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		double valorA,valorB ,soma,divisao,multiplicacao, subtracao;

		//entrada de dados
		System.out.println("Informe o 1° valor");
		double a = ler.nextDouble();

		System.out.println("Informe o 2° valor");
		double b = ler.nextDouble();
		//processamento

		soma = (a+b);

		subtracao = (a-b);

		multiplicacao = (a * b);

		divisao= (a/b);

		// saída
		System.out.println("O resultado da soma é " + soma);
		System.out.println("O resultado da subtracao é " + subtracao);
		System.out.println("O resultado da multiplicacao é " + multiplicacao);
		System.out.println("O resultado da divisao é " + divisao);
		ler.close();
	}

}
