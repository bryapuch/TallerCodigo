package Users;

import java.util.Date;
import java.util.LinkedList;

import Receta.Receta;
import main.Cita;
import main.HistoriaClinica;

public class Paciente extends Persona {
	protected String email;
	protected Cita cita;
	protected HistoriaClinica historiaClinica;
	protected LinkedList<Receta> recetas;
		
	public Paciente(String usuario, String clave, String nombre, String apellido, String cedula, String direccion,
			Date fechaNac, String email) {
		super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
		this.email = email;
	}


	public boolean solicitarCita() {
		return true;
		
	}
	
	public boolean pagarCita() {
		return true;
	}
	
	public boolean confirmarEstadoCita() {
		return true;
	}
	
}
