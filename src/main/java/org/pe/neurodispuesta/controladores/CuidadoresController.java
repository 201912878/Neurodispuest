package org.pe.neurodispuesta.controladores;

import java.util.Optional;

import org.pe.neurodispuesta.servicios.CuidadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/cuidadores")
public class CuidadoresController {
	
	@Autowired
	private CuidadorService srv_cuidadores;
	
	@GetMapping
	@ResponseBody
	public ResponseEntity<Object> acceder(@RequestParam Optional<Integer> id) {
		try {
			if(id.isPresent()) {
				return new ResponseEntity<Object>(srv_cuidadores.buscar(id.get()), HttpStatus.OK);
			} else {
				return new ResponseEntity<Object>(srv_cuidadores.listar(), HttpStatus.OK);
			} 
		} catch(Exception e){
			return new ResponseEntity<Object>(HttpStatus.NOT_FOUND);
		}
	}
}
