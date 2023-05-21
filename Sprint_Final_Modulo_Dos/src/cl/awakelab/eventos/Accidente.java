package cl.awakelab.eventos;

public class Accidente {

	protected int idAccidente; // obligatorio, número interno manejado por la compañía.
	protected int rutCliente; // obligatorio
	protected String diaAccidente; // fecha del accidente, independiente si lo declara como una fecha o un String, debe ser desplegado con el formato DD/MM/AAAA
	protected String hora; // debe ser una hora válida del día, en formato HH:MM (hora desde 0 a 23, minutos entre 0 y 59)
	protected String lugar; // obligatorio, mínimo 10 caracteres, máximo 50
	protected String origen; // máximo 100 caracteres
	protected String consecuencias; // máximo 100 caracteres
	
}
