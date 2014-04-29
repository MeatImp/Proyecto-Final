import java.util.Random;

public class Yogi {
	public int x;
	public int y;
	public int z;
	
	public Yogi (int a, int b, int c){
		x = a;
		y = b;
		z = c;
	}
	
	public static Yogi crearOso(Yogi osU){
		osU = new Yogi(2,2,0);
		return osU;
	}

	public static Yogi movimientoOso(Yogi bear){
		boolean yafue = false;
		Random run = new Random();
		while (!(yafue)){
			int ran = run.nextInt(4);
			
			//toma una direccion al azar, luego checa si en esa direccion hay un arbusto A o un bosque B, si asi es, mueve al oso en esa direccion.
			
			switch (ran){
				case 1:
					//norte
					if (Game.Mapa[bear.z][bear.y][bear.x - 1].tipo + "" == "B"  || Game.Mapa[bear.z][bear.y][bear.x - 1].tipo + "" == "A"){
						bear.x--;
						yafue = true;
					}
					break;
				case 2:
					//sur
					if (Game.Mapa[bear.z][bear.y][bear.x + 1].tipo + "" == "B"  || Game.Mapa[bear.z][bear.y][bear.x + 1].tipo + "" == "A"){
						bear.x++;
						yafue = true;
					}
					break;
				case 3:
					//este
					if (Game.Mapa[bear.z][bear.y - 1][bear.x].tipo + "" == "B"  || Game.Mapa[bear.z][bear.y - 1][bear.x].tipo + "" == "A"){
						bear.y--;
						yafue = true;
					}
					break;
				case 4:
					//oeste
					if (Game.Mapa[bear.z][bear.y + 1][bear.x].tipo + "" == "B"  || Game.Mapa[bear.z][bear.y + 1][bear.x].tipo + "" == "A"){
						bear.y++;
						yafue = true;
					}
					break;
			
			}
		}
		return bear;
	}
}
