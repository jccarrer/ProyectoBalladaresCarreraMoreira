package BalladaresCarreraMoreira;

import java.util.Vector;


public class DepositoVueltos {
	private Vector <Moneda> coleccionMonedasDe5;
	private Vector <Moneda> coleccionMonedasDe10;
	private Vector <Moneda> coleccionMonedasDe25;
	private Vector <Moneda> coleccionMonedasDe50;
	private Vector <Moneda> coleccionMonedasDeDolar;
	
	public DepositoVueltos() {
		this.setColeccionMonedasDe5(new Vector <Moneda>());
		this.setColeccionMonedasDe10(new Vector <Moneda>());
		this.setColeccionMonedasDe25(new Vector <Moneda>());
		this.setColeccionMonedasDe50(new Vector <Moneda>());
		this.setColeccionMonedasDeDolar(new Vector <Moneda>());
	}
	
	public DepositoVueltos(Vector<Moneda> coleccionMonedasDe5,
			Vector<Moneda> coleccionMonedasDe10,
			Vector<Moneda> coleccionMonedasDe25,
			Vector<Moneda> coleccionMonedasDe50,
			Vector<Moneda> coleccionMonedasDeDolar) {
		this.setColeccionMonedasDe5(coleccionMonedasDe50);
		this.setColeccionMonedasDe10(coleccionMonedasDe10);
		this.setColeccionMonedasDe25(coleccionMonedasDe25);
		this.setColeccionMonedasDe50(coleccionMonedasDe50);
		this.setColeccionMonedasDeDolar(coleccionMonedasDeDolar);
	}
	
	public Vector<Moneda> getColeccionMonedasDe5() {
		return coleccionMonedasDe5;
	}
	public void setColeccionMonedasDe5(Vector<Moneda> coleccionMonedasDe5) {
		this.coleccionMonedasDe5 = coleccionMonedasDe5;
	}
	public Vector<Moneda> getColeccionMonedasDe10() {
		return coleccionMonedasDe10;
	}
	public void setColeccionMonedasDe10(Vector<Moneda> coleccionMonedasDe10) {
		this.coleccionMonedasDe10 = coleccionMonedasDe10;
	}
	public Vector<Moneda> getColeccionMonedasDe25() {
		return coleccionMonedasDe25;
	}
	public void setColeccionMonedasDe25(Vector<Moneda> coleccionMonedasDe25) {
		this.coleccionMonedasDe25 = coleccionMonedasDe25;
	}
	public Vector<Moneda> getColeccionMonedasDe50() {
		return coleccionMonedasDe50;
	}
	public void setColeccionMonedasDe50(Vector<Moneda> coleccionMonedasDe50) {
		this.coleccionMonedasDe50 = coleccionMonedasDe50;
	}
	public Vector<Moneda> getColeccionMonedasDeDolar() {
		return coleccionMonedasDeDolar;
	}
	public void setColeccionMonedasDeDolar(Vector<Moneda> coleccionMonedasDeDolar) {
		this.coleccionMonedasDeDolar = coleccionMonedasDeDolar;
	}

	
	public void agregarMonedas(int i, int j) {
		switch (j) {
		case 5:
			for (int m = 0; m < i; m++) {
				this.getColeccionMonedasDe5().add(new Moneda(j));}break;
		case 10:
			for (int m = 0; m < i; m++) {
				this.getColeccionMonedasDe10().add(new Moneda(j));}break;
		case 25:
			for (int m = 0; m < i; m++) {
				this.getColeccionMonedasDe25().add(new Moneda(j));}break;
		case 50:
			for (int m = 0; m < i; m++) {
				this.getColeccionMonedasDe50().add(new Moneda(j));}break;
		case 100:
			for (int m = 0; m < i; m++) {
				this.getColeccionMonedasDeDolar().add(new Moneda(j));}break;
		default:
			break;
		}
	}

	public void mostrarMonedas() {
		System.out.println("Monedas de 5 ctvs: "+this.getColeccionMonedasDe5().size());
		System.out.println("Monedas de 10 ctvs: "+this.getColeccionMonedasDe10().size());
		System.out.println("Monedas de 25 ctvs: "+this.getColeccionMonedasDe25().size());
		System.out.println("Monedas de 50 ctvs: "+this.getColeccionMonedasDe50().size());
		System.out.println("Monedas de 1 Dólar: "+this.getColeccionMonedasDeDolar().size());
	}

	public void mostrarMonedas(int i) {
		switch (i) {
		case 5:
			System.out.println("Monedas de 5 ctvs: "+this.getColeccionMonedasDe5().size()); break;
		case 10:
			System.out.println("Monedas de 10 ctvs: "+this.getColeccionMonedasDe10().size()); break;
		case 25:
			System.out.println("Monedas de 25 ctvs: "+this.getColeccionMonedasDe25().size()); break;
		case 50:
			System.out.println("Monedas de 50 ctvs: "+this.getColeccionMonedasDe50().size()); break;
		case 100:
			System.out.println("Monedas de 1 Dólar: "+this.getColeccionMonedasDeDolar().size()); break;
		default:
			break;
		}
	}

	public void dineroTotal() {
		double total = 0;
		total = this.getColeccionMonedasDe5().size()*5 + this.getColeccionMonedasDe10().size()*10
				+ this.getColeccionMonedasDe25().size()*25 + this.getColeccionMonedasDe50().size()*50
				+ this.getColeccionMonedasDeDolar().size()*100;
		System.out.println("Dinero Total: $" + (double)total/100);
	}

	public void vaciarDeposito() {
		this.getColeccionMonedasDe5().clear();
		this.getColeccionMonedasDe10().clear();
		this.getColeccionMonedasDe25().clear();
		this.getColeccionMonedasDe50().clear();
		this.getColeccionMonedasDeDolar().clear();
	}

	public void sustraerMonedas(int i, int j) {
		switch (j) {
		case 5:
			for (int m = 0; m < i; m++) {
				this.getColeccionMonedasDe5().remove(m);}break;
		case 10:
			for (int m = 0; m < i; m++) {
				this.getColeccionMonedasDe10().remove(m);}break;
		case 25:
			for (int m = 0; m < i; m++) {
				this.getColeccionMonedasDe25().remove(m);}break;
		case 50:
			for (int m = 0; m < i; m++) {
				this.getColeccionMonedasDe50().remove(m);}break;
		case 100:
			for (int m = 0; m < i; m++) {
				this.getColeccionMonedasDeDolar().remove(m);}break;
		default:
			break;
		}
		
	}

	
}
