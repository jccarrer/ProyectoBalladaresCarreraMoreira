package BalladaresCarreraMoreira;
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.util.Vector;

import javax.swing.*;
import javax.swing.border.EmptyBorder;


@SuppressWarnings("serial")
public class Ventana extends JFrame{
	private JTextField txtUsuario;
	private JTextField txtContrasena;
	JPanel panelGrilla, PanelIzquierdoDinero, PanelInferiorAdministrador, PanelSuperiorInformación;
	JLabel lblProductoSeleccionado, lblFaltante, lblIngresarDinero, lblTotal, lblSuVueltoEs, lblVuelto, lblUsuario, lblContrasena; 
	JButton btn5ctv,btn10ctv,btn25ctv, btn50ctv, btn100ctv, btnComprar, btnIngresar; 
	 ControladorMaquinita controladorUsuario; 
	
	Ventana(MaquinaExpendedora maquina){
		super("Mï¿½quina Expendedora");
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		this.setLocation(100, 100);
		
		controladorUsuario = new ControladorMaquinita(this); 
		controladorUsuario.setMaquina(maquina);
		
		RepositorioProductos repoProductos = maquina.getRepoProductos();
		
		panelGrilla = new JPanel(new GridLayout(2,4,0,10));
		Vector<JPanel> vectorPaneles = new Vector<JPanel>();
		
		lblProductoSeleccionado = new JLabel("Producto Seleccionado: ");
		lblFaltante = new JLabel("Por Favor Ingrese: ");
		
		for (int i = 0; i < repoProductos.getSize(); i++) {
		
			vectorPaneles.add(i, new JPanel());
			vectorPaneles.get(i).setLayout(new BoxLayout(vectorPaneles.get(i), BoxLayout.Y_AXIS));
			
			vectorPaneles.get(i).add(new JLabel(repoProductos.obtenerProducto(i).getIdProducto()));
			vectorPaneles.get(i).add(new JButton(repoProductos.obtenerProducto(i).getImagen()));
			vectorPaneles.get(i).add(new JLabel(repoProductos.obtenerProducto(i).getNombre()));
			vectorPaneles.get(i).add(new JLabel("$" + String.valueOf(repoProductos.obtenerProducto(i).getPvp())));
			
			((JLabel)vectorPaneles.get(i).getComponent(0)).setAlignmentX(CENTER_ALIGNMENT);
			((JButton)vectorPaneles.get(i).getComponent(1)).setAlignmentX(CENTER_ALIGNMENT);
			((JButton)vectorPaneles.get(i).getComponent(1)).addActionListener(controladorUsuario); 
			((JButton)vectorPaneles.get(i).getComponent(1)).setActionCommand(String.valueOf(i));
			((JLabel)vectorPaneles.get(i).getComponent(2)).setAlignmentX(CENTER_ALIGNMENT);
			((JLabel)vectorPaneles.get(i).getComponent(3)).setAlignmentX(CENTER_ALIGNMENT);

			panelGrilla.add(vectorPaneles.get(i));
		}
		
		PanelIzquierdoDinero = new JPanel();
		this.getContentPane().add(PanelIzquierdoDinero, BorderLayout.EAST);
		PanelIzquierdoDinero.setLayout(new BoxLayout(PanelIzquierdoDinero, BoxLayout.Y_AXIS));
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		PanelIzquierdoDinero.add(rigidArea);
		
		lblIngresarDinero = new JLabel("Dinero:");
		PanelIzquierdoDinero.add(lblIngresarDinero);
		
		
		ImageIcon mon5=new ImageIcon("src\\BalladaresCarreraMoreira\\Imagenes\\moneda5.gif");
		btn5ctv = new JButton(mon5);
		btn5ctv.addActionListener(controladorUsuario); 
		PanelIzquierdoDinero.add(btn5ctv);
		
		btn10ctv = new JButton("+0,10");
		btn10ctv.addActionListener(controladorUsuario); 
		PanelIzquierdoDinero.add(btn10ctv);
		
		btn25ctv = new JButton("+0,25");
		btn25ctv.addActionListener(controladorUsuario); 
		PanelIzquierdoDinero.add(btn25ctv);
		
		btn50ctv = new JButton("+0,50");
		btn50ctv.addActionListener(controladorUsuario); 
		PanelIzquierdoDinero.add(btn50ctv);
		
		btn100ctv = new JButton("+1,00");
		btn100ctv.addActionListener(controladorUsuario); 
		PanelIzquierdoDinero.add(btn100ctv);
		
		Component verticalStrut = Box.createVerticalStrut(20);
		PanelIzquierdoDinero.add(verticalStrut);
		
		lblTotal = new JLabel("$$$");
		PanelIzquierdoDinero.add(lblTotal);
		
		btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(controladorUsuario); 
		PanelIzquierdoDinero.add(btnComprar);
		
		lblSuVueltoEs = new JLabel("Su vuelto es: ");
		PanelIzquierdoDinero.add(lblSuVueltoEs);
		
		lblVuelto = new JLabel("$$$");
		PanelIzquierdoDinero.add(lblVuelto);
		

		PanelInferiorAdministrador = new JPanel();
		this.getContentPane().add(PanelInferiorAdministrador, BorderLayout.SOUTH);
		
		lblUsuario = new JLabel("Usuario:");
		PanelInferiorAdministrador.add(lblUsuario);
		
		txtUsuario = new JTextField();
		PanelInferiorAdministrador.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		lblContrasena = new JLabel("Contrase\u00F1a:");
		PanelInferiorAdministrador.add(lblContrasena);
		
		txtContrasena = new JTextField();
		PanelInferiorAdministrador.add(txtContrasena);
		txtContrasena.setColumns(10);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(controladorUsuario); 
		PanelInferiorAdministrador.add(btnIngresar);
		
		PanelSuperiorInformación = new JPanel();
		this.getContentPane().add(PanelSuperiorInformación, BorderLayout.NORTH);
		PanelSuperiorInformación.setLayout(new BoxLayout(PanelSuperiorInformación, BoxLayout.Y_AXIS));
		
		PanelSuperiorInformación.add(lblProductoSeleccionado);
		PanelSuperiorInformación.add(lblFaltante);
		
		
	
		this.getContentPane().add(panelGrilla, BorderLayout.CENTER);
		((JComponent) this.getContentPane()).setBorder(new EmptyBorder(20, 20, 20, 20));
		pack();
		this.setVisible(true);
	}
	
	
		public void colocarDatosArriba(String nombre , double precio) {
			lblProductoSeleccionado.setText("El producto Seleccionado es: "+nombre);
			lblFaltante.setText( String.valueOf("El precio del producto es: $"+precio));
	}

}
