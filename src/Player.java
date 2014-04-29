public class Player {

	public int x,y,z;
	
	public Player(){
		x = 3;
		y = 2;
		z = 1;
	}
	
	public static void moverPlayer(Player jug, int pA, int pB, int pC){
		
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
		
	}

	
}


