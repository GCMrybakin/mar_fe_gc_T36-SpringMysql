package com.mrybakin.tarea36.Ejercicio1.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.mrybakin.tarea36.Ejercicio1.dto.Suministra;
import com.mrybakin.tarea36.Ejercicio1.service.ISuministraService;
import com.mrybakin.tarea36.Ejercicio1.service.SuministraServiceImplementation;
@RestController
@RequestMapping("/api")
public class SuministraController {
	@Autowired
	SuministraServiceImplementation SuministraService;
	
	@GetMapping("/Suministra")
	public List<Suministra> listarSuministras(){
		return SuministraService.listarSuministra();
	}
	
	@GetMapping("/Suministra/{codigo}")
	public Suministra mostrarSuministrasID(@PathVariable(name="codigo") int codigo) {
		return SuministraService.buscarSuministraID(codigo);
	}
	@PostMapping("/Suministra")
	public Suministra guardarPelicula(@RequestBody Suministra Suministras) {
		return SuministraService.guardarSuministra(Suministras);
	}
	
	@PutMapping("/Suministra/{codigo}")
	public Suministra actualizarPelicula(@PathVariable(name="codigo") int codigo, @RequestBody Suministra Suministras) {
		Suministra SuministraSel = new Suministra();
		Suministra SuministraAct = new Suministra();
		SuministraSel = SuministraService.buscarSuministraID(codigo);
		SuministraSel.setPrecio(Suministras.getPrecio());
		SuministraAct = SuministraService.actualizarSuministra(SuministraSel);
		System.out.println("Suministro actualizada, nuevo suministro =" + SuministraAct);
		return SuministraAct;
	}
	
	@DeleteMapping("/Suministra/{codigo}")
	public void eliminarPelicula(@PathVariable(name="codigo") int codigo) {
		SuministraService.eliminarSuministra(codigo);
	}

}
