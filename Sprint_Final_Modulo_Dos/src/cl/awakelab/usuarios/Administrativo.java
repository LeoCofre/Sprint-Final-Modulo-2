package cl.awakelab.usuarios;

public class Administrativo extends Usuario implements Asesoria {

	protected String area; // obligatorio, mínimo 5 caracteres, máximo 20
	protected String experienciaPrevia; // máximo 100 caracteres

	public Administrativo() {
		super();
		this.area = "";
		this.experienciaPrevia = "";
	}

	public Administrativo(String area, String experienciaPrevia) {
		super();
		this.area = area;
		this.experienciaPrevia = experienciaPrevia;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}

	public String getExperienciaPrevia() {
		return experienciaPrevia;
	}

	public void setExperienciaPrevia(String experienciaPrevia) {
		this.experienciaPrevia = experienciaPrevia;
	}

	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("El area es: " + area + " y su experiencia previa es:  " + experienciaPrevia);
	}

	@Override
	public String toString() {
		return "Administrativo [area=" + area + ", experienciaPrevia=" + experienciaPrevia + ", nombre=" + nombre
				+ ", fechaNacimiento=" + fechaNacimiento + ", run=" + run + ", getArea()=" + getArea()
				+ ", getExperienciaPrevia()=" + getExperienciaPrevia() + ", getNombre()=" + getNombre()
				+ ", getFechaNacimiento()=" + getFechaNacimiento() + ", getRun()=" + getRun() + ", mostrarEdad()="
				+ mostrarEdad() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
