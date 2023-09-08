package com.mrybakin.tarea36.Ejercicio1.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.mrybakin.tarea36.Ejercicio1.dao.SuministraRepository;
import com.mrybakin.tarea36.Ejercicio1.dto.Suministra;
import com.mrybakin.tarea36.Ejercicio1.service.ISuministraService;

@Service
public class SuministraServiceImplementation implements ISuministraService {
	@Autowired
	SuministraRepository SuministraRepo;

	@Override
	public List<Suministra> listarSuministra() {
		// TODO Auto-generated method stub
		return SuministraRepo.findAll();
	}

	@Override
	public Suministra buscarSuministraID(int codigo) {
		// TODO Auto-generated method stub
		return SuministraRepo.findById(codigo).get();
	}

	@Override
	public Suministra guardarSuministra(Suministra suministra) {
		// TODO Auto-generated method stub
		return SuministraRepo.save(suministra);
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		// TODO Auto-generated method stub
		return SuministraRepo.save(suministra);
	}

	@Override
	public void eliminarSuministra(int id) {
		// TODO Auto-generated method stub
		SuministraRepo.deleteById(id);
	}


}
