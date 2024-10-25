package com.uxueOrm.model;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;


@Entity
public class Empleado implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@Column
	private Long codigo;
	
	@Column
	private  String apellidos;
	@Column
	private String nombre;
	
	@Column
	private Date fecha;
	
	@OneToOne(cascade= {CascadeType.ALL})
	@JoinColumn(name= "Id_pasaporte")
	private Pasaporte id_pasaporte;
	
	

	

	public Empleado() {
		
	}


	public Empleado(Long codigo, String apellidos, String nombre, Date fecha) {
	
		this.codigo = codigo;
		this.apellidos = apellidos;
		this.nombre = nombre;
		this.fecha = fecha;
	}


	
	public Long getCodigo() {
		return codigo;
	}


	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public Date getFecha() {
		return fecha;
	}


	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public Pasaporte getId_pasaporte() {
		return id_pasaporte;
	}


	public void setId_pasaporte(Pasaporte id_pasaporte) {
		this.id_pasaporte = id_pasaporte;
	}


	@Override
	public String toString() {
		return "Empleado [codigo=" + codigo + ", apellidos=" + apellidos + ", nombre=" + nombre + ", fecha=" + fecha
				+ ", id_pasaporte=" + id_pasaporte + "]";
	}
	



	
	


	

}
