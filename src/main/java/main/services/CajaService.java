package main.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import main.dao.ICajaDAO;
import main.dto.Caja;

@Service
public class CajaService implements ICajaService {

	@Autowired
	ICajaDAO iCajaDAO;
	
	@Override
	public List<Caja> listarCajas() {
		
		return iCajaDAO.findAll();
	}

	@Override
	public Caja guardarCaja(Caja caja) {
		
		return iCajaDAO.save(caja);
	}

	@Override
	public Caja buscarCaja(String num_referencia) {
		
		return iCajaDAO.findById(num_referencia).get();
	}

	@Override
	public Caja actualizarCaja(Caja caja) {
		return iCajaDAO.save(caja);
	}

	@Override
	public void eliminarCaja(String num_referencia) {
		// TODO Auto-generated method stub
		iCajaDAO.deleteById(num_referencia);
	}

}
