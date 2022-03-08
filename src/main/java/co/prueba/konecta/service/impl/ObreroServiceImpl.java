package co.prueba.konecta.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.prueba.konecta.model.Obrero;
import co.prueba.konecta.repository.IObreroRepository;
import co.prueba.konecta.service.iface.IObreroService;

@Service
public class ObreroServiceImpl implements IObreroService {
	
	@Autowired
	private IObreroRepository obreroRepository;

	@Override
	public List<Obrero> getAll() {
		List<Obrero> obreros = new ArrayList<>();
		obreros = (List<Obrero>)obreroRepository.findAll();
		return obreros;
	}

	

	@Override
	public Obrero insert(Obrero obrero) throws Exception {
		Boolean exist = obreroRepository.existsById(obrero.getId());
		
		if(!exist) {
			obreroRepository.save(obrero);
		}else {
			throw new Exception("El obrero ya existe en la base de datos");
		}
		return obrero;
	}



	@Override
	@Transactional
	public Optional<Obrero> getById(Long id) {
		
		return obreroRepository.findById(id);
	}

	

}
