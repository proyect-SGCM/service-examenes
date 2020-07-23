package ec.edu.utpl.app.serviceexamenes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import ec.edu.utpl.app.serviceexamenes.models.entity.Examen;
import ec.edu.utpl.app.serviceexamenes.models.services.IExamenService;

@CrossOrigin(origins = { "http://localhost:4200" })
@RestController
@RequestMapping("/gst_examenes")
public class ExamenController {

	@Autowired
	private IExamenService examenService;

	/* -------------- Crear Médico -------------- */

	@PostMapping("/crear_examen")
	@ResponseStatus(HttpStatus.CREATED)
	public Examen crearExamen(@RequestBody Examen examen) {

		return examenService.save(examen);
	}

	/* -------------- Listar Médico -------------- */

	@GetMapping("/listar_examen")
	public List<Examen> listarExamen() {

		return examenService.listAll();
	}

	/* -------------- Ver Medico -------------- */

	@GetMapping("/examen/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Examen verExamen(@PathVariable Long id) {

		return examenService.findById(id);
	}

	/* -------------- Editar Médico -------------- */

	@PutMapping("/examen/{id}")
	@ResponseStatus(HttpStatus.CREATED)
	public Examen editarExamen(@RequestBody Examen examen, @PathVariable Long id) {

		Examen examenActual = examenService.findById(id);

		examenActual.setCodigo_examen(examen.getCodigo_examen());
		examenActual.setNombre(examen.getNombre());
		examenActual.setFecha(examen.getFecha());
		examenActual.setResultado(examen.getResultado());

		return examenService.save(examenActual);
	}

	/* -------------- Eliminar Médico -------------- */

	@DeleteMapping("/examen/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void eliminarExamen(@PathVariable Long id) {

		examenService.delete(id);
	}
}
