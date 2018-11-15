package projetoescola.modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contrato {
	private int numero;
	private Aluno aluno;
	private Responsavel responsavel;
	private List<Mensalidade> mensalidades;
	private Date data;
	
	public Contrato() {
		mensalidades = new ArrayList<Mensalidade>();
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public Responsavel getResponsavel() {
		return responsavel;
	}
	public void setResponsavel(Responsavel responsavel) {
		this.responsavel = responsavel;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public List<Mensalidade> getMensalidades() {
		return mensalidades;
	}
	public void adicionarMensalidade(Mensalidade mensalidade) {
		mensalidade.setMatricula(this);
		mensalidades.add(mensalidade);
	}
}
