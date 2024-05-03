//Para importar cada librería concreta
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

//Para importar todas las librerias de java.util
import java.util.*;

public class Producto{

	// Declaramos los atributos como privados
	private String nombre;
	private int id;
	private String categoria;
	private float precio;
	private int cantidad;
	private Date fechaCaducidad;
	private String contrasena;


	//Creamos el constructor público para la clase Producto y le pasamos los argumentos privados que hemos declarado anteriormente (ahora seran accesibles con el constructor)
	public Producto(String nombre, int id, String categoria, float precio, int cantidad, Date fechaCaducidad){
		this.nombre = nombre;
		this.id = id;
		this.categoria = categoria;
		this.precio = precio;
		this.cantidad = cantidad;
		this.fechaCaducidad = fechaCaducidad;
	}

}


public class Inventario{

	//Creamos la lista de productos de forma privada
	private List<Producto> productos;

	//Creamos el constructor de Inventario, no le pasamos argumentos, se los pasaremos en la función de añadir a la lista "addProducto"
	public Inventario(){
		//Le decimos que nuestra lista "productos" sera una nueva arrayList
		productos = new ArrayList<>();
	}

	//Cuando se llame al método desde el main, con los argumentos adecuados (los productos de tipo producto), añadiremos cada producto a la lista "productos".
	public void addProducto(Producto producto1){
		productos.add(producto1);
	}
	
	//Cuando se llame al método desde el main, con los argumentos adecuados (los productos de tipo producto), eliminaremos cada producto a la lista "productos".
	public void eliminarProducto(Producto producto1){
		productos.remove(producto1);
	}


}




public class Main{

	public static void main(String [] args){

			// crear invetario (se debe crear tanto para el método 1 como para el 2)
			Inventario inventario = new Inventario();

			// Crear producto (método 1)
			Producto producto_ejemplo = new Producto("Manzana", 3, "Fruta", 0.30, 20, "20/04/2024");
			// Añadir producto a inventario (método 1)
			inventario.addProducto(producto_ejemplo);

			// mótodo 2 - Crear y añadir producto a inventario todo a la vez.
			inventario.addProducto(new Producto("Pera", 4, "Fruta", 0.20, 20, "20/04/2024"));


			inventario.eliminarProducto(producto_ejemplo);
	}

}


