package HolocaustoH;

public class Main {

	public static void main(String[] args) {
		
		//Posicionaremos las puertas de entrada y salida
		Posicion puertaIn = new Posicion(0,3);
		Posicion puertaOut = new Posicion(5,Habitacion.alto-1);
		
		//Generaremos el jugador y lo almacenaremos en la habitacion
		Jugador jugador = new Jugador();


		//Generamos una habitación
		Habitacion habInicial = new Habitacion(puertaIn,puertaOut,jugador);
		
		//Pintamos la habitacion
		Juego.PintarHabitacion(habInicial);
	}
}