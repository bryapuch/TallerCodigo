package Users;

import java.util.Date;

import main.Cita;

public class Paciente extends Persona {
	protected String email;
	protected Cita cita;
		
	public Paciente(String usuario, String clave, String nombre, String apellido, String cedula, String direccion,
			Date fechaNac, String email) {
		super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
		this.email = email;
	}


	public boolean solicitarCita() {
		return true;
		
	}
	
}
