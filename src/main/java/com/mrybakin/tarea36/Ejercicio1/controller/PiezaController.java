package com.mrybakin.tarea36.Ejercicio1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mrybakin.tarea36.Ejercicio1.dto.Piezas;
import com.mrybakin.tarea36.Ejercicio1.service.IPiezasService;
import com.mrybakin.tarea36.Ejercicio1.service.PiezasServiceImplementation;
@RestController
@RequestMapping("/api")
public class PiezaController {
	@Autowired
	PiezasServiceImplementation PiezaService;
	
	@GetMapping("/Piezas")
	public List<Piezas> listarPiezas(){
		return PiezaService.listarPiezas();
	}
	
	@GetMapping("/Piezas/{codigo}")
	public Piezas mostrarPiezasID(@PathVariable(name="codigo") int codigo) {
		return PiezaService.buscarPiezasID(codigo);
	}
	@PostMapping("/Piezas")
	public Piezas guardarPelicula(@RequestBody Piezas Piezas) {
		return PiezaService.guardarPiezas(Piezas);
	}
	
	@PutMapping("/Piezas/{codigo}")
	public Piezas actualizarPelicula(@PathVariable(name="codigo") int codigo, @RequestBody Piezas Piezas) {
		Piezas Piezasel = new Piezas();
		Piezas PeliculaAct = new Piezas();
		Piezasel = PiezaService.buscarPiezasID(codigo);
		Piezasel.setNombre(Piezas.getNombre());
		
		PeliculaAct = PiezaService.actualizarPieza(Piezasel);
		System.out.println("Pieza actualizada = " + Piezasel);
		return PeliculaAct;
	}
	
	@DeleteMapping("/Piezas/{codigo}")
	public void eliminarPelicula(@PathVariable(name="codigo") int codigo) {
		PiezaService.eliminarPiezas(codigo);
	}

}
