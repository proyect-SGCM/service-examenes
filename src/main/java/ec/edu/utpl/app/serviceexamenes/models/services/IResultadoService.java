package ec.edu.utpl.app.serviceexamenes.models.services;

import java.util.List;

import ec.edu.utpl.app.serviceexamenes.models.entity.Resultado;

public interface IResultadoService {

	public List<Resultado> listAll();

	public Resultado save(Resultado resultado);

	public Resultado findById(Long id);

	public void delete(Long id);

}
