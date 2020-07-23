package ec.edu.utpl.app.serviceexamenes.models.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ec.edu.utpl.app.serviceexamenes.models.dao.IExamenDao;
import ec.edu.utpl.app.serviceexamenes.models.entity.Examen;

public class ExamenServiceImpl implements IExamenService {

	@Autowired
	private IExamenDao examenDao;

	@Override
	public List<Examen> listAll() {
		// TODO Auto-generated method stub
		return (List<Examen>) examenDao.findAll();
	}

	@Override
	public Examen save(Examen examen) {
		// TODO Auto-generated method stub
		return examenDao.save(examen);
	}

	@Override
	public Examen findById(Long id) {
		// TODO Auto-generated method stub
		return examenDao.findById(id).orElse(null);
	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub
		examenDao.deleteById(id);
	}

}
