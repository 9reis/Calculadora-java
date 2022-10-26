package com.calc_app.main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Double num[] = new Double[3];
		 Scanner input = new Scanner(System.in);
		 int operador = 0;
		 char cont;
		 
		//Main m = new Main();
		 
		do{ System.out.println("=== OPERACOES === \n\n"
				+ "1: Adicao" 
				+ "\n2: Subtracao"
				+ "\n3: Divisão"
				+ "\n4: Multiplicacao"
				+ "\n\n================="
				);
		operador = input.nextInt();
		System.out.println();
		
		System.out.print("Numero 1: ");
		num[0]  = input.nextDouble();
		
		System.out.print("Numero 2: ");
		num[1] = input.nextDouble();
		
		System.out.println();
		if(operador == 1 ) {
			num[2] = adi(num[0],num[1]);
			System.out.println("****************");
			System.out.println("RESULT = " + num[2]);
			System.out.println("****************");
		}else if(operador == 2) {
			num[2] = sub(num[0],num[1]);
			System.out.println("****************");
			System.out.println("RESULT = " + num[2]);
			System.out.println("****************");
		}else if(operador == 3) {
			num[2] = div(num[0],num[1]);
			System.out.println("****************");
			System.out.println("RESULT = " + num[2]);
			System.out.println("****************");
		}else {
			num[2] = mult(num[0],num[1]);
			System.out.println("****************");
			System.out.println("RESULT = " + num[2]);
			System.out.println("****************");
		}
		
		System.out.println();
		System.out.println("CONTINUE? (s/n)");
		
		cont = input.next().charAt(0);
		System.out.println();
		
		}while(cont != 'n');
			

		//System.out.println("****************");

		//System.out.println("****************");
	
		input.close();
	}
	
	public static Double adi(Double num_1, Double num_2) {
		return num_1 + num_2;
	}
	
	public static Double sub(Double num_1, Double num_2) {
		return num_1 - num_2;
	}
	
	public static Double div(Double num_1, Double num_2) {
		return num_1 / num_2;
	}
	
	public static Double mult(Double num_1, Double num_2) {
		return num_1 * num_2;
	}
	
}
