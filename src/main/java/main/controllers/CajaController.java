package main.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import main.dto.Caja;
import main.services.CajaService;

@RestController
@RequestMapping("/api")
public class CajaController {

	@Autowired
	CajaService cajaService;
	
	@GetMapping("/cajas")
	public List<Caja> listarCajas(){
		return cajaService.listarCajas();
	}
	
	@GetMapping("/cajas/{num_referencia}")
	public Caja buscarCaja(@PathVariable(name="num_referencia") String num_referencia) {
		return cajaService.buscarCaja(num_referencia);
	}
	
	@PostMapping("/cajas")
	public Caja guardarCaja(@RequestBody Caja caja) {
		return cajaService.guardarCaja(caja);
	}
	
	@PutMapping("/cajas/{num_referencia}")
	public Caja actualizarCaja(@PathVariable(name="num_referencia") String num_referencia, @RequestBody Caja caja) {
		Caja cajaSeleccionada = cajaService.buscarCaja(num_referencia);
		
		cajaSeleccionada.setAlmacen(caja.getAlmacen());
		cajaSeleccionada.setContenido(caja.getContenido());
		cajaSeleccionada.setValor(caja.getValor());
		
		return cajaService.actualizarCaja(cajaSeleccionada);
		
	}
	
	@DeleteMapping("/cajas/{num_referencia}")
	public void eliminarCaja(@PathVariable(name="num_referencia") String num_referencia) {
		cajaService.eliminarCaja(num_referencia);
	}
	
}
