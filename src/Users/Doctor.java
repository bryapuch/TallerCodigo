package Users;

import java.util.Date;
import java.util.LinkedList;

import Area.AreaMedica;
import main.Cita;

public class Doctor extends Persona {
	protected int regDoctor;
	protected String especialidad;
	protected Secretaria secretaria;
	protected LinkedList<AreaMedica> areas;
	protected LinkedList<Cita> citasPendientes;
	
	
	public Doctor(String usuario, String clave, String nombre, String apellido, String cedula, String direccion,
			Date fechaNac, int regDoctor, String especialidad) {
		super(usuario, clave, nombre, apellido, cedula, direccion, fechaNac);
		this.regDoctor = regDoctor;
		this.especialidad = especialidad;
	}
	
	public void recetar() {
		
	}
	
	
	public void planNutricional() {
		
	}
	
	public void setSecretaria(Secretaria secretaria) {
		this.secretaria = secretaria;
	}

	public void ImprimirReceta() {
		
	}
	
	public void registraSecretaria() {
		
	}
	
	
	

}
