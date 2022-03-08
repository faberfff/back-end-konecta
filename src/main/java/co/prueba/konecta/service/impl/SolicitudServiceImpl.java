package co.prueba.konecta.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.prueba.konecta.dto.SolicitudDto;
import co.prueba.konecta.model.Obrero;
import co.prueba.konecta.model.Solicitud;
import co.prueba.konecta.repository.ISolicitudRepository;
import co.prueba.konecta.service.iface.ISolicitudService;

@Service
public class SolicitudServiceImpl implements ISolicitudService {
	
	@Autowired
	private ISolicitudRepository solicitudRepository;

	@Override
	public List<SolicitudDto> findAll() {
		List<Solicitud> solicitudes = solicitudRepository.findAll();
		List<SolicitudDto> solicitudesDto = new ArrayList<>();
		
		for(Solicitud solicitud : solicitudes) {
			  SolicitudDto solicitudDto = new SolicitudDto();
			  solicitudDto.setId(solicitud.getId());
			  solicitudDto.setCodigo(solicitud.getCodigo());
			  solicitudDto.setDescripcion(solicitud.getDescricion());
			  solicitudDto.setResumen(solicitud.getResumen());
			  
		}
		return null;
	}

	@Override
	public Solicitud findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Solicitud insertSol(Solicitud solicitud) {
		// TODO Auto-generated method stub
		return null;
	}


}
