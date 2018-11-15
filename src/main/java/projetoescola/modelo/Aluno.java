package projetoescola.modelo;

import java.util.Date;

import projetoescola.modelo.enums.Sexo;

public class Aluno extends Pessoa {
	private Sexo sexo;
	private Date dataNascimento;
	
	public Aluno() {
		this.sexo=Sexo.MASCULINO;
	}
	public Sexo getSexo() {
		return sexo;
	}
	public void setSexo(Sexo sexo) {
		this.sexo = sexo;
	}
	public Date getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Date dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
		
	
}
