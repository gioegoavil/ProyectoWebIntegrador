package farma.utp.AppFarmacia.service;

import java.util.List;

import org.springframework.stereotype.Service;

import farma.utp.AppFarmacia.entity.Laboratorios;
@Service
public interface laboratorioService {
	public List<Laboratorios> listarLab();
	   
	   public Laboratorios guardarLab(Laboratorios laboratorios);
	   
	   public Laboratorios obtenerLabporId(Long id);
	   
	   public Laboratorios actualizarLab(Laboratorios laboratorios);
	   
	   public void eliminarLab(Long id);
}
