public abstract class Enemigo {
	private int fuerza;
	private int velocidad;
	private int vida;
	public Enemigo(int fuerza, int velocidad, int vida){
		this.fuerza = fuerza;
		this.velocidad = velocidad;
		this.vida = vida;
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
	public int getVida() {
		return this.vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}
	public abstract String getTipo();
}