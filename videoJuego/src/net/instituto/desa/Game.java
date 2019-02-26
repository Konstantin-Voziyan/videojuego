package net.instituto.desa;

public class Game {
	private static final String ABAJO = "Abajo";
	private static final String ARRIBA = "Arriba";
	private static final String IZQUIERDA = "Izquierda";
	private static final String DERECHA = "Derecha";
	//Jugador j;

	public static void movimiento(String m) {
		if (m.equalsIgnoreCase(DERECHA)) {
			Jugador.derecha();
		}
		if (m.equalsIgnoreCase(IZQUIERDA)) {
			Jugador.izquierda();
		}
		if (m.equalsIgnoreCase(ARRIBA)) {
			Jugador.arriba();
		}
		if (m.equalsIgnoreCase(ABAJO)) {
			Jugador.abajo();
		}
	}
}
