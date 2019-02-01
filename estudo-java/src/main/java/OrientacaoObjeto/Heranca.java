package OrientacaoObjeto;

public class Heranca {
	
	//HERANÇA

	/*Herança é herdar algo ou alguma coisa
	 * a pronuncia herdar uma classe relaciona-se a vvoce herdar os membros dessa classe
	 * quando uma classe herda outra classe essa classe inicial passa a ser subclasse da classe herdada
	 * A subclasse herdada passa a ser a super classe
	 * Utiliza-se herança para reaproveitamento de códigos e polimofismo
	 * Qundo se quer herdar os membros de uma classe prrecisa-se extender-la com a palavra EXTENDS
	 * voce nao pode extender mais de uma classe.
	  */
	
	/*RELACIONAMENTO É-UM
	 * É um: é baseado na herança de classes ou implementacao de interfaces o é termo é um está relacionado que esse item é UM tipo de outro
	 * ex: Cavalo é UM animal, O Ponney É UM Cavalo e um animal
	 * Cavalo é a subclasse e animal é sua superclasse
	 * Ponney é subclasse de Cavalo e Cavalo é a super classe 
	 */
	
	/*RELACIONAMENTO TEM-UM;
	 * é baseado na utilizaçao, em vez de na Herança
	 * ex: Cavalo tem um(a) Rédia.
	 * ela é usada para ser um tipo de atributo e não heranca
--------------------------EXEMPLO-----------------------------------------------	 
	 import java.util.Date;
public class Aluno extends Pessoa {
    public Aluno(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data);
    }
    public String matricula;
}
public class Professor extends Pessoa {
    public Professor(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data);
    }
    public double salario;
    public String disciplina;
}
public class Funcionario extends Pessoa {
    public Funcionario(String _nome, String _cpf, Date _data) {
        super(_nome, _cpf, _data);
    }
    public double salario;
    public Date data_admissao;
    public String cargo;
}
	 */
	
	 
}
