package HolocaustoH;

public class Posicion {
	private int posX;
	private int posY;
	
	public Posicion() {
		this.posX = 0;
		this.posY = 0;
	}
	public Posicion(int posX, int posY) {
		this.posX = posX;
		this.posY = posY;
	}

	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}
	
	public boolean esIgual(Posicion p) {
		if(p.posX == this.posX && p.posY == this.posY) return true;
		else return false;
	}
}