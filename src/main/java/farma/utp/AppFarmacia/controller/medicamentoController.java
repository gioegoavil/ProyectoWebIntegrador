package farma.utp.AppFarmacia.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import farma.utp.AppFarmacia.entity.Medicamentos;
import farma.utp.AppFarmacia.service.medicamentoService;


@Controller
public class medicamentoController {
	@Autowired
	private medicamentoService servicio;
	@GetMapping( {"/","/medicamento"} )
	public String listarMed(Model modelo) {
		modelo.addAttribute("medicamento", servicio.listarMed());
		return "medicamento";
	}

	@GetMapping("/medicamento/nuevo")
	public String mostrarFormularioDeRegistarMedicamento(Model modelo) {
		Medicamentos medicamento = new Medicamentos();
		modelo.addAttribute("medicamento", medicamento);
		return "nuevo_medicamento";
	}
	

	@PostMapping("/medicamento")
	public String guardarMedicamento(@ModelAttribute("cliente") Medicamentos medicamentos) {
		servicio.guardarMed(medicamentos);
		return "redirect:/medicamento";
	}

	@GetMapping("/medicamento/editar/{id}")
	public String mostrarFormularioDeEditar(@PathVariable Long id, Model modelo) {
		modelo.addAttribute("medicamento", servicio.obtenerMedporId(id));
		return "editar_medicamento";
	}

	@PostMapping("/medicamento/{id}")
	public String actualizarMedicamento(@PathVariable Long id, @ModelAttribute("cliente") Medicamentos medicamento,
			Model model) {
		Medicamentos medE = servicio.obtenerMedporId(id);
		medE.setId(id);
		medE.setNombre(medicamento.getNombre());
		medE.setCodigo(medicamento.getCodigo());
		medE.setFechavenc(medicamento.getFechavenc());
		medE.setStock(medicamento.getStock());
		
		servicio.actualizarMed(medE);
		return "redirect:/medicamento";
	}

	@GetMapping("/medicamento/{id}")
	public String eliminarMed(@PathVariable Long id) {
		servicio.eliminarMed(id);
		return "redirect:/medicamento";
	}
}
