package open.digytal.jpajsf.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.List;



 class Contrato {
	
	public Contrato() {
		mensalidades=new ArrayList<>();
	}
	
	private int numeroContrato;
	
	

	private Aluno aluno;
	

	private Responsavel responsavel;

	private List<Mensalidade> mensalidades;
	
	private LocalDate data;
	
	
	public void setNumeroContrato(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	public void addMensalidade(Mensalidade mensalidade) {
		mensalidade.setContrato(this);
		mensalidades.add(mensalidade);
	}
	
	public LocalDate getData() {
		return data;
	}
	public void setData(LocalDate data) {
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
	public int getNumeroContrato() {
		return numeroContrato;
	}
	public void setNumero(int numeroContrato) {
		this.numeroContrato = numeroContrato;
	}
	public List<Mensalidade> getMensalidades() {
		return mensalidades;
	}
	
}
