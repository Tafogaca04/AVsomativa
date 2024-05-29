package AVsomativa;

import java.util.Scanner;

public class Atividade04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new  Scanner (System.in);

		int soma =0;
		int valor[] = new int [15];


		for (int i=0; i<15; i++) {
			System.out.println("Informe o " +" "+ i +" "+ " valor " );
			valor[i] = ler.nextInt();


			soma = soma+valor[i];
		}   
		{
			System.out.println("O resultado é " + soma);
		}
		ler.close();
		}
		
	}

