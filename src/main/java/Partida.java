import java.util.ArrayList;

public class Partida {
	private int idPartida;
	private ArrayList<Jugador> jugadores;
	private ArrayList<Enemigo> enemigos;
	public Partida(int idPartida){
		this.idPartida = idPartida;
		this.jugadores = new ArrayList<>();
		this.enemigos = new ArrayList<>();
	}

	public void agregarJugador(Jugador jugador) {
		if(buscarJugador(jugador)) {
			jugadores.add(jugador);
		}
	}

	public void agregarMonstruos(Enemigo enemigo) {
		for(Enemigo enemigo1 : this.enemigos){
			if (!enemigo1.getTipo().equals("JEFE FINAL")){
				enemigos.add(enemigo);
			}
		}
	}
	public void agregarJefeFinal(Enemigo enemigo) {
		for(Enemigo enemigo1 : this.enemigos){
			if (enemigo1.getTipo().equals("JEFE FINAL")){
				enemigos.add(enemigo);
			}
		}
	}
	public boolean buscarJugador(Jugador jugador){
		for (Jugador jugador1 : this.jugadores){
			if (jugador1.equals(jugador)){
			return true;
			}
		}
		return false;
	}

	public void enfrentarEnemigo(Jugador jugador, Enemigo enemigo) {
		if(resultadoPeleaEnemigo(jugador,enemigo)){
			jugador.setSalud(jugador.getSalud()+10);
			jugador.setFuerza(jugador.getFuerza()+5);
			jugador.setVelocidad(jugador.getVelocidad()+2);
			enemigos.remove(enemigo);
			System.out.println("¡Has ganado la batalla contra "+enemigo.getTipo()+"!\nHaz recibido una mejora en tus atributos :)\n");
			mostrarJugador(jugador);
		}
		else{
			jugadores.remove(jugador);
			System.out.println("Su jugador a sido derrotado por: "+enemigo.getTipo()+"\nAtributos del "+enemigo.getTipo()+":");
			mostrarEnemigo(enemigo);
		}

	}

	public void atacarJugador(Jugador jugador, Jugador jugador1) {
		int salud = 0;
		if(resultadoPeleaJugador(jugador,jugador1)){
			jugadores.remove(jugador1);
			System.out.println("\n¡Has ganado la batalla contra "+jugador1.getNombre()+"!");
			System.out.println("Tu salud es "+salud+"\nTe estás recuperando...\n " +
					"3...\n2..\n1...\n¡Te has recuperado!");
			mostrarJugador(jugador);
		}
		else{
			jugadores.remove(jugador);
			System.out.println("\nSu jugador a sido derrotado por: "+jugador1.getNombre()+"\nAtributos de "+jugador1.getNombre()+":");
			mostrarJugador(jugador1);
		}

	}

	public boolean resultadoPeleaEnemigo(Jugador jugador, Enemigo enemigo) {
		int vidaEnemigo = enemigo.getVida() - jugador.getFuerza();
		int vidaJugador = jugador.getSalud() - enemigo.getFuerza();

		while(vidaJugador>0 || vidaEnemigo>0){
			vidaEnemigo = vidaEnemigo - jugador.getFuerza();
			vidaJugador = vidaJugador - enemigo.getFuerza();
		}
		if(vidaJugador>vidaEnemigo){
			return true;
		}else {
			return false;
		}
	}
	public boolean resultadoPeleaJugador(Jugador jugador, Jugador jugador1) {
		int vidaJugador1 = jugador1.getSalud() - jugador.getFuerza();
		int vidaJugador = jugador.getSalud() - jugador1.getFuerza();
		while(vidaJugador>0 || vidaJugador1>0){
			vidaJugador1 = vidaJugador1 - jugador.getFuerza();
			vidaJugador = vidaJugador - jugador1.getFuerza();
		}
		if(vidaJugador>vidaJugador1){
			return true;
		}else {
			return false;
		}
	}
	public void mostrarJugador(Jugador jugador) {
		System.out.println(jugador);
	}
	public void mostrarEnemigo(Enemigo enemigo){
		System.out.println(enemigo);
	}
}