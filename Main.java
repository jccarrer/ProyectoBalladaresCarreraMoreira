package BalladaresCarreraMoreira;

import javax.swing.ImageIcon;


public class Main {

	public static void main(String[] args) {
		DepositoVueltos vueltos = new DepositoVueltos();
		
		vueltos.agregarMonedas(600,5);		//Agregar 600 monedas de 5 centavos
		vueltos.agregarMonedas(55,10);		//Agregar 55 monedas de 10 centavos
		vueltos.agregarMonedas(30,25);		//Agregar 30 monedas de 25 centavos
		vueltos.agregarMonedas(80,50);		//Agregar 80 monedas de 50 centavos
		vueltos.agregarMonedas(60,100);		//Agregar 60 monedas de 1 Dolar
		
		vueltos.agregarMonedas(1,100);
		
		vueltos.mostrarMonedas();			//Muestra Todas las monedas
		vueltos.mostrarMonedas(10);			//Muestra las monedas de 10 centavos
		vueltos.dineroTotal();				//Muestra la cantidad de dinero total en d�lares
		
		vueltos.sustraerMonedas(25,5);		//Sustrae 25 monedas de 5 centavos
		vueltos.mostrarMonedas(5);
		vueltos.dineroTotal();
		vueltos.vaciarDeposito();
		vueltos.dineroTotal();
		
		//--------------------------------------
		MaquinaExpendedora maquina = new MaquinaExpendedora();
		RepositorioProductos repoProductos = new RepositorioProductos();
		repoProductos.agregarProducto(new Producto("001", "Doritos", (double)0.40, new ImageIcon("src\\BalladaresCarreraMoreira\\Imagenes\\doritos_bag.gif")));
		repoProductos.agregarProducto(new Producto("002", "Pepsi", (double)0.50, new ImageIcon("src\\BalladaresCarreraMoreira\\Imagenes\\pepsi_can.gif")));
		repoProductos.agregarProducto(new Producto("003", "Club Social", (double)0.35, new ImageIcon("src\\BalladaresCarreraMoreira\\Imagenes\\club_social.gif")));
		repoProductos.agregarProducto(new Producto("004", "Manicho", (double)0.45, new ImageIcon("src\\BalladaresCarreraMoreira\\Imagenes\\manicho.gif")));
		repoProductos.agregarProducto(new Producto("005", "Agua", (double)0.50, new ImageIcon("src\\BalladaresCarreraMoreira\\Imagenes\\aguaFully.gif")));
		repoProductos.agregarProducto(new Producto("006", "tortolines", (double)0.5, new ImageIcon("src\\BalladaresCarreraMoreira\\Imagenes\\tortolinesFully.gif")));
		repoProductos.agregarProducto(new Producto("007", "laysFully", (double)0.50, new ImageIcon("src\\BalladaresCarreraMoreira\\Imagenes\\laysFully.gif")));
		maquina.setRepoProductos(repoProductos);
		
		for (int i = 0; i < repoProductos.getSize() ; i++) {
			System.out.println(repoProductos.obtenerProducto(i).toString());
		}
		
		Ventana vista = new Ventana(maquina);
//		ControladorMaquinita controlador = new ControladorMaquinita(maquina);
	}

}
