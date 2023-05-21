package cl.awakelab.usuarios;

public class Profesional extends Usuario implements Asesoria {

	protected String titulo; // obligatorio, mínimo 10 caracteres, máximo 50
	protected String fechaDeIngreso; // independiente si lo declara como una fecha o un String, debe ser desplegado
										// con el formato DD/MM/AAAA

	public Profesional() {
		super();
		this.titulo = "";
		this.fechaDeIngreso = "";
	}

	public Profesional(String titulo, String fechaDeIngreso) {
		super();
		this.titulo = titulo;
		this.fechaDeIngreso = fechaDeIngreso;
	}
	
	

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getFechaDeIngreso() {
		return fechaDeIngreso;
	}

	public void setFechaDeIngreso(String fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}

	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("El titulo profesional es: " + titulo + "La fecha de ingreso es: " + fechaDeIngreso);
	}

	@Override
	public String toString() {
		return "Profesional [titulo=" + titulo + ", fechaDeIngreso=" + fechaDeIngreso + ", nombre=" + nombre
				+ ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + ", getTitulo()=" + getTitulo()
				+ ", getFechaDeIngreso()=" + getFechaDeIngreso() + ", getNombre()=" + getNombre()
				+ ", getFechaNacimiento()=" + getFechaNacimiento() + ", getRun()=" + getRun() + ", mostrarEdad()="
				+ mostrarEdad() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	

}
