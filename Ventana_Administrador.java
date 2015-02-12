package BalladaresCarreraMoreira;
import java.awt.EventQueue;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.BoxLayout;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Dimension;


public class Ventana_Administrador {

	private JFrame frame;
	private JTextField txtStock;
	private JTextField txtPrecio;
	private JTextField txtCantidadMonedas;
	ControladorMaquinita controladorAdmin; 

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana_Administrador window = new Ventana_Administrador();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana_Administrador() {
		
		initialize();
		controladorAdmin= new ControladorMaquinita(this); 
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 617, 144);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
		
		JPanel PanelProducto = new JPanel();
		frame.getContentPane().add(PanelProducto);
		PanelProducto.setLayout(new BoxLayout(PanelProducto, BoxLayout.X_AXIS));
		
		JComboBox JcbProducto = new JComboBox();
		JcbProducto.addItem("Producto1");
		JcbProducto.addItem("Producto2");
		JcbProducto.addItem("Producto3");
		JcbProducto.addItem("Producto4");
		JcbProducto.addItem("Producto5");
		JcbProducto.addItem("Producto6");
		JcbProducto.addItem("Producto7");
		JcbProducto.addItem("Producto8");
		PanelProducto.add(JcbProducto);
		
		JLabel lblStock = new JLabel("Stock: ");
		PanelProducto.add(lblStock);
		
		txtStock = new JTextField();
		PanelProducto.add(txtStock);
		txtStock.setColumns(10);
		
		JLabel lblPrecio = new JLabel("Precio:");
		PanelProducto.add(lblPrecio);
		
		txtPrecio = new JTextField();
		PanelProducto.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		JButton btnModificarProducto = new JButton("Modificar");
		PanelProducto.add(btnModificarProducto);
		
		JButton btnGuardarProducto = new JButton("Guardar");
		PanelProducto.add(btnGuardarProducto);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		
		JPanel PanelMonedas = new JPanel();
		frame.getContentPane().add(PanelMonedas);
		PanelMonedas.setLayout(new BoxLayout(PanelMonedas, BoxLayout.X_AXIS));
		
		JComboBox JcbMonedas = new JComboBox();
		JcbMonedas.addItem("Moneda de 5ctvs ");
		JcbMonedas.addItem("Moneda de 10ctvs ");
		JcbMonedas.addItem("Moneda de 25ctvs ");
		JcbMonedas.addItem("Moneda de 50ctvs ");
		JcbMonedas.addItem("Moneda de 1 dolar ");
		PanelMonedas.add(JcbMonedas);
		
		JLabel lblCantidadMonedas = new JLabel("Cantidad");
		PanelMonedas.add(lblCantidadMonedas);
		
		txtCantidadMonedas = new JTextField();
		txtCantidadMonedas.setColumns(10);
		PanelMonedas.add(txtCantidadMonedas);
		
		JButton btnModificarMonedas = new JButton("Modificar");
		btnModificarMonedas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		PanelMonedas.add(btnModificarMonedas);
		
		JButton btnGuardarMonedas = new JButton("Guardar");
		PanelMonedas.add(btnGuardarMonedas);
		
		JPanel panel_1 = new JPanel();
		frame.getContentPane().add(panel_1);
		
		JPanel PanelDinero = new JPanel();
		PanelDinero.setLayout(new BoxLayout(PanelDinero, BoxLayout.X_AXIS));
		frame.getContentPane().add(PanelDinero);
		
		JLabel lblDepositoVentas = new JLabel("Dep\u00F3sito Ventas: $");
		PanelDinero.add(lblDepositoVentas);
		
		JButton btnResetearDepositoVentas = new JButton("Resetear");
		PanelDinero.add(btnResetearDepositoVentas);
		
		Component rigidArea = Box.createRigidArea(new Dimension(20, 20));
		PanelDinero.add(rigidArea);
		
		JLabel lblDepositoVueltos = new JLabel("Dep\u00F3sito Vueltos: $");
		PanelDinero.add(lblDepositoVueltos);
		
		JButton btnResetearDepositoVueltos = new JButton("Resetear");
		PanelDinero.add(btnResetearDepositoVueltos);
	}

}
