package OrientacaoObjeto;

import zlixo.Fruta;

public class Static {
/* O comportamento de um membro static não depende de uma instancia.
 * Mais se tiver uma instancia o membro será compartilhada por toda a classe
 * MMembros static so funcionam em metodos static
 * Um método static não consegue acessar uma variavel nao static
 * Para acessar uma variavel static não precisa instanciar nenhum objeto é so chamar pela classe e um ponto.
 * Fruta.saborfrutas();
 * Metodos static NAO podem ser sobrescrito;;
 * Mais podem ser redefinir;
 
 public class Fruta {
	 String nome;
	
	
	  public Fruta(String nome) {
		this.nome=nome;
	}
	  public Fruta() {
		  this(nomesFrutas());
	  }
	 
		static String nomesFrutas() { 
			int x = (int) (Math.random() *3); o metodo so conseguiu acessar o metodo randon() porque é static
			String  name = new String[] {"maca","melao","goiaba"} [x];
			
			return name;
		}
		
		public static void main(String[] args) {
		Fruta fru = new Fruta();
		System.out.println(fru.nome);
		Fruta f = new Fruta("Fabiana");
		System.out.println(f.nome);
		}
	} 
 
 */
}
