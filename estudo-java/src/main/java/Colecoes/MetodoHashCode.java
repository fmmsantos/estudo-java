package Colecoes;

import zlixo.Maca;

public class MetodoHashCode {
	int numero;
	

	public static void main(String[] args) {
	
		MetodoHashCode met = new MetodoHashCode();
		met.numero=1;
		MetodoHashCode me = new MetodoHashCode();
		me.numero=2;
		System.out.println(met.equals(me));
		System.out.println(met.hashCode());
		
		

	}

}
