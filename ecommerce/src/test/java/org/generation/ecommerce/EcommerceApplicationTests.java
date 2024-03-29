package org.generation.ecommerce;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.generation.ecommerce.model.Producto;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;
import static org.hamcrest.Matchers.containsString;

@SpringBootTest
@AutoConfigureMockMvc
class EcommerceApplicationTests {
	
	@Autowired
	private MockMvc mockMvc;
	
	@Test
	@DisplayName("Se prueba el producto 2 /api/productos/2")
	void pruebaGET() throws Exception{
		this.mockMvc.perform(get("/api/productos/2"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Lapiz 2 bic")));
		
		
	}//pruebaGET
	
	@Test
	@Disabled("Probado la primera vez, deshabilidato")//Este se pone para que no vuelva a borrar
	@DisplayName("Se borra el producto 2 /api/productos/2")
	void pruebaDELETE() throws Exception{
		this.mockMvc.perform(delete("/api/productos/2"))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(content().string(containsString("Lapiz 2 bic")));
		
		
	}//pruebaGET
	
	@Test
	@DisplayName("Se agrega un producto")
	void pruebaPOST() throws Exception {
		Producto p = new Producto();
		p.setNombre("Cuaderno Profesional Scribe Clásico / Doble Raya / 200 hojas");
		p.setImagen("producto_9.png");
		p.setDescripcion("Cuaderno Profesional Scribe Clásico / Doble Raya / 200 hojas");
		p.setPrecio(120.01);
		this.mockMvc.perform(post("/api/productos/")
				.contentType(MediaType.APPLICATION_JSON)
				.content(asJsonString(p)))
		.andDo(print())
		.andExpect(status().isOk())
		.andExpect(
				content().string(containsString("producto_9.jpg")));
		
	}
	
	private static String asJsonString(final Object obj) {
	    try {
	      return new ObjectMapper().writeValueAsString(obj);
	    } catch (Exception e) {
	      throw new RuntimeException(e);
	    }//catch
	 } // asJsonString
	

}
