package open.digytal.jpajsf.managedbean;

import java.util.Arrays;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import open.digytal.jpajsf.enun.Sexo;
import open.digytal.jpajsf.model.Aluno;
import open.digytal.jpajsf.repository.AlunoRepository;

//@ManagedBean
//@ViewScoped
@Scope("view")
@Component
public class AlunoMB {
	@Autowired
	private AlunoRepository repository;
	private List<Aluno> alunos;
	private Aluno aluno;
	
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public AlunoMB() {
		
	}
	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}
	public void buscar() {
		alunos = repository.findAll();
		System.out.println("buscou " + alunos.size());
	}
	public void salvar() {
		repository.save(aluno);
	
		
		novo() ;
		
	}
	
	public void excluir() {
	alunos = repository.findAll();
		repository.delete(aluno);
		
	}
	public void incluir(ActionEvent event) {
		novo();
	}
	public Aluno getAluno() {
		return aluno;
	}
	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}
	public void novo() {
		aluno = new Aluno();
	}
	 public void saveMessage() {
	        FacesContext context = FacesContext.getCurrentInstance();
	        context.addMessage(null, new FacesMessage("Cadastro salvo com sucesso!!"));
	    }
}
