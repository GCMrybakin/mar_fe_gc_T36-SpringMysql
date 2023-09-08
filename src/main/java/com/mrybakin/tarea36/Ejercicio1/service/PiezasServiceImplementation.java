package com.mrybakin.tarea36.Ejercicio1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mrybakin.tarea36.Ejercicio1.dao.PiezasRepository;
import com.mrybakin.tarea36.Ejercicio1.dto.Piezas;
import com.mrybakin.tarea36.Ejercicio1.service.IPiezasService;

@Service
public class PiezasServiceImplementation implements IPiezasService {
	@Autowired
	PiezasRepository PiezasRepo;

	@Override
	public List<Piezas> listarPiezas() {
		// TODO Auto-generated method stub
		return PiezasRepo.findAll();
	}

	@Override
	public Piezas buscarPiezasID(int codigo) {
		// TODO Auto-generated method stub
		return PiezasRepo.findById(codigo).get();
	}

	@Override
	public Piezas guardarPiezas(Piezas piezas) {
		// TODO Auto-generated method stub
		return PiezasRepo.save(piezas);
	}

	@Override
	public Piezas actualizarPieza(Piezas piezas) {
		// TODO Auto-generated method stub
		return PiezasRepo.save(piezas);
	}

	@Override
	public void eliminarPiezas(int codigo) {
		// TODO Auto-generated method stub
		PiezasRepo.deleteById(codigo);
	}

}
