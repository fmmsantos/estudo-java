package Exercicio;

public class ComparaNumero {
	
	public void comparaNumero(int numA, int numB) {
		
		if(numA<numB) {
			System.out.println("Numero A "+numA +" é menor que numero A " +numB);}
		if(numA==numB) {
			System.out.println("Numero A "+numA +" é igual a numero " +numB);}
		else {
				System.out.println("Numero B "+ numB +"menor que numero A " + numB);
				
			}
		}
	
        
      



	public static void main(String[] args) {
      ComparaNumero comparar = new ComparaNumero();
      comparar.comparaNumero(10, 10);
		


	}

}
