package farma.utp.AppFarmacia.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import farma.utp.AppFarmacia.entity.Medicamentos;
@Repository
public interface medicamentoRepository extends JpaRepository<Medicamentos, Long> {

}
