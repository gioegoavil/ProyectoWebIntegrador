package farma.utp.AppFarmacia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import farma.utp.AppFarmacia.entity.Medicamentos;
import farma.utp.AppFarmacia.repository.medicamentoRepository;

@Service
public class medicamentoServiceImp implements medicamentoService {
	@Autowired
	private medicamentoRepository r;

	@Override
	public List<Medicamentos> listarMed() {
	
		return r.findAll();
	}

	@Override
	public Medicamentos guardarMed(Medicamentos medicamentos) {
		// TODO Auto-generated method stub
		return r.save(medicamentos);
	}

	@Override
	public Medicamentos obtenerMedporId(Long id) {
		return r.findById(id).get();
	}

	@Override
	public Medicamentos actualizarMed(Medicamentos medicamentos) {
		
		return r.save(medicamentos);
	}

	@Override
	public void eliminarMed(Long id) {
		 r.deleteById(id);
		
	}
	
}
