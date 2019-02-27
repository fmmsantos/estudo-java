package open.digytal.jpajsf.managedbean;

import javax.faces.application.FacesMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import open.digytal.jpajsf.jsf.FacesUtils;
import open.digytal.jpajsf.model.Usuario;
import open.digytal.jpajsf.repository.UsuarioRepository;

@Component
@Scope("view")
public class UsuarioMB {
	@Autowired
	private UsuarioRepository repository;
	
	private String login;
	private String senha;
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String logarUsuario() {
		/*// pegar o usuario e buscar no banco de o usuario
		Usuario usuario = repository.findyByLogin(login);
		
		// se nao existir, mostra mensagem e sai
		if (usuario == null) {
			FacesUtils.showMessage("Usuario não encontrado no banco de dados");
			return null;
		}
		
		// se existir, verifica a senha
		if (usuario.getSenha().equals(senha)) {
			FacesUtils.showMessage("Senha do usuario esta OK");
			return "main";
		} else {
			FacesUtils.showMessage("Senha do usuario está invalida");
			return null;
		}*/
		return "";	
	}
	
	
	

}
