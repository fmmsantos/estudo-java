package projetoescola.app;

import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import projetoescola.modelo.Aluno;
import projetoescola.modelo.Contrato;
import projetoescola.modelo.Mensalidade;
import projetoescola.modelo.Responsavel;
import projetoescola.modelo.enums.Sexo;

public class Projeto {
	static SimpleDateFormat formatadorData = new SimpleDateFormat("dd/MM/yyyy");
	static NumberFormat formatadorNumero = NumberFormat.getCurrencyInstance();
	
	static Calendar dataNascimento = new GregorianCalendar(1989, 06, 24, 14, 32, 25);
	static Calendar dataMatricula = new GregorianCalendar(2018, 11, 10, 14, 32, 25);
	
	public static void main(String[] args) {

		Responsavel responsavel = new Responsavel();
		responsavel.setNome("Marcio Passos Feitosa");
		responsavel.setTelefone("(98) 4546-8541");
		responsavel.setCelular("(98) 99456-8432");
		responsavel.setCpf("005.465.548-88");

		Aluno aluno=novoAluno("Fabiana Machado dos Santos", Sexo.FEMININO, dataNascimento.getTime());
		aluno.setEndereco("Av Nossa Senhora da Assuncao, 647");
		Contrato matriculaAluno = realizarMatricula(aluno, responsavel, dataMatricula.getTime(), 951, 103.74, 10);

		//A PARTIR DAQUI So VEMOS MATRICULA
		imprimirMatricula(matriculaAluno);

		aluno=novoAluno("GLEYSON", Sexo.MASCULINO, dataNascimento.getTime());
		aluno.setEndereco("Av Nossa Senhora da Assuncao, 647");
		matriculaAluno = realizarMatricula(aluno, responsavel, dataMatricula.getTime(), 951, 150.28, 12);
		
		imprimirMatricula(matriculaAluno);

		
	}
	static void imprimirMatricula(Contrato matricula) {
		System.out.println("******************* DADOS DO ALUNO ***********************");
		System.out.println("Nome do Aluno: "+matricula.getAluno().getNome());
		System.out.println("Sexo do Aluno: "+matricula.getAluno().getSexo());
		System.out.println("Endere�o: "+matricula.getAluno().getEndereco());
		System.out.println("Nome do Aluno: "+matricula.getAluno().getNome());
		System.out.println("Respons�vel: "+matricula.getResponsavel().getNome());
		System.out.println("\n****************** DADOS DA MATRICULA *********************");
		System.out.println("N�mero Matricula: "+matricula.getNumero());
		System.out.println("Data Matricula: "+formatadorData.format(matricula.getData()));
		System.out.println("\n****************** DADOS DAS PARCELA *********************");
		for(Mensalidade mensalidade: matricula.getMensalidades()) {
			System.out.println("Numero Parcela: "+mensalidade.getParcela());
			System.out.println("Data Vencimento: "+formatadorData.format(mensalidade.getDataVencimento()));
			System.out.println("Valor Parcela: "+formatadorNumero.format(mensalidade.getValor()));
			System.out.println("Situção Parcela: "+mensalidade.getSituacao());
			System.out.println("\n");
			
		}
	}
	static Aluno novoAluno(String nome, Sexo sexo, Date dataNascimento) {
		Aluno aluno = new Aluno();
		aluno.setNome(nome);
		aluno.setSexo(sexo);
		aluno.setDataNascimento(dataNascimento);
		return aluno;
	}
	static Contrato realizarMatricula(Aluno aluno, Responsavel responsavel,Date dataMatricula,Integer numeroMatricula, Double valorParcela, Integer numeroParcelas) {
		Contrato novaMatricula = new Contrato();
		novaMatricula.setAluno(aluno);
		novaMatricula.setResponsavel(responsavel);
		novaMatricula.setNumero(numeroMatricula);
		novaMatricula.setData(dataMatricula);
		
		Calendar dataPrimeiraParcela = new GregorianCalendar();
		dataPrimeiraParcela.setTime(dataMatricula); //A DATA DA PRIMEIRA PARCELA IGUAL A MATRICULA
		for(int parcela=1; parcela<=numeroParcelas;parcela++) {
			Mensalidade novaMensalidade = new Mensalidade();
			
			dataPrimeiraParcela.add(Calendar.MONTH, 1); //INFORMO QUE A PRIMEIRA PARCELA � 30 DIAS DEPOIS A DATA DA MATRICULA
			
			novaMensalidade.setParcela(parcela);
			novaMensalidade.setDataVencimento(dataPrimeiraParcela.getTime());
			novaMensalidade.setValor(valorParcela);
			
			novaMatricula.adicionarMensalidade(novaMensalidade);
		}
		
		return novaMatricula;
	}

}
