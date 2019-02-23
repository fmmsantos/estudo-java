package open.digytal.jpajsf.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import open.digytal.jpajsf.model.Usuario;

public interface LoginRepository extends JpaRepository<Usuario, Integer>{
	Usuario getByUsuario(String usuario);


}
