package co.prueba.konecta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.prueba.konecta.model.Solicitud;

@Repository
public interface ISolicitudRepository extends JpaRepository<Solicitud, Long>{

}
