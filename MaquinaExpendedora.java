package BalladaresCarreraMoreira;

import java.io.Serializable;
import java.util.Vector;

import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class MaquinaExpendedora implements Serializable{
	private RepositorioProductos repoProductos;
	private DepositoVueltos depoVuelto; 
//	private ControladorMaquinita controlador= new ControladorMaquinita(this); ; 
	

	
	public RepositorioProductos getRepoProductos() {
		return repoProductos;
	}

	public void setRepoProductos(RepositorioProductos repoProductos) {
		this.repoProductos = repoProductos;
	}

	public Producto getProducto(int index){
		return this.getRepoProductos().obtenerProducto(index);
	}
	
	public Vector<ImageIcon> obtenerImagenes(){
		Vector<ImageIcon> coleccionImagenes = new Vector<ImageIcon>();
		for (int i = 0; i < this.getRepoProductos().getSize(); i++) {
			coleccionImagenes.add(this.getProducto(i).getImagen());
		}
		
		return coleccionImagenes;
		
	}
}
