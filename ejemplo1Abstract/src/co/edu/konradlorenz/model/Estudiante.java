package co.edu.konradlorenz.model;

public class Estudiante extends Persona {
	
	private long codigoEstudiantil;
	
	public Estudiante() {
		
	}

	/*/ <- Alternar "*" para comentar o descomentar.
	public Estudiante(String nombre, String cedula) {
		super(nombre, cedula);
		
	}
	
	public Estudiante(long codigoEstudiantil) {
		this.codigoEstudiantil = codigoEstudiantil;
	}
	//*/
	
	public Estudiante(String nombre, String cedula, long codigoEstudiantil) {
		super(nombre, cedula);
		this.codigoEstudiantil = codigoEstudiantil;
	}
	
	public long getCodigoEstudiantil() {
		return codigoEstudiantil;
	}

	public void setCodigoEstudiantil(long codigoEstudiantil) {
		this.codigoEstudiantil = codigoEstudiantil;
	}

	@Override
	public String toString() {
		return super.toString() + ", Código estudiantil: " + codigoEstudiantil;
	}
	
	public String pagarMatricula() {
		return "\n <> El estudiante " + this.getNombre() + " pagó la matrícula.";
	}
	
	public String asistirAClase() {
		return "\n <> El estudiante " + this.getNombre() + " está en clase.";
	}

	public String realizarLectura() {
		return "\n <> El estudiante " + this.getNombre() + " está leyendo.";
	}
	
	public String entregarTrabajo() {
		return "\n <> El estudiante " + this.getNombre() + " entregó el trabajo.";
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
