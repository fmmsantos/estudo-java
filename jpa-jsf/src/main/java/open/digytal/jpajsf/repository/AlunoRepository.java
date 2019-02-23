package open.digytal.jpajsf.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import open.digytal.jpajsf.enun.Sexo;
import open.digytal.jpajsf.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Integer> {
List<Aluno> findBySexo(Sexo sexo);

}
