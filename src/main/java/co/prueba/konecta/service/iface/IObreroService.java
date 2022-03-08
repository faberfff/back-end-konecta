package co.prueba.konecta.service.iface;

import java.util.List;
import java.util.Optional;

import co.prueba.konecta.model.Obrero;

public interface IObreroService {
	
	/**
	 * listar todos los obreros
	 * @return
	 */
	public List<Obrero> getAll();
	
	/**
	 * consultar un obrero por su id
	 * @return obrero
	 * @return id
	 */
	public Optional<Obrero> getById(Long id);
	
	/**
	 * insertar un obrero
	 * @param obrero
	 * @throws exception
	 */
	
	public Obrero insert(Obrero obrero) throws Exception;
	

}
