package com.uce.edu.matriculacion.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.matriculacion.repository.modelo.Vehiculo;
@Repository
public class VehiculoRepositoryImpl implements IVehiculoRepository {
	List<Vehiculo> base = new ArrayList<Vehiculo>();
	@Override
	public void insertar(Vehiculo vehiculo) {
		
		base.add(vehiculo);
	}

	@Override
	public Vehiculo seleccionar(String placa) {
		for(Vehiculo vehiculo: base) {
			if(vehiculo.getPlaca().equals(placa)) {
				Vehiculo vehi = new Vehiculo();
				vehi.setMarca(vehiculo.getMarca());
				vehi.setPlaca(vehiculo.getPlaca());
				vehi.setPrecio(vehiculo.getPrecio());
				vehi.setTipo(vehiculo.getTipo());
				return vehiculo;
			}
		}
		
		return null;

	}

	@Override
	public void actualizar(Vehiculo vehiculo) {
		this.eliminar(vehiculo.getPlaca());
		this.insertar(vehiculo);
		
	}

	@Override
	public void eliminar(String placa) {
		base.remove(this.seleccionar(placa));

	}

}
