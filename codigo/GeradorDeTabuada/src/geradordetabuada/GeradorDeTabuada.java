package geradordetabuada;

import java.util.Scanner;

public class GeradorDeTabuada {

	public static void main(String[] args) {
		
		int  contador, limite, resultado, tabuada;
				
		contador = 1;
				
		limite = 100; 
				
		Scanner scan = new Scanner(System.in);
	        System.out.print("Digite qual tabuada você quer: ");
		tabuada = scan.nextInt();
				
                do {//Faça
	   	
			resultado  = tabuada * contador;
			System.out.println(tabuada + " x " + contador + " = " + resultado);
			contador ++;
		
                }while(contador <= limite);//while = enquanto
				
		
		

	}

}
