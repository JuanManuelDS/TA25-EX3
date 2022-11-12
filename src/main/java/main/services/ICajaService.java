package main.services;

import java.util.List;

import main.dto.Caja;

public interface ICajaService {

	public List<Caja> listarCajas();
	
	public Caja guardarCaja(Caja caja);
	
	public Caja buscarCaja(String num_referencia);
	
	public Caja actualizarCaja(Caja caja);
	
	public void eliminarCaja(String num_referencia);
}
