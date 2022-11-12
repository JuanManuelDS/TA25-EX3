package main.services;

import java.util.List;

import main.dto.Almacen;

public interface IAlmacenService {

	//Listar
	public List<Almacen> listarAlmacenes();
	
	//Guardar
	public Almacen guardarAlmacen(Almacen almacen);
	
	//Buscar
	public Almacen buscarAlmacen(Long codigo);
	
	//Actualizar
	public Almacen actualizarAlmacen(Almacen almacen);
	
	//Eliminar
	public void eliminarAlmacen(Long codigo);
}
