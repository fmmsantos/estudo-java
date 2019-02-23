package open.digytal.jpajsf.managedbean;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import open.digytal.jpajsf.model.Usuario;
import open.digytal.jpajsf.repository.LoginRepository;
@Scope("view")
@Component
public class LoginMB {
	@Autowired
	private LoginRepository repository;
	private Usuario usuario;
	private String login;
	private Integer senha;




	public LoginMB() {
		
	}
	

public String efetuarLogin() {
		Usuario usuario = repository.getByUsuario(login);
	    if(usuario==null) {
	    	showMessage("Usuario nao encontrado no banco de dados");
	    	novo();
	             
	    }
	    if(! usuario.getSenha().equals(senha)){
	    		showMessage("Senha do usuário não corresponde.");
	    		return null;
	    }
	    return"alunos";
	  }
  public String getLogin() {
		return login;
	}



	public void setLogin(String login) {
		this.login = login;
	}



	public Integer getSenha() {
		return senha;
	}



	public void setSenha(Integer senha) {
		this.senha = senha;
	}

	public void novo() {
		usuario= new Usuario();
	}


public void showMessage(String message) {
	  FacesMessage msg= new FacesMessage(message);
	  FacesContext.getCurrentInstance().addMessage(null, msg);
  }
}
