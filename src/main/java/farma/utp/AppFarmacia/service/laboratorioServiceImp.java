package farma.utp.AppFarmacia.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import farma.utp.AppFarmacia.entity.Laboratorios;
import farma.utp.AppFarmacia.repository.laboratorioRepository;

@Service
public class laboratorioServiceImp implements laboratorioService {
	@Autowired
	private laboratorioRepository r2;

	@Override
	public List<Laboratorios> listarLab() {
		
		return r2.findAll();
	}

	@Override
	public Laboratorios guardarLab(Laboratorios laboratorios) {
		
		return r2.save(laboratorios);
	}

	@Override
	public Laboratorios obtenerLabporId(Long id) {
		
		return r2.findById(id).get();
	}

	@Override
	public Laboratorios actualizarLab(Laboratorios laboratorios) {
		
		return r2.save(laboratorios);
	}

	@Override
	public void eliminarLab(Long id) {
		r2.deleteById(id);
		
	}
}
