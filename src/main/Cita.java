package main;

import com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV;

import Users.Doctor;
import Users.Paciente;
import Users.Secretaria;

public class Cita {
	protected DateTimeDV fecha;
	protected boolean pagada;
	protected String registradoPor;
	protected Doctor doctor;
	protected Paciente paciente;

}
