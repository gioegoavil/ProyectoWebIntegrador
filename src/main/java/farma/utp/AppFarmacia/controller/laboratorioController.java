package farma.utp.AppFarmacia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import farma.utp.AppFarmacia.entity.Laboratorios;
import farma.utp.AppFarmacia.entity.Medicamentos;
import farma.utp.AppFarmacia.service.laboratorioService;

@Controller
public class laboratorioController {
	
	@Autowired
	private laboratorioService servicio;
@GetMapping({"/laboratorio"})
public String listaLab(Model modelo) {
	modelo.addAttribute("laboratorio", servicio.listarLab());
	return "laboratorio";
}
@GetMapping("/laboratorio/nuevo")
public String mostrarFormularioDeRegistarLaboratorio(Model modelo) {
	Laboratorios laboratorio = new Laboratorios();
	modelo.addAttribute("laboratorio", laboratorio);
	return "nuevo_laboratorio";
}

@PostMapping("/laboratorio")
public String guardarLaboratorio(@ModelAttribute("laboratorio") Laboratorios laboratorio) {
	servicio.guardarLab(laboratorio);
	return "redirect:/laboratorio";
}

@GetMapping("/laboratorio/editar/{id}")
public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
	modelo.addAttribute("laboratorio", servicio.obtenerLabporId(id));
	return "editar_laboratorio";
}

@PostMapping("/laboratorio/{id}")
public String actualizarLaboratorio(@PathVariable Long id, @ModelAttribute("laboratorio") Laboratorios laboratorio,
		Model model) {
	Laboratorios labE = servicio.obtenerLabporId(id);
	labE.setId(id);
	labE.setCodigo(laboratorio.getCodigo());
	labE.setNombrelab(laboratorio.getNombrelab());
	labE.setPreciog(laboratorio.getPreciog());
	labE.setPreciom(laboratorio.getPreciom());
	
	servicio.actualizarLab(labE);
	return "redirect:/laboratorio";
}

@GetMapping("/laboratorio/{id}")
public String eliminarMed(@PathVariable Long id) {
	servicio.eliminarLab(id);
	return "redirect:/laboratorio";
}
}
