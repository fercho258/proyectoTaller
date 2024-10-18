
//Crear el servicio

package com.tuempresa.proyecto_taller.service;

import com.tuempresa.proyecto_taller.Model.Producto;
import com.tuempresa.proyecto_taller.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service //Indica que la clase es un servicio de spring

public class ProductoService {

    @Autowired //Instancia de ProductoRepository
    private ProductoRepository productoRepository; //Permite acceder a los métodos del repositorio sin tener que instanciarlo manualmente

    //Métodos CRUD

    //Obtener una lista de todos los productos
    public List<Producto> listarProductos() {
        return productoRepository.findAll();
    }

    //Agregar producto
    public Producto agregarProducto(Producto producto) {
        return productoRepository.save(producto);
    }

    //Obtener el producto por ID
    public Optional<Producto> obtenerProductoPorId(Long id) {
        return productoRepository.findById(id);
    }

    //Eliminar producto
    public void eliminarProducto(Long id) {
        productoRepository.deleteById(id);
    }

}
