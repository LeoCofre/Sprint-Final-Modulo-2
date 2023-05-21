package cl.awakelab.usuarios;

import java.time.Year;

public class Usuario implements Asesoria {

	protected String nombre; // obligatorio, mínimo 10 caracteres, máximo 50
	protected String fechaNacimiento; // obligatorio, independiente si lo declara como una fecha o string, debe ser desplegado con el formato DD/MM/AAAA
	protected int run; // corresponde a un número menor a 99.999.999

	

	public Usuario() {
		super();
		this.nombre = "";
		this.fechaNacimiento = "";
		this.run = 0;
	}

	public Usuario(String nombre, String fechaNacimiento, int run) {
		super();
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
		this.run = run;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public int getRun() {
		return run;
	}

	public void setRun(int run) {
		this.run = run;
	}
	
	public String mostrarEdad() {
		String anioSolo = this.fechaNacimiento.substring(6, 10);
		int anioNacimiento = Integer.parseInt(anioSolo);
		int anioActual = Year.now().getValue();
		int edad = anioActual - anioNacimiento;
		return "El Usuario tiene " + edad + "años";
	}

	@Override
	public void analizarUsuario() {
		System.out.println("El nombre del usuario es: " + nombre + ", su run es: " + run);
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + ", getNombre()="
				+ getNombre() + ", getFechaNacimiento()=" + getFechaNacimiento() + ", getRun()=" + getRun()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}

}
