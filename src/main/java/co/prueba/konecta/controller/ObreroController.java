package co.prueba.konecta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.prueba.konecta.model.Obrero;
import co.prueba.konecta.service.iface.IObreroService;

@RestController
@RequestMapping(value = "/obrero")
public class ObreroController {
	
	
	@Autowired
	private IObreroService obreroService;
	
	
	

}
