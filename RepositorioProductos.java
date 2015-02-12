package BalladaresCarreraMoreira;

import java.util.Vector;

public class RepositorioProductos {
	private Vector <Producto> coleccionProducto;

	public RepositorioProductos() {
		this.setColeccionProducto(new Vector <Producto> ());
	}

	public Vector<Producto> getColeccionProducto() {
		return coleccionProducto;
	}

	public void setColeccionProducto(Vector<Producto> coleccionProducto) {
		this.coleccionProducto = coleccionProducto;
	}
	
	public Producto obtenerProducto(int index){
		return this.getColeccionProducto().get(index);
	}
	
	public void agregarProducto(Producto producto){
		this.getColeccionProducto().add(producto);
	}
	
	public void agregarProducto(Producto producto, int index){
		this.getColeccionProducto().add(index, producto);
	}
	
	public void eliminarProducto(int index){
		this.getColeccionProducto().remove(index);
	}
	
	public void vaciar(){
		this.getColeccionProducto().clear();
	}
	
	public int getSize(){
		return this.getColeccionProducto().size();
	}
}
