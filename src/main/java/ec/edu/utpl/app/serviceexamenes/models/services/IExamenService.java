package ec.edu.utpl.app.serviceexamenes.models.services;

import java.util.List;

import ec.edu.utpl.app.serviceexamenes.models.entity.Examen;

public interface IExamenService {

	public List<Examen> listAll();

	public Examen save(Examen examen);

	public Examen findById(Long id);

	public void delete(Long id);
	
}
