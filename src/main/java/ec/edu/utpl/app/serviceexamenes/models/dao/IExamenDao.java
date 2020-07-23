package ec.edu.utpl.app.serviceexamenes.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import ec.edu.utpl.app.serviceexamenes.models.entity.Examen;

public interface IExamenDao extends JpaRepository<Examen, Long> {

}
