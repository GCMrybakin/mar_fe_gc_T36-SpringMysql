package com.mrybakin.tarea36.Ejercicio1.service;

import java.util.List;

import com.mrybakin.tarea36.Ejercicio1.dto.Piezas;

public interface IPiezasService {
	public List<Piezas> listarPiezas();
	public Piezas buscarPiezasID(int codigo);
	public Piezas guardarPiezas(Piezas piezas);
	public Piezas actualizarPieza(Piezas piezas);
	public void eliminarPiezas(int codigo);
	
}