package AVsomativa;

import java.util.Scanner;

public class Atividade03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		int valor;
		
		
		System.out.print("Informe o valor referente ao dia da semana:");
		valor = ler .nextInt();
		
		switch (valor)  {
		case 1:
			System.out.println("Domingo");
			break;
	    case 2:
	System.out.println("Segunda-feira");
	break;
		
	    case 3:
			System.out.println("Terça-feira");
			break;
			
	    case 4:
			System.out.println("Quarta-feira");
		break;
		
	    case 5:
			System.out.println("Quinta-feira");
		break;
		
	    case 6:
			System.out.println("Sexta-feira");
		break;
		
	    case 7:
			System.out.println("Sábado");
		break;
		
		default:
			System.out.println("Dia inválido,digite novamente");
		}
			
		ler.close();
}


	}


