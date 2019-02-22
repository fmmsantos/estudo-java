package Strings;

public class StringBuferBuilder {
/*Classe StringBuffer e StringBuilder fazer a msm coisa, recomedado usar o StringBuffer é segura em relacao a Treads
 * Conhecer os metodos mais importantes das classes Buffer e Builder
 * CLASSE StringBBuffer e StringBuilder s valores podem ser alterados com seus metodos
 */
	
	
	public static void main(String[] args) {
		
		StringBuffer a = new StringBuffer("1234");
	    System.out.println(a.append(" amor"));
		// metodo delete(int,int) deleta as string de acordo com sua posicao,
		System.out.println(a.delete(2,4));
		//deleta de acordo com o indice
		System.out.println(a.deleteCharAt(2));
		
		
		// método  da classe StringBuilder insert()
		// vai no indece sugerido e muda de acordo com o que se pediu no segundo argumento
		StringBuilder b = new StringBuilder("Deus está conosco");
	//	System.out.println(b.insert(3, 2));// Deus2 está conosco
		System.out.println(b.insert(5,"$$$$$"));
		
		// reverte as posicoes
		StringBuffer c = new StringBuffer("JAVA");
		System.out.println(c.reverse());
		
		// retorna o valor da String
		StringBuffer d = new StringBuffer("amor");
		 System.out.println(d.toString());

	}

}
