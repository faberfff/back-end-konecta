package co.prueba.konecta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.prueba.konecta.model.Obrero;

@Repository
public interface IObreroRepository extends JpaRepository<Obrero, Long> {

}
