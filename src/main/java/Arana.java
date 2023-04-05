public class Arana extends Enemigo {

	public Arana(int fuerza, int velocidad, int vida) {
		super(fuerza,velocidad,vida);
	}

	public String getTipo() {
		return "ARAÑA";
	}

	public String toString() {
		return getTipo()+"\nVida: "+getVida()+"\nFuerza: "+getFuerza()+"\nVelocidad: "+getVelocidad();
	}
}