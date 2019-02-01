package ControleFluxoExcecoes;

public class ExceptionFinaly {

	public static void main(String[] args) {
		
		int[] num = {2,4,6,8,9,29,54};
		int []demon= {1,3,5,7,9,0};
		
try {		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]+ demon[i] +(num[i]/demon[i]));
		
		}
}
catch(ArithmeticException ex) {
	System.out.println("nao pode dividir por zero");
	
}
finally {
	System.out.println("ffff");
}
	}

}
