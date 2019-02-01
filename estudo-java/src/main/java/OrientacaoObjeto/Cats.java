package OrientacaoObjeto;

import zlixo.Fruta;
import zlixo.Limao;
import zlixo.Maca;

public class Cats {
	/* Usado para realizar convesao de tipos:
	 * tanto tipos de variavel
	 * tanto tipo de  Objeto;
	 * Nao se pode fazer Cast em Objeto  sem que aja relacionamento entre classes.
	 * Nao pode converter classes filhhas em classe pai.
	 * PODE converter classe pai em classe filha
	 * 
	 * 
		//Maca maca = new Maca();
		//Fruta fruta=maca; //UPCAST OK SEM NENHUMA CONVERSAO EXPLICITA
		
		//Fruta ff = new Maca();
	//	Limao f = (Limao)ff;// UPCAST OK COM UMA CONVERSAO EXPLICITA
		
		// Cast com Array
	  Fruta maca = new Maca();
		if (maca instanceof Fruta) {
			System.out.println("Maca é uma fruta");
		}else {
				System.out.println("Maca nao e uma fruta");
			}
			Fruta[] f = new Fruta[3];
	Fruta limao = new Limao();
	Maca maca=new Maca();
	maca.saborFrutaMaca("Maca");
	limao.saborFruta();
	f[0]=maca;
	f[1]=limao;
	
	 Fruta fruta = new Maca();
 Maca maca = (Maca)fruta;
 fruta.saborFruta();
 Fruta f=maca;

	 */

}
