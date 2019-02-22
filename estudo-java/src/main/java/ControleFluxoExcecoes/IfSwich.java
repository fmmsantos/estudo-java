package ControleFluxoExcecoes;

import java.util.Scanner;

public class IfSwich {
	
public static void main(String[] args) {
		
int n = 0;
		
	Scanner can = new Scanner(System.in);
System.out.println("digite um numero de 1 a 5");

	
int numero = can.nextInt();

	switch(numero) {
	
	case 1: {
		System.out.println("numero 1");
		break;
	}
	case 2: {
		System.out.println("numero 2");
		break;
	}
	
    
	case 3: {
	System.out.println("numero 3");
     break;
      
	}
	
	
 }	
	
int[] c = {1,2,3,4,5,6};
for(int a=0;a<c.length; a++) {
	System.out.println(c[a]);
	
}
for(int a:c) {
	System.out.println(a);
}
}
}	

	 
  


