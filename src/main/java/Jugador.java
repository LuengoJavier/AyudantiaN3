public class Jugador {
	private String nombre;
	private int salud;
	private int fuerza;
	private int velocidad;

	public Jugador(String nombre,int salud, int fuerza, int velocidad) {
		this.nombre = nombre;
		this.salud = salud;
		this.fuerza = fuerza;
		this.velocidad = velocidad;
	}
	public String getNombre(){
		return this.nombre;
	}

	public int getSalud() {
		return this.salud;
	}

	public void setSalud(int salud) {
		this.salud = salud;
	}

	public int getFuerza() {
		return this.fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	public int getVelocidad() {
		return this.velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}
	@Override
	public String toString() {
		return "Nombre: "+getNombre()+"\nSalud: "+getSalud()+"\nFuerza: "+getFuerza()+"\nVelocidad: "+getVelocidad()+"\n";
	}
}