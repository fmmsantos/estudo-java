package Atribuicoes;

import zlixo.Fruta;
import zlixo.Maca;

public class Autoboxing {
/*
 * BOXING  = encaixotar
 * E possivel combinar var-args e boxing compativeis com a sobrecarga
 * nao é possivel ampliar de um tipo wepper para outro É-UM falha
 * nao é possivel ampliar e depois fazer um boxing (int depois um long)
 * é possivel fazer um boxing depois ampliar um int pode se tornar um OBject ou um Integer
 * 
 EX :
 public void go(int valor){}
 public void go(Integer valor){} boxing encaixotar no parametro a classe wepper
 sempre em um metodo se dá prefrencia aos valores primitivos, estilo antigo
 preferencia pelo boxing do que pelo var-args, utiliza o var-args como ultimo recurso.
 * UNBOXING = desencaixotar
 * Ampliando variaveis de referencia:
 * ex: Fruta maca = new Maca("maca");
	Maca m = (Maca) maca;
	m.saborFrutaMaca(m);
	public void saborFrutaMaca(Fruta nome) {
		
		System.out.println("Qual o nome da fruta? " + super.nome);
		obs: classes wepper nao se ampliam dentro de parametros de metodos
}	----------------------------------------------------------------------------
 * 
 * public static void main(String[] args) {
	--------------DEU TRUE DEVIDO A NAO CRIACAO DO OBJETO-----------------	
		Integer y=567;
		Integer x=y;
		
		System.out.println(x==y);
		
	----------DEU FALSE OS VALORE DEVIDO AO OBJETO CRIADO---------------	
		 Integer  s = new Integer(x);
		 s++;
		 System.out.println(s==x); enquanto
	}	
	
 */
}
