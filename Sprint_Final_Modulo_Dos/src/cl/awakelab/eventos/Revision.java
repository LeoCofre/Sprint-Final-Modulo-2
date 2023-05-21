package cl.awakelab.eventos;

public class Revision {

	protected int idRevisión; // obligatorio, número interno manejado por la compañía.
	protected int idVisitaEnTerrenoRevision; // obligatorio, número de la vista a la que se	asócia la revisión.
	protected String nombreRevisión; // obligatorio, mínimo 10 caracteres, máximo 50
	protected String detalleParaRevisar; // máximo 100 caracteres
	protected int estado; // 1 (sin problemas), 2 (con observaciones), 3 (no aprueba), solo se	pueden ingresar los valores antes indicados.
}
 