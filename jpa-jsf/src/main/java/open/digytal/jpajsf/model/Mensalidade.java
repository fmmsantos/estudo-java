package open.digytal.jpajsf.model;


import java.math.BigDecimal;
import java.time.LocalDate;

import open.digytal.jpajsf.enun.SituacaoMensalidade;

public class Mensalidade  {
	
public Mensalidade(double mensalidade) {
	// TODO Auto-generated constructor stub
}
public Mensalidade() {
	// TODO Auto-generated constructor stub
}
	

	private Integer id;
	
	private LocalDate dataVencimento;
	private LocalDate dataInicio;
    private int parcela;
    
   
    private Contrato contrato;
    
	private SituacaoMensalidade situacao;
	private  BigDecimal valor;
	
	public Contrato getContrato() {
		return contrato;
	}
	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDate getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(LocalDate dataInicio) {
		this.dataInicio = dataInicio;
	}
	public LocalDate getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
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
	public BigDecimal getValor() {
		return valor;
	}
	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

}
