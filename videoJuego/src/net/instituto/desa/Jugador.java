package net.instituto.desa;

public class Jugador {
	int y, x;
	static Jugador j;

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}
	
	static void derecha() {
		j.setX(j.getX() + 1);
	}

	static void izquierda() {
		j.setX(j.getX() - 1);
	}

	static void arriba() {
		j.setY(j.getY() - 1);
	}

	static void abajo() {
		j.setY(j.getY() + 1);
	}

}
