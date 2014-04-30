public class Player {

	public int x,y,z;
	
	public Player(){
		
		//este contructor crea un jugador nuevo con las coordenadas, justo afuera de la choza		
		x = 3;
		y = 5;
		z = 0;
	}
	
	public static void moverPlayer(Player jug, String [] in){
		boolean encontrarD = false;
		int cAa = in.length;
		int cBb =0;
		while(!(encontrarD)){
			switch(cBb){
			case 1:
				for(cAa = 0; cAa < in.length; cAa++){
					if(in[cAa] == "noreste"){
						moverPlayerNE();
						encontrarD = true;
					}
				}
				break;
			case 2:
				for(cAa = 0; cAa < in.length; cAa++){
					if(in[cAa] == "noroeste"){
						moverPlayerNO();
						encontrarD = true;
					}
				}
				break;
			case 3:
				for(cAa = 0; cAa < in.length; cAa++){
					if(in[cAa] == "sureste"){
						moverPlayerSE();
						encontrarD = true;
					}
				}
				break;
			case 4:
				for(cAa = 0; cAa < in.length; cAa++){
					if(in[cAa] == "suroeste"){
						moverPlayerSO();
						encontrarD = true;
					}
				}
				break;
			case 5:
				for(cAa = 0; cAa < in.length; cAa++){
					if(in[cAa] == "norte"){
						moverPlayerN();
						encontrarD = true;
					}
				}
				break;
			case 6:
				for(cAa = 0; cAa < in.length; cAa++){
					if(in[cAa] == "sur"){
						moverPlayerS();
						encontrarD = true;
					}
				}
				break;
			case 7:
				for(cAa = 0; cAa < in.length; cAa++){
					if(in[cAa] == "este"){
						moverPlayerE();
						encontrarD = true;
					}
				}
				break;
			case 8:
				for(cAa = 0; cAa < in.length; cAa++){
					if(in[cAa] == "oeste"){
						moverPlayerO();
						encontrarD = true;
					}
				}
				break;
			default:
				
				break;
			}
			cBb++;
		}
	}
	
	public static void moverPlayerNO(){
		if(Game.jugador.x >= 1 || Game.jugador.y >= 1 ){

			if(Game.Mapa[Game.jugador.z][Game.jugador.y-1][Game.jugador.x-1].pasable){
				Game.jugador.x--;
				Game.jugador.y--;
			}
			else{
				System.out.println("No puedes ir al Noroeste, algo bloquea tu camino.");
			}
		}
		else{
			System.out.println("No puedes ir al Noroeste, no hay mas alla en el mapa.");
		}

	}
	
	public static void moverPlayerNE(){
		if(Game.jugador.x >= 1 || Game.jugador.y <= 5 ){

			if(Game.Mapa[Game.jugador.z][Game.jugador.y+1][Game.jugador.x-1].pasable){
				Game.jugador.x--;
				Game.jugador.y++;
			}
			else{
				System.out.println("No puedes ir al Noreste, algo bloquea tu camino.");
			}
		}
		else{
			System.out.println("No puedes ir al Noroeste, no hay mas alla en el mapa.");
		}
	}
	
	public static void moverPlayerSO(){
		if(Game.jugador.x <= 5 || Game.jugador.y >= 1 ){

			if(Game.Mapa[Game.jugador.z][Game.jugador.y-1][Game.jugador.x+1].pasable){
				Game.jugador.x--;
				Game.jugador.y++;
			}
			else{
				System.out.println("No puedes ir al Suroeste, algo bloquea tu camino.");
			}
		}
		else{
			System.out.println("No puedes ir al Suroeste, no hay mas alla en el mapa.");
		}
	}
	
	public static void moverPlayerSE(){
		if(Game.jugador.x <= 5 || Game.jugador.y <= 5 ){

			if(Game.Mapa[Game.jugador.z][Game.jugador.y+1][Game.jugador.x+1].pasable){
				Game.jugador.x++;
				Game.jugador.y++;
			}
			else{
				System.out.println("No puedes ir al Suroeste, algo bloquea tu camino.");
			}
		}
		else{
			System.out.println("No puedes ir al Sureste, no hay mas alla en el mapa.");
		}
	}	
	
	public static void moverPlayerN(){
		if(Game.jugador.x >= 1){

			if(Game.Mapa[Game.jugador.z][Game.jugador.y][Game.jugador.x-1].pasable){
				Game.jugador.x--;
			}
			else{
				System.out.println("No puedes ir al Norte, algo bloquea tu camino.");
			}
		}
		else{
			System.out.println("No puedes ir al Norte, no hay mas alla en el mapa.");
		}
	}
	
	public static void moverPlayerS(){
		if(Game.jugador.x <=5){

			if(Game.Mapa[Game.jugador.z][Game.jugador.y][Game.jugador.x+1].pasable){
				Game.jugador.x++;
			}
			else{
				System.out.println("No puedes ir al Sur, algo bloquea tu camino.");
			}
		}
		else{
			System.out.println("No puedes ir al Sur, no hay mas alla en el mapa.");
		}
	}

	public static void moverPlayerE(){
		if(Game.jugador.y <= 5){

			if(Game.Mapa[Game.jugador.z][Game.jugador.y + 1][Game.jugador.x].pasable){
				Game.jugador.y++;
			}
			else{
				System.out.println("No puedes ir al Este, algo bloquea tu camino.");
			}
		}
		else{
			System.out.println("No puedes ir al Este, no hay mas alla en el mapa.");
		}
	
	}

	public static void moverPlayerO(){
		if(Game.jugador.y >= 1){

			if(Game.Mapa[Game.jugador.z][Game.jugador.y-1][Game.jugador.x].pasable){
				Game.jugador.y--;
			}
			else{
				System.out.println("No puedes ir al Oeste, algo bloquea tu camino.");
			}
		}
		else{
			System.out.println("No puedes ir al Oeste, no hay mas alla en el mapa.");
		}

	}

	
}


