package xlixo1;

public class NumeroDecrescente {
	static int numeroDecrescente(int a) {
		int c=0;
		while (c<a) {
			System.out.println(--a);
		}
		
		return a;
	}

	public static void main(String[] args) {
		
		numeroDecrescente(100);
		}

}
