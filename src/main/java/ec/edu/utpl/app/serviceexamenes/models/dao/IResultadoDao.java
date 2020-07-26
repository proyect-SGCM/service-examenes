package ec.edu.utpl.app.serviceexamenes.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.utpl.app.serviceexamenes.models.entity.Resultado;

public interface IResultadoDao extends JpaRepository<Resultado, Long> {

}
