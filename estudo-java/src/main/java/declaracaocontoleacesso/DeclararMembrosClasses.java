package declaracaocontoleacesso;
 class DeclararMembrosClasses {
	
	// Uma classe pose usar 2 dos 4 níveis de acesso(public e default)
	
	// Os membros(métodos e atributos) podem usar todos os 4:
	 
	/* #public= se seus membros forem declarados como public, outras classes podem herdar
	   #protected= so pode instanciar membros protect no msm pacote
	   fora do pacote pode invocar mais nao pode instanciar
	   nao pode ser visto fora da subclasse fora do pacote
	   pode ser acessado por subclasses da subclasse.
	   #default= poder ser acessado em classes no mesmo pacote
	   #private= nao pode ser acessado por outra classe ou pacote ao nao ser na mesma classe
	   metodos private nao podem ser sustituidos
	 */
	 
	 
	// Precisa saber duas quetoes diferentes relativo ao acesso:
	// # se um metodo em uma classe pode acessar membro de outra classe
	// # Seu uma subclasse pode herdar um membro de uma superclasse
	// Se uma subclasse estender uma superclasse automaticamente ela poderá herdar seus membros.
	// poderar herdar seus membros, caso esse for public.
	 
	 // Os modificadores nao podem ser aplicados em uma variavel local(metodos),
	 // so msm o modificador "final".
	
	
	//  formas de acessar um método public:
	///sendo instaciado por outra classe
	// na mesma classe
	// herdado por uma subclasse
	
	 /*MODIFICADORES NAO REFERENTE AO ACESSO
	  * 		Metodos:
	  * final : impede que o metodo seja modificado, nem as variavel de local, classes nao podem ser declaradas como final
	  * Abstract: voce marca um metodo como abstact quando voce quer foçar as suclasse a implementar seu metodo
	  // os metodos abstratos devem ser implementados por uma classe nao abstrata
	   * nao podem ser private e abstract ao msm tempo
	   * nao podem ser abstract e final ao msm tempo.
	   * nao pode am msm tempo ser abstract e static
	   * Métodos Sincronizados : modificador synchronized so so é usada em métodos e pode ser
	   * acompanhada por qualquer uma das 3 palavras chave do modificador de acesso.
	   * Metódos Nativos: o modificador native é um modificador so pode ser aplicado em método
	   * Metodo Strictfp é um modificador de acesso para metodos.
	   
	  
	 /*VAR-ARGS
	  * O var-argues é um recurso em java que permite declarar infinitos parametros em um metodo
	  * so pode ter a um varargs por método
	  * o varags pode ser usado com outro parametro
	  */
	 
	/*DECLARAÇAO DE CONSTRUTORES
	 * Podem ter todos os modificadores de acesso
	 * Tem que ter o mesmo nome da classe onde esta inserido
	 * NAO pode ser marcado como static, final, abstract(sao associado a instaciamento de um objeto
	 * ex: DeclararMembrosClasses(){}	  
	 */
	 
	/* DECLARACAO DE VARIAVEL
	 * Variavel primitiva: sao 8 variaveis primitivas, int,char,boolean,double,long,float,byte,short
	 * Variavel de referencia: sao variaveis que sao instanciada por uma classe
	 * ex: String nome, Object nome, Nome nome,
	 * Variavel de instacia: sao definidas como variavel de classe sao inicializada a partir de uma instancia
	 * ex: private String nome.
	 * pode ser declaradas  com variaveis static, em um paramentro, em um constrututor, podem ser declaradas de uma a mais
	
	 * Nao pode ser marcada como static, mais pode ser como final, private, abstrata,transient native,
	 * Variavel local: sao declaradas dentro de um metodo .so o modificado final.S
	 * Variavel nao local: final , public, protected,private,statict,transiend, volatile
	 * Variavel transient: quando vc marca uma variavel com transient vc está dizendo a JVM para ignorar essa varivel quando for instanciar a classe dessa variavel
	 * Variavel Volate: so usada em vvariavel de instancia.
	 *metodo: ffinal, public, prrotected,private,static, abstract,synchronized,strictfp,native 
	
	  */
	 
	 /*ARRAY
	  * sao declarados ex: int[] fruta,
	  * construidos int[] array = new int[5];
	  * inicializados int[0]=fruta[1];
	  * Temos arrays bidimencional e tridimencional.
	  */
	 
	 //TIPOS PRIMITIVO
	 // byte 8,short 16,int 32, long 64,float 32,doable 64
	 
	/*ENUM
	 * 
	 * 
	 */

}
