package xlixo1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumeroImparPar {
	public static void main(String[] args) {
		
		int[] par = {1,3,5,7,9,11,13,15,17,19,21,23,25,27,29};
		
		for(int a=0;a<par.length ;a++) {
			System.out.println(par[a]+par[a]);
				
			
		}
		
int[] impar = {0,2,4,6,8,10,12,14,16,18,20,22,24,26,28,30};
		
try {		for(int a=0; a<impar.length;a++) 
			
			System.out.println(impar[a]*impar[a]);
}
			catch(ArrayIndexOutOfBoundsException excec) {
				System.out.println("nao a excecao");
			}
		

		int[] conti = new int[100];
		for(int i=99;i<conti.length;i++) {
			if(i<100) {	
	//		System.out.println("aprendendo java");
		 
			}
			else {
		//		System.out.println("imprima tudo");
				break;
			}
		}
		
	try {	int[] a = new int[3];
		a[4]=1;
		System.out.println(a[0]);	
	}
			
	catch (ArrayIndexOutOfBoundsException excecoes){
		System.out.println("coloque um numero correto");
		
	}
		
	try {Scanner c = new Scanner(System.in);	
	System.out.println("digite sua idade");
	int idade = c.nextInt();
	System.out.println(idade);
	}
		
	catch(Throwable execo) {
		System.out.println("Digite numero sem ser zero");
		
	}
			
//	catch() {
		//System.out.println("Digite apenas numeros");
		
//	}	
	
	
	}
	

}
