package HolocaustoH;

public class Juego {

	public Juego() {
		
	}
	
	public static void PintarHabitacion(Habitacion h) {
		for(int fil = 0; fil < Habitacion.alto; fil++){
			for(int col = 0; col < Habitacion.ancho; col++) {
				if(col == 0 || col == Habitacion.ancho-1) { 
					if(fil == 4 && col == Habitacion.ancho-1) {
						System.out.print("");
					}else System.out.print("|");
				}
				else if(fil == 0 || fil == Habitacion.alto-1) System.out.print("=");
				
				else System.out.print(" ");
				
				if(col == Habitacion.ancho-1) System.out.println();
			}		
		}
	}
}