package cl.awakelab.eventos;

public class VisitaEnTerreno {
	
	protected int idVisitaEnTerreno; // obligatorio, número interno manejado por la compañía.
	protected int rutCliente; // obligatorio
	protected String diaVisitaEnTerreno; // fecha del accidente, independiente si lo declara como una fecha o un String, debe ser desplegado con el formato DD/MM/AAAA
	protected String horaVisitaEnTerreno; // debe ser una hora válida del día, en formato HH:MM (hora desde 0 a 23, minutos entre 0 y 59)
	protected String lugarVisitaEnTerreno; // obligatorio, mínimo 10 caracteres, máximo 50
	protected String comentarios; // máximo 100 caracteres
}
