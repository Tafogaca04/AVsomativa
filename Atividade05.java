package AVsomativa;

import java.util.Scanner;

public class Atividade05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner (System.in);


		String carro [] = new String [6];


		for (int i=0; i<6; i++) {
			System.out.println("Informe o " +" "+ i +" "+ " nome do carro " );
			carro[i] = ler.next();

		}
		for (int i=0; i<6; i++) {
			System.out.println("Ordem dos carros são:"+ "/" + i + "-" + carro [i]+"/");
		}
		ler.close();
	}

}


