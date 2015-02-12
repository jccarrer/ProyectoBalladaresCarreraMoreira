package BalladaresCarreraMoreira;


public class Administrador {
	private String user;
	private String pass;
	private String nombre;
	private String apellido;
	private int edad;
	private String fechaUltimoIngreso;
	
	public Administrador() {
	}
	
	public Administrador(String user, String pass, String nombre,
			String apellido, int edad, String fechaUltimoIngreso) {
		this.setUser(user);
		this.setPass(pass);
		this.setNombre(nombre);
		this.setApellido(apellido);
		this.setEdad(edad);
		this.setFechaUltimoIngreso(fechaUltimoIngreso);
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public String getFechaUltimoIngreso() {
		return fechaUltimoIngreso;
	}
	public void setFechaUltimoIngreso(String fechaUltimoIngreso) {
		this.fechaUltimoIngreso = fechaUltimoIngreso;
	}
	@Override
	public String toString() {
		return "Administrador [user=" + user + ", pass=" + pass + ", nombre="
				+ nombre + ", apellido=" + apellido + ", edad=" + edad
				+ ", fechaUltimoIngreso=" + fechaUltimoIngreso + "]";
	}
	
	
	
}
