public class Esqueleto extends Enemigo {

	public Esqueleto(int fuerza, int velocidad, int vida) {
		super(fuerza,velocidad,vida);
	}

	public String getTipo() {
		return "ESQUELETO";
	}

	public String toString() {
		return getTipo()+"\nVida: "+getVida()+"\nFuerza: "+getFuerza()+"\nVelocidad: "+getVelocidad();
	}
}