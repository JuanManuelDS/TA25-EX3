package main.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="almacenes")
public class Almacen {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@Column
	private String lugar;
	
	@Column
	private int capacidad;
	
	@OneToMany
	@JoinColumn(name="codigo")
	private List<Caja> cajas;

	public Almacen(Long id, String lugar, int capacidad) {
		this.codigo = id;
		this.lugar = lugar;
		this.capacidad = capacidad;
	}
	
	public Almacen() {
		// TODO Auto-generated constructor stub
	}

	public Long getCodigo() {
		return codigo;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public String toString() {
		return "Almacen [codigo=" + codigo + ", lugar=" + lugar + ", capacidad=" + capacidad + "]";
	}
	
	
	
}
