package open.digytal.jpajsf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import open.digytal.jpajsf.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String>{
	public Usuario findByLogin(String login);

}
