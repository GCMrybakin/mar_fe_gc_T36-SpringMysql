package com.mrybakin.tarea36.Ejercicio1.dto;

import jakarta.persistence.*;
import java.util.*;

@Entity
@Table(name="piezas")
public class Piezas {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique=true, nullable=false)
    private int codigo;
    @Column(length=100)
    private String nombre;
    @OneToMany(mappedBy = "piezas")
   	private List<Suministra> suministros;
    
    public Piezas() {}
    
    public Piezas(int codigo, String nombre, List<Suministra> suministros) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.suministros = suministros;
	}
    
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
