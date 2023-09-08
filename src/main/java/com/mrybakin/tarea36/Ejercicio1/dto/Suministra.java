package com.mrybakin.tarea36.Ejercicio1.dto;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name="suministra")
public class Suministra {
	

	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int id;
    
    @Column(name="precio")
    private int precio;

    @ManyToOne
	@JoinColumn(name = "codigo_pieza")
	private Piezas piezas;
    
    @ManyToOne
	@JoinColumn(name = "id_proveedor")
	private Proveedores proveedores;
    
    public Suministra() {}

    public Suministra(int id, int precio, Piezas piezas, Proveedores proveedores) {
    	super();
    	this.id = id;
    	this.precio = precio;
    	this.piezas = piezas;
    	this.proveedores = proveedores;
    }
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Piezas getPiezas() {
		return piezas;
	}

	public void setPiezas(Piezas piezas) {
		this.piezas = piezas;
	}

	public Proveedores getProveedores() {
		return proveedores;
	}

	public void setProveedores(Proveedores proveedores) {
		this.proveedores = proveedores;
	}

}
