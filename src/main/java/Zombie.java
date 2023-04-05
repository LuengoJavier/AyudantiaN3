public class Zombie extends Enemigo {

	public Zombie(int fuerza, int velocidad, int vida) {
		super(fuerza, velocidad, vida);
	}

	public String getTipo() {
		return "ZOMBIE";
	}

	public String toString() {
		return getTipo()+"\nVida: "+getVida()+"\nFuerza: "+getFuerza()+"\nVelocidad: "+getVelocidad();
	}
}