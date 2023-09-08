package com.mrybakin.tarea36.Ejercicio1.service;

import java.util.List;

import com.mrybakin.tarea36.Ejercicio1.dto.Suministra;

public interface ISuministraService {
	public List<Suministra> listarSuministra();
	public Suministra buscarSuministraID(int codigo);
	public Suministra guardarSuministra(Suministra suministra);
	public Suministra actualizarSuministra(Suministra suministra);
	public void eliminarSuministra(int id);
}
