package BalladaresCarreraMoreira;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

public class ControladorMaquinita implements ActionListener{

	MaquinaExpendedora maquina; 
	Ventana ventanaUsuario; 
	Ventana_Administrador ventanaAdministrador; 
	
		
	public ControladorMaquinita(MaquinaExpendedora maquina,
			Ventana ventanaUsuario, Ventana_Administrador ventanaAdministrador) {
		super();
		this.setMaquina(maquina); 
		this.setVentanaUsuario(ventanaUsuario); 
		this.setVentanaAdministrador(ventanaAdministrador); 
	}

	public ControladorMaquinita(Ventana ventana) {
	this.setVentanaUsuario(ventana); 	
	
	}

	public ControladorMaquinita(MaquinaExpendedora maquinaExpendedora) {
		this.setMaquina(maquinaExpendedora); 
//		ventanaUsuario = new Ventana(maquina.getRepoProductos());
//		ventanaUsuario.controladorUsuario = this;
		}

	public ControladorMaquinita(Ventana_Administrador ventana_Administrador) {
		this.setVentanaAdministrador(ventana_Administrador);
	}


	public MaquinaExpendedora getMaquina() {
		return maquina;
	}




	public void setMaquina(MaquinaExpendedora maquina) {
		this.maquina = maquina;
	}




	public Ventana getVentanaUsuario() {
		return ventanaUsuario;
	}




	public void setVentanaUsuario(Ventana ventanaUsuario) {
		this.ventanaUsuario = ventanaUsuario;
	}




	public Ventana_Administrador getVentanaAdministrador() {
		return ventanaAdministrador;
	}




	public void setVentanaAdministrador(Ventana_Administrador ventanaAdministrador) {
		this.ventanaAdministrador = ventanaAdministrador;
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		
		JButton btnSeleccionado = (JButton) e.getSource();
		
		
		if (btnSeleccionado == ventanaUsuario.btnIngresar) {
			JOptionPane.showMessageDialog(null, "Hola! He funcionado:) ");
			
		}else {
			String seleccionProducto;
			seleccionProducto = btnSeleccionado.getActionCommand(); 
			System.out.println(seleccionProducto);
			ventanaUsuario.colocarDatosArriba(maquina.getProducto(Integer.parseInt(seleccionProducto)).getNombre(), maquina.getProducto(Integer.parseInt(seleccionProducto)).getPvp());
		}
		
		
		

		
		

	
		
		
	}

}
