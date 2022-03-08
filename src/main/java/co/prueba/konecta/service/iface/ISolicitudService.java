package co.prueba.konecta.service.iface;

import java.util.List;

import co.prueba.konecta.dto.SolicitudDto;
import co.prueba.konecta.model.Solicitud;

public interface ISolicitudService {
	
	public List<SolicitudDto> findAll();
	
	public Solicitud findById(Long id);
	
	public Solicitud insertSol(Solicitud solicitud);

}
