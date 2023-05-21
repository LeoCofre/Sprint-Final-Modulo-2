package cl.awakelab.principal;

import java.util.List;

import cl.awakelab.servicios.Capacitacion;
import cl.awakelab.usuarios.Asesoria;

public class Contenedor {

	private List<Asesoria> asesorias;
	private List<Capacitacion> capacitaciones;

	public Contenedor() {
		super();
	}

	public Contenedor(List<Asesoria> asesorias, List<Capacitacion> capacitaciones) {
		super();
		this.asesorias = asesorias;
		this.capacitaciones = capacitaciones;
	}

	public void almacenarClientes(Asesoria cliente) {
		asesorias.add(cliente);
	}

	public void almacenarProfesional(Asesoria profesional) {
		asesorias.add(profesional);
	}

	public void almacenarAdministrativo(Asesoria administrativo) {
		asesorias.add(administrativo);
	}

	public void almacenarCapacitacion(Capacitacion capacitacion) {
		capacitaciones.add(capacitacion);
	}

	public void eliminarUsuario() {
	}

	public void listarUsuarios() {

	}

	public void listarUsuariosPorTipo() {

	}

	public void listarCapacitaciones() {

	}

}
