package farma.utp.AppFarmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import farma.utp.AppFarmacia.entity.Laboratorios;
@Repository
public interface laboratorioRepository extends JpaRepository<Laboratorios, Long>{

}
