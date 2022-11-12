package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import main.dao.IAlmacenDAO;
import main.dto.Almacen;

public class AlmacenService implements IAlmacenService {

	@Autowired
	IAlmacenDAO iAlmacenDAO;
	
	@Override
	public List<Almacen> listarAlmacenes() {
		
		return iAlmacenDAO.findAll();
	}

	@Override
	public Almacen guardarAlmacen(Almacen almacen) {
		
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public Almacen buscarAlmacen(Long codigo) {
		
		return iAlmacenDAO.findById(codigo).get();
	}

	@Override
	public Almacen actualizarAlmacen(Almacen almacen) {
		
		return iAlmacenDAO.save(almacen);
	}

	@Override
	public void eliminarAlmacen(Long codigo) {

		iAlmacenDAO.deleteById(codigo);
	}

}
