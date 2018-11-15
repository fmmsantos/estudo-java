package projetoescola.modelo;

import java.util.Date;

import projetoescola.modelo.enums.SituacaoMensalidade;


public class Mensalidade {
	private Matricula matricula;
	
	private Date dataVencimento;
	private int parcela;
	private SituacaoMensalidade situacao;
	private  Double valor;
	
	public Mensalidade() {
		situacao = SituacaoMensalidade.ABERTO;
	}
	
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public Matricula getMatricula() {
		return matricula;
	}
	public void setMatricula(Matricula matricula) {
		this.matricula = matricula;
	}
	public int getParcela() {
		return parcela;
	}
	public void setParcela(int parcela) {
		this.parcela = parcela;
	}
	
	public SituacaoMensalidade getSituacao() {
		return situacao;
	}
	public void setSituacao(SituacaoMensalidade situacao) {
		this.situacao = situacao;
	}
	public Double getValor() {
		return valor;
	}
	public void setValor(Double valor) {
		this.valor = valor;
	}

}
