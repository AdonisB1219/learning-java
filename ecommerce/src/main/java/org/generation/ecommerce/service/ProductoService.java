package org.generation.ecommerce.service;

import java.util.List;

import org.generation.ecommerce.model.Producto;
import org.generation.ecommerce.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoService {
	
//	private final ArrayList<Producto> lista = new ArrayList<>();
	private final ProductoRepository productoRepository;

	@Autowired
	public ProductoService(ProductoRepository productoRepository) {
		
		this.productoRepository = productoRepository;
		
		/*lista.add(new Producto("Cuaderno Profesional Norma 58813 / Raya / 100 hojas",
				" Cuaderno profesional / Cubiertas estándar / Espiral doble ",
					"norma1.gif", 57.0));
		lista.add(new Producto("CUADERNO PROFESIONAL NORMA FERRARI (RAYA, 120 H.)",
				"Doble espiral reforzado / Pastas semirrígidas","norma2.jpg", 219.0));
		lista.add(new Producto("Plumas Bic Cristal Intenso Fashion",
				"Plumas Bic Cristal Intenso Fashion / Punto extra grueso / Tinta colores surtidos",
				"bic1.jpg", 46.50));
		lista.add(new Producto("Plumas Bic Cristal Intenso",
				" Plumas Bic Cristal Intenso / Punto extra grueso / Tinta negra roja azul / 3 piezas",
				"bic2.jpg", 27.20));*/
		
	}//Constructor

	public List<Producto> getAllProductos() {
		return productoRepository.findAll();
//		return lista;
	}//GETaLLProductos

	public Producto getProducto(Long id) {
		return productoRepository.findById(id).orElseThrow(()-> new IllegalArgumentException("El producto con el id [" + id + "] no existe"));
		
		/*Producto tmp = null;
		for (Producto producto : lista) {
			if (producto.getId().equals(id)) {
				tmp = producto;
				break;
			}
		}
		return tmp;*/
	}//GetProducto

	public Producto deleteProduct(Long id) {
		
		Producto tmp = null;
		if(productoRepository.existsById(id)) {
			tmp = productoRepository.findById(id).get();
			productoRepository.deleteById(id);
		}
		
		return tmp;
		/*Producto tmp = null;
		for (Producto producto : lista) {
			if (producto.getId().equals(id)) {
				tmp = lista.remove(lista.indexOf(producto));
				break;
			}
		}
		return tmp;*/
	}

	public Producto addProducto(Producto producto) {
		Producto tmp = null;
		if(productoRepository.findByNombre(producto.getNombre()).isEmpty()) {
		    tmp = productoRepository.save(producto);
	    } else{
	    	System.out.println("Ya existe el producto con el nombre [" + producto.getNombre()
	    			+ "]");
	    }
		return tmp;
//		lista.add(producto);
//		return producto;
	}

	public Producto updateProducto(Long id, String nombre, String descripcion, String imagen, Double precio) {
		Producto tmp = null;
		if(productoRepository.existsById(id)) {
			tmp = productoRepository.findById(id).get();
			if(nombre!=null) tmp.setNombre(nombre);
				if(descripcion!=null) tmp.setDescripcion(descripcion);
				if(imagen!=null) tmp.setImagen(imagen);
				if(precio!=null) tmp.setPrecio(precio);
				productoRepository.save(tmp);
			} else { System.out.println("El producto con el id [" + id + "] no existe");
				
		}
		return tmp;
		/*Producto tmp = null;
		for (Producto producto : lista) {
			if (producto.getId().equals(id)) {
				if(nombre!=null) producto.setNombre(nombre);
				if(descripcion!=null) producto.setDescripcion(descripcion);
				if(imagen!=null) producto.setImagen(imagen);
				if(precio!=null) producto.setPrecio(precio);
				tmp = producto;
				break;
			}
		}
		return tmp;*/
	}
	

}//class ProductoService
