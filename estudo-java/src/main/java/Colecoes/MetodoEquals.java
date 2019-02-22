package Colecoes;
// Metodo Equalns é usado para comparacao
// Classe String e Whepper sobrescrevem esse metodo

public class MetodoEquals {
	private Integer id;
	Integer numero;
	
	
	public Integer getId() {
		this.id = id;
		return id;
		
	}



	public void setId(Integer id) {
		this.id = id;
	}
	
	@Override
	public boolean equals(Object id) {
		if ((id instanceof MetodoEquals) && ((MetodoEquals)id).getId()==this.id) {
		return true;}
		else {
			return false;
	
		}
	

	}		
	
	@Override
	public int hashCode() {
		
		return this.numero=2 ;
	}
	
	
	public static void main(String[] args) {
	
		String a = "Sou";
		String b = "você";
		
		String c = new String("Sou");
		//System.out.println(c==a);
		
		//MetodoEquals m = new MetodoEquals("nao sei");
	//	MetodoEquals n = new MetodoEquals("nao sei");
	//	System.out.println(m.equals(n));
		
	//	MetodoEquals m = new MetodoEquals(5);
		//MetodoEquals n = new MetodoEquals(5);
	//	System.out.println(m.equals(n));
		
	try {	MetodoEquals di = new MetodoEquals();
		di.id=10;
		di.id=10;
		System.out.println(di.equals(di));
		MetodoEquals ti = new MetodoEquals();
		di.id=10;
		System.out.println(di.equals(null));
	}
	catch(NullPointerException nul) {
		System.out.println("Digite um numero válido.");
	}
	MetodoEquals mer = new MetodoEquals();
	mer.setId(123);
	System.out.println(mer.equals(mer));
	MetodoEquals mt = new MetodoEquals();
	mt.setId(1234);
	System.out.println(mer.equals(mt));
	System.out.println(mt.hashCode());
	System.out.println();
	}



	
	

}
