package co.edu.konradlorenz.model;

public class Profesor extends Persona implements Empleado{

	private long numeroDeTarjetaProfesional;

	public Profesor() {
		
	}
	
	/*/ <- Alternar "*" para comentar o descomentar.
	public Profesor(String nombre, String cedula) {
		super(nombre, cedula);
	}

	public Profesor(long numeroDeTarjetaProfesional) {
		this.numeroDeTarjetaProfesional = numeroDeTarjetaProfesional;
	}
	//*/

	public Profesor(String nombre, String cedula, long numeroDeTarjetaProfesional) {
		super(nombre, cedula);
		this.numeroDeTarjetaProfesional = numeroDeTarjetaProfesional;
	}

	public long getNumeroDeTarjetaProfesional() {
		return numeroDeTarjetaProfesional;
	}

	public void setNumeroDeTarjetaProfesional(long numeroDeTarjetaProfesional) {
		this.numeroDeTarjetaProfesional = numeroDeTarjetaProfesional;
	}

	@Override
	public String toString() {
		return super.toString() + ", Número de tarjeta profesional: " + numeroDeTarjetaProfesional;
	}

	public String dictarClase() {
		return "\n <> El profesor " + this.getNombre() + " está dictando la clase.";
	}

	@Override
	public boolean cobrarSueldo() {
		return true;
	}

	@Override
	public long pagarImpuestos() {
		long impuesto = (long) (Empleado.SMMLV * 0.19);
		return impuesto;
	}

	@Override
	public String asistirAReunion() {
		return "\n <> El profesor " + this.getNombre() + " asistió a la reunión de cierre de semestre.";
	}

	@Override
	public void registrarEntrada(String actualTime) {
		// TODO Auto-generated method stub
	}

	@Override
	public void registrarSalida(String actualTime) {
		// TODO Auto-generated method stub
	}
	
}
