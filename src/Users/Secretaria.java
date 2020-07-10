package Users;

import java.util.Date;

public class Secretaria extends Persona {
	
	public Secretaria(String usuario, String clave, String nombre, String apellido, String cedula, String direccion,
			Date fechaNac) {
		super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
		// TODO Auto-generated constructor stub
	}
	
	public void verificarCita() {
		
	}
	
	
	public void agendarCita() {
		
	}
	
	public void verificarDisponibilidad() {
		
		
	}
	
	public boolean solicitarPago() {
		return true;
	}
	
	
}
