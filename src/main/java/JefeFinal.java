public class JefeFinal extends Enemigo {

	public JefeFinal(int fuerza, int velocidad, int vida) {
		super(fuerza, velocidad, vida);
	}

	public String getTipo() {
		return "JEFE FINAL";
	}

	public String toString() {
		return getTipo()+"\nVida: "+getVida()+"\nFuerza: "+getFuerza()+"\nVelocidad: "+getVelocidad();
	}
}