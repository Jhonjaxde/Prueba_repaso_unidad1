package com.uce.edu.matriculacion.repository.modelo;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;
@Component
public class Propietario {
	private String name;
	private String apellido;
	private String cedula;
	private LocalDateTime fechaNacimiento;
	
	//SET AND GET
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public LocalDateTime getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(LocalDateTime fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	@Override
	public String toString() {
		return "Propietario [name=" + name + ", apellido=" + apellido + ", cedula=" + cedula + ", fechaNacimiento="
				+ fechaNacimiento + "]";
	}
	
	
	
}
