package BalladaresCarreraMoreira;


public class Moneda {
	private int valor;
	
	public Moneda(int valor) {
		this.setValor(valor);
	}

	public int getValor() {
		return valor;
	}

	public void setValor(int valor) {
		this.valor = valor;
	}

	@Override
	public String toString() {
		return "Moneda [valor=" + valor + "]";
	}
	
	
}
