public class Player {

	public int x,y,z;
	
	public Player(){
		
		//este contructor crea un jugador nuevo con las coordenadas, justo afuera de la choza		
		x = 3;
		y = 5;
		z = 0;
	}
	
	public static void moverPlayer(Player jug, int pA, int pB, int pC){
		/*  
		 * Tengo que arreglareste sistema, tiene que checar si hay terreno (o sea que X y Y no sean menores a 0 ni mayores de 6, ademas de que sea pasable, luego mover. 
		 
		if (jug.x + pA > 6){
			System.out.println("No te puedes mover mas al Norte");			
		}
		else{
			if(jug.x +pA <0){
				System.out.println("No te puedes mover mas al Sur");
			}
			else{
				jug.x = jug.x + pA;
			}
		}
		
		if (jug.y + pB > 6){
			System.out.println("No te puedes mover mas al Este");			
		}
		else{
			if(jug.y +pB <0){
				System.out.println("No te puedes mover mas al Oeste");
			}
			else{
				jug.y = jug.y + pB;
			}
		}
		
		if (jug.z + pC > 3){
			System.out.println("No puedes escalar mas");			
		}
		else{
			if(jug.z +pC <0){
				System.out.println("No Puedes desender mas.");
			}
			else{
				jug.z = jug.z + pC;
			}
		}
		*/
		
	}

	
}


