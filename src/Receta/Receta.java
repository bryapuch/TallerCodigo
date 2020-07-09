package Receta;

import java.util.Date;
import java.util.LinkedList;
import com.sun.org.apache.xerces.internal.impl.dv.xs.DateTimeDV;
import Users.Doctor;
import Users.Paciente;

public class Receta {
	protected DateTimeDV fecha;
	protected Paciente paciente;
	protected PlanNutricional planNut;
	protected LinkedList<Medicamento> medicamentos;
	protected Doctor doctor;
	
}
