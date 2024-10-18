
//Crear repositorio

package com.tuempresa.proyecto_taller.repository;

import com.tuempresa.proyecto_taller.Model.Producto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//Extienda la interfaz con metodos(Crear, leer, actualizar y eliminar)

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}

