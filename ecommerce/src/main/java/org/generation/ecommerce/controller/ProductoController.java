package org.generation.ecommerce.controller;

import java.util.List;

import org.generation.ecommerce.model.Producto;
import org.generation.ecommerce.service.ProductoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/api/productos")
public class ProductoController {
	
	private final ProductoService productoService;
	
	@Autowired //para que este constructor sea llamado automáticamente al iniciar la aplicación
	public ProductoController(ProductoService productoService) {
		super();
		this.productoService = productoService;
	}//constructor

	@GetMapping
	public List<Producto> getAllProducts(){
		return productoService.getAllProductos();
	}
	
	@GetMapping("/{id}")
	public Producto getProduct(@PathVariable("id") Long id){
		return productoService.getProducto(id);
	}
	
	@DeleteMapping("/{id}")
	public Producto deleteProduct(@PathVariable("id") Long id){
		return productoService.deleteProduct(id);
	}
	
	@PostMapping
	public Producto addProduct(@RequestBody Producto producto) {
		return productoService.addProducto(producto);
	}
	
	@PutMapping("/{id}")
	public Producto updateProduct(@PathVariable("id") Long id, 
			@RequestParam(required=false) String nombre, 
			@RequestParam(required=false) String descripcion,
			@RequestParam(required=false) String imagen,
			@RequestParam(required=false) Double precio) {
		return productoService.updateProducto(id, nombre, descripcion, imagen, precio);
	}
	
	
	
	
}//class ProductoController
