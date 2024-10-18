
//Crear Controlador

package com.tuempresa.proyecto_taller.Controller;

import com.tuempresa.proyecto_taller.Model.Producto;
import com.tuempresa.proyecto_taller.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController // Indica que la clase maneja solicitudes HTTP y como respuesta devuielva datos JSON o XML
@RequestMapping("/api/productos") //Especifica la ruta para las solicitudes (El que se pone el postman)

public class ProductoController {
    //Dependencias
    @Autowired
    private ProductoService productoService;

    //Listar producto
    @GetMapping
    public List<Producto> listarProductos() {
        return productoService.listarProductos();
    }
    @PostMapping
    public Producto agregarProducto(@RequestBody Producto producto) {
        return productoService.agregarProducto(producto);
    }

    //Obtener productor por id
    @GetMapping("/{id}")
    public ResponseEntity<Producto> obtenerProducto(@PathVariable Long id) {
        Optional<Producto> producto =
                productoService.obtenerProductoPorId(id);
        //Envia respuesta
        if (producto.isPresent()) {
            return ResponseEntity.ok(producto.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    //Eliminar producto
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarProducto(@PathVariable Long id) {
        productoService.eliminarProducto(id);
        return ResponseEntity.noContent().build(); //Devuelve respuesta 204 despues de eliminar
    }

}
