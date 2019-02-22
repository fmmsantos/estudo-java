package open.digytal.jpajsf.managedbean;

import java.util.Arrays;
import java.util.List;

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
	public List<Sexo> getSexos() {
		return sexos;
	}
	public void setSexos(List<Sexo> sexos) {
		this.sexos = sexos;
	}
	private Aluno aluno;
	private List<Sexo> sexos = Arrays.asList(Sexo.values());
	
	public List<Aluno> getAlunos() {
		return alunos;
	}
	public AlunoMB() {
		
	}
	public void buscar() {
		alunos = repository.findAll();
		System.out.println("buscou " + alunos.size());
	}
	public void salvar() {
		repository.save(aluno);
		novo();
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
}
