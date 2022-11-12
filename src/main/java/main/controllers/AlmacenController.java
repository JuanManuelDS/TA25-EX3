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

import main.dto.Almacen;
import main.services.AlmacenService;

@RestController
@RequestMapping("/api")
public class AlmacenController {

	@Autowired
	AlmacenService almacenService;
	
	@GetMapping("/almacenes")
	public List<Almacen> listarAlmacenes(){
		return almacenService.listarAlmacenes();
	}
	
	@GetMapping("/almacenes/{codigo}")
	public Almacen buscarAlmacen (@PathVariable(name="codigo") Long codigo) {
		return almacenService.buscarAlmacen(codigo);
	}
	
	@PostMapping("/almacenes")
	public Almacen guardarAlmacen(@RequestBody Almacen almacen) {
		return almacenService.guardarAlmacen(almacen);
	}
	
	@PutMapping("/almacenes/{codigo}")
	public Almacen actualizarAlmacen(@PathVariable(name="codigo") Long codigo, @RequestBody Almacen almacen) {
		
		Almacen almacenSeleccionado = almacenService.buscarAlmacen(codigo);
		
		almacenSeleccionado.setLugar(almacen.getLugar());
		almacenSeleccionado.setCapacidad(almacen.getCapacidad());
		
		return almacenService.actualizarAlmacen(almacenSeleccionado);
	}
	
	@DeleteMapping("/almacenes/{codigo}")
	public void eliminarAlmacen(@PathVariable(name="codigo")Long codigo) {
		almacenService.eliminarAlmacen(codigo);
	}
}
