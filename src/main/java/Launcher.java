public class Launcher {

	public static void main(String[] args) {
		inicializar();
	}

	public static void inicializar() {
		Jugador jugador = new Jugador("Silver",80,70,30);
		Jugador jugador1 = new Jugador("Gold",200,200,66);
		Enemigo zombie = new Zombie(40,20, 50);
		Enemigo esqueleto = new Esqueleto(50, 20,60);
		Enemigo arana = new Arana(30,60,40);
		Enemigo dragon = new JefeFinal(80,80,100);


		Partida partida = new Partida(001);
		partida.agregarJugador(jugador);
		partida.agregarJugador(jugador1);
		partida.agregarMonstruos(zombie);
		partida.agregarMonstruos(esqueleto);
		partida.agregarMonstruos(arana);
		partida.agregarJefeFinal(dragon);

		partida.enfrentarEnemigo(jugador,zombie);
		partida.enfrentarEnemigo(jugador,arana);
		partida.enfrentarEnemigo(jugador,esqueleto);
		partida.enfrentarEnemigo(jugador,dragon);
		partida.atacarJugador(jugador,jugador1);
		System.out.println("\nHa terminado la partida...");

	}
}