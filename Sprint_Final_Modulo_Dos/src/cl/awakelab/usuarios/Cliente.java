package cl.awakelab.usuarios;

public class Cliente extends Usuario implements Asesoria{

	protected int rut; // corresponde a un número menor a 99.999.999
	protected String nombres; // obligatorio, mínimo 5 caracteres, máximo 30
	protected String apellidos; // obligatorio, mínimo 5 caracteres, máximo 30
	protected String telefono; // obligatorio
	protected String afp; // mínimo 4 caracteres, máximo 30
	protected String sistemaDeSalud; // 1 (Fonasa) o 2 (Isapre), debe ser solo una de las dos opciones indicadas
	protected String direccion; // máximo 70 caracteres
	protected String comuna; // máximo 50 caracteres
	protected int edad; // obligatorio, número mayor o igual a cero, y menor a 150

	public Cliente() {
		super();
		this.rut = 0;
		this.nombres = "";
		this.apellidos = "";
		this.telefono = "";
		this.afp = "";
		this.sistemaDeSalud = "";
		this.direccion = "";
		this.comuna = "";
		this.edad = 0;
	}

	public Cliente(int rut, String nombres, String apellidos, String telefono, String afp, String sistemaDeSalud,
			String direccion, String comuna, int edad) {
		super();
		this.rut = rut;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.telefono = telefono;
		this.afp = afp;
		this.sistemaDeSalud = sistemaDeSalud;
		this.direccion = direccion;
		this.comuna = comuna;
		this.edad = edad;
	}

	public int getRut() {
		return rut;
	}

	public void setRut(int rut) {
		this.rut = rut;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getAfp() {
		return afp;
	}

	public void setAfp(String afp) {
		this.afp = afp;
	}

	public String getSistemaDeSalud() {
		return sistemaDeSalud;
	}

	public void setSistemaDeSalud(String sistemaDeSalud) {
		this.sistemaDeSalud = sistemaDeSalud;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getComuna() {
		return comuna;
	}

	public void setComuna(String comuna) {
		this.comuna = comuna;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	protected String obtenerNombre() {

		return this.nombre + this.apellidos;
	}

	protected String obtenerSistemaSalud() {
		String sistema = "";
		if (this.sistemaDeSalud == "1") {
			sistema = "Fonasa";
		} else if (this.sistemaDeSalud == "2") {
			sistema = "Isapre";
		} else
			sistema = "No valido";
		return sistema;
	}

	public void analizarUsuario() {
		super.analizarUsuario();
		System.out.println("El direccion del cliente es: " + direccion + " y la comuna es: " + comuna);
	}

	@Override
	public String toString() {
		return "Cliente [rut=" + rut + ", nombres=" + nombres + ", apellidos=" + apellidos + ", telefono=" + telefono
				+ ", afp=" + afp + ", sistemaDeSalud=" + sistemaDeSalud + ", direccion=" + direccion + ", comuna="
				+ comuna + ", edad=" + edad + ", nombre=" + nombre + ", fechaNacimiento=" + fechaNacimiento + ", run="
				+ run + ", getRut()=" + getRut() + ", getNombres()=" + getNombres() + ", getApellidos()="
				+ getApellidos() + ", getTelefono()=" + getTelefono() + ", getAfp()=" + getAfp()
				+ ", getSistemaDeSalud()=" + getSistemaDeSalud() + ", getDireccion()=" + getDireccion()
				+ ", getComuna()=" + getComuna() + ", getEdad()=" + getEdad() + ", obtenerNombre()=" + obtenerNombre()
				+ ", obtenerSistemaSalud()=" + obtenerSistemaSalud() + ", getNombre()=" + getNombre()
				+ ", getFechaNacimiento()=" + getFechaNacimiento() + ", getRun()=" + getRun() + ", mostrarEdad()="
				+ mostrarEdad() + ", toString()=" + super.toString() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}

}
