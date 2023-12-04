package com.uce.edu.matriculacion.repository;

import com.uce.edu.matriculacion.repository.modelo.Vehiculo;

public interface IVehiculoRepository {
	public void insertar(Vehiculo vehiculo);
	public Vehiculo seleccionar(String placa);
	public void actualizar(Vehiculo vehiculo);
	public void eliminar(String placa);
}
