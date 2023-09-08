package com.mrybakin.tarea36.Ejercicio1.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.mrybakin.tarea36.Ejercicio1.dto.Piezas;

public interface PiezasRepository extends JpaRepository<Piezas, Integer> {

}
