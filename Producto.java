package BalladaresCarreraMoreira;

import javax.swing.ImageIcon;


public class Producto {
	private String idProducto;		//001-258438-32
	private String nombre;			//Gatorade
	private double pvp;				//$0,80
	private ImageIcon imagen;		//Imagen del producto
	
	public Producto(){
	}
	
	public Producto(String idProducto, String nombre, double pvp, ImageIcon imagen) {
		this.setIdProducto(idProducto);
		this.setNombre(nombre);
		this.setPvp(pvp);
		this.setImagen(imagen);
	}

	
	//BLOQUE SETTERS & GETTERS
	public String getIdProducto() {
		return idProducto;
	}

	public void setIdProducto(String idProducto) {
		this.idProducto = idProducto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public double getPvp() {
		return pvp;
	}

	public void setPvp(double pvp) {
		this.pvp = pvp;
	}

	public ImageIcon getImagen() {
		return imagen;
	}

	public void setImagen(ImageIcon imagen) {
		this.imagen = imagen;
	}

	@Override
	public String toString() {
		return "Producto [idProducto=" + idProducto + ", nombre=" + nombre
				+ ", pvp=" + pvp + ", imagen=" + imagen + "]";
	}
	
	
}
