package OrientacaoObjeto;

public class Polimofismo {
	
	//Polimofismo é a possibilidade de classes distintas poderem implemntar métodos com nomes iguais
	// Muito utlilizada em classes e abstratas e interface que nao podem ser instanciadas e cada classe concreta pode extender seus metodos;
	// subclasses podem utilizar o polimofismo
	//ex: classe animal com método emitiSom();cada classe que extende a classe animal pode extender seus métodos e sobrescrever
	
/*	EX: Animal animal = new Gato();
Refere-se a classe animal devido ao polimofismo.*/
	
	
	
	
	/*public class Animal {
	     public void comer() {
	          System.out.println( "Animal Comendo..." );
	     }
	}
	public class Cao  extends Animal {
	     public void comer() {
	          System.out.println( "Cão Comendo..." );
	     }
	}
	public class Tigre extends Animal {
	     public void comer() {
	          System.out.println( "Tirgre Comendo..." );
	     }
	     no caso a sua chamado de método polimorfico ficaria assim
-------------------------------------------------------------------------------------
publci class Test {
  public void fazerAnimalComer( Animal animal ) {
       animal.comer();
  }
  public static void main( String[] args ) {
       Test t = new Test();
        t.fazerAnimalComer( new Animal() );
        t.fazerAnimalComer( new Cao() );
        t.fazerAnimalComer( new Trigre() );
   }
	} */
}
