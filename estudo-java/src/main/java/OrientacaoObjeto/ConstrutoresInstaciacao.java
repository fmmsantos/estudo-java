package OrientacaoObjeto;

import zlixo.Fruta;

public class ConstrutoresInstaciacao {
	/*Toda classe mesmo sendo abstrata precisa de um construtor;
	 * Construtor nao possui tipo de retorno.
	 * O nome do Construtor deve ter o mesmo nome da classe.
	 * Todo construtor sobrecarregado precisa de um construtor vazio;
	 * Um construtor pode ter sobrecarga
	 * Construtores são chamado em tempo de execucao quando usa a palavra "new";
	 * variaveis e metodos static podem ser acessadas por parte da chamada supe() ou this();
	 * Interface não tem construtores por nao fazem parte da arvore de herança.
	 * Um construtor padrão so será criado se não tiverem nenhum construtor.
	 * para extender uma classe com um construtor sobrecarregado tem que criar um construtor vazio.
	 * Construtor nunca é herdado
	 * nos paramentos dos contrutores nao se pode declarar métodos, 
	 
	 REGRA CHAVE: A primeira linha de um construtor deve ser uma chamada a super ou a this();	
	 Não é obrigado ter this ou super, mais se tiver usar na primeira linhaa
	 Não pode usar as 2 chamadas no mesmo construtor.
	  
	 ex: public class Animal{
	 String animal;
	 Animal(String animal){
	 this.name = nome;
	 }
	 }
	 
	 ex:
	 public Fruta saborFruta(String fruta) {
	
		return super.saborFruta(Fruta.nome);
		                        construtor e a variavel da super classe.
	 * Um construtor so pode ser chamado dentro de outro construtor nunca dentro de método
	 so se for referente a super classe coma palavra"super();
	 */

}
