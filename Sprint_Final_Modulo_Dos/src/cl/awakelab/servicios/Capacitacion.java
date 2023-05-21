package cl.awakelab.servicios;

public class Capacitacion {
	
	protected int idCapacitacion; // obligatorio, número interno de la capacitación manejado por la	empresa
	protected int rutCliente; // obligatorio
	protected String dia; //: texto, día de la semana. Debe ser un valor permitido entre “lunes” y “Domingo” (en ese formato)
	protected String hora; // debe ser una hora válida del día, en formato HH:MM (hora desde 0 a 23, minutos entre 0 y 59)
	protected String lugar; // obligatorio, mínimo 10 caracteres, máximo 50
	protected String duracion; // máximo 70 caracteres
	protected int cantidadDeAsistentes; // obligatorio, número entero menor que 1000

	public Capacitacion() {
		super();
	}
	
	public Capacitacion(int idCapacitacion, int rutCliente, String dia, String hora, String lugar, String duracion,
			int cantidadDeAsistentes) {
		super();
		this.idCapacitacion = idCapacitacion;
		this.rutCliente = rutCliente;
		this.dia = dia;
		this.hora = hora;
		this.lugar = lugar;
		this.duracion = duracion;
		this.cantidadDeAsistentes = cantidadDeAsistentes;
	}

	public int getIdCapacitacion() {
		return idCapacitacion;
	}

	public void setIdCapacitacion(int idCapacitacion) {
		this.idCapacitacion = idCapacitacion;
	}

	public int getRutCliente() {
		return rutCliente;
	}

	public void setRutCliente(int rutCliente) {
		this.rutCliente = rutCliente;
	}

	public String getDia() {
		return dia;
	}

	public void setDia(String dia) {
		this.dia = dia;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public String getDuracion() {
		return duracion;
	}

	public void setDuracion(String duracion) {
		this.duracion = duracion;
	}

	public int getCantidadDeAsistentes() {
		return cantidadDeAsistentes;
	}

	public void setCantidadDeAsistentes(int cantidadDeAsistentes) {
		this.cantidadDeAsistentes = cantidadDeAsistentes;
	}

	public String mostrarDetalle() {

		String detalle = String.format("a capacitacion sera en %s a las %s  del dia %s  y durara %s minutos",
				this.lugar, this.hora, this.dia, this.duracion);

		return detalle;
	}

	@Override
	public String toString() {
		return "Capacitacion [idCapacitacion=" + idCapacitacion + ", rutCliente=" + rutCliente + ", dia=" + dia
				+ ", hora=" + hora + ", lugar=" + lugar + ", duracion=" + duracion + ", cantidadDeAsistentes="
				+ cantidadDeAsistentes + ", getIdCapacitacion()=" + getIdCapacitacion() + ", getRutCliente()="
				+ getRutCliente() + ", getDia()=" + getDia() + ", getHora()=" + getHora() + ", getLugar()=" + getLugar()
				+ ", getDuracion()=" + getDuracion() + ", getCantidadDeAsistentes()=" + getCantidadDeAsistentes()
				+ ", mostrarDetalle()=" + mostrarDetalle() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
}
