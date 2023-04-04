package HolocaustoH;

public class Main {

	public static void main(String[] args) {
		//Posicion personaje
		Posicion posInicial = new Posicion(4,6);
		Posicion pos1 = new Posicion();
		/*posInicial.setPosX(3);
		posInicial.setPosY(0);*/
		
		//Generaremos los dos primeros objetos 
		Habitacion hab1 = new Habitacion();
		Personaje jugador = new Personaje();
		
		jugador.setPos(posInicial);
		
		Juego.PintarHabitacion(hab1);
		
	}
}