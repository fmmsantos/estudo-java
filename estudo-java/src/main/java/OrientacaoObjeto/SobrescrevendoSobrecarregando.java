package OrientacaoObjeto;

import zlixo.Fruta;

public class SobrescrevendoSobrecarregando {

	/*Regras para sorescrever um método sao:
	 * O tipo de retorno deve ser igual;
	 * O tipo de acesso nao pode ser mais restritivo do que da super.
	 * O tipo de acesso PODE ser menos restritivo
	 * Os métodos nao podem ser sobrescrito se forem privado ou final
	 * O metodo sobrescrito pode lançar excecoes 
	 * Não pode sobrescrever um método static
	 * tem que haver alteracao no método que irá sobrescrever.
	 
	 */
	/*
	 public class Limao extends Fruta {
	
	@Override
	public void saborFruta() {
	System.out.println("meu sabor é azedo");
		super.saborFruta();
	}
	
	 */
	/*SOBRECARREGANDO
	 * metodos devem alterar a lista de arguumento
	 * pode alterar o tipo de retorno
	 * pode alterar o modificador de acesso
	 * podem declarar excecoes do jeito que desejar.
	 * Chamar método sobrecarregados com Objetos é mais intessante
	 * voce nao precisa instanciar um objeto para cada classe, é so usar uma sobrecargga d tipo Objeto
	 * 
	 ------------------------------------------------------------
	EX: METODOS COM O MSM NOME UM POLIMOFICO E METODO SOBRECARREGADO
	  @Override
	 
	public void saborFruta() {
	System.out.println("meu sabor é azedo");
	  
	}
	public void saborFruta(String sabor, String cor) {
		System.out.println("diga o sabor e a cor: " + sabor+ " e " + cor);
	}


	 */
}
