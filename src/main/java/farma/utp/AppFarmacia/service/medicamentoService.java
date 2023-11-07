package farma.utp.AppFarmacia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import farma.utp.AppFarmacia.entity.Medicamentos;
@Service
public interface medicamentoService {
	public List<Medicamentos> listarMed();
	   
	   public Medicamentos guardarMed(Medicamentos medicamentos);
	   
	   public Medicamentos obtenerMedporId(Long id);
	   
	   public Medicamentos actualizarMed(Medicamentos medicamentos);
	   
	   public void eliminarMed(Long id);
}
