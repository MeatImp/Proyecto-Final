public class Terreno{
	
	public boolean pasable;
	public boolean visitado;
	public char tipo;
	

	public Terreno(){
	}
	
	public static Terreno[][][] crearTerreno(){
		Terreno [][][] nuevoMapa = new Terreno [3][7][7];
		
		char [][][] mapaTipos = new char [3][7][7];
		mapaTipos[0] = new char[][] {
				{ 'L', 'L', 'L', 'P', 'D', 'D', 'D' },
				{ 'L', 'L', 'P', 'B', 'D', 'C', 'D' },
				{ 'L', 'L', 'P', 'B', 'B', 'D', 'D' },
				{ 'L', 'P', 'G', 'B', 'B', 'A', 'A' },
				{ 'R', 'G', 'G', 'B', 'B', 'B', 'A' },
				{ 'R', 'G', 'G', 'G', 'B', 'B', 'R' },
				{ 'R', 'R', 'Z', 'Z', 'R', 'R', 'R' },
		};
		mapaTipos[1] = new char[][] {
				{ 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
		};
		mapaTipos[2] = new char[][] {
				{ 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
				{ 'B', 'B', 'B', 'B', 'B', 'B', 'B' },
		};
		
		boolean [][][] mapaPasable = new boolean [3][7][7];
		mapaPasable[0] = new boolean[][] {
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
		};
		mapaPasable[1] = new boolean[][] {
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
		};
		mapaPasable[2] = new boolean[][] {
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
				{ true, true, true, true, true, true, true },
		};
				
		for(Game.cA = 0; Game.cA <3; Game.cA++){
			for(Game.cB = 0; Game.cB <7; Game.cB++){
				for(Game.cC = 0; Game.cC <7; Game.cC++){
					nuevoMapa[Game.cA][Game.cB][Game.cC].visitado = false;
					nuevoMapa[Game.cA][Game.cB][Game.cC].tipo = mapaTipos[Game.cA][Game.cB][Game.cC];
					nuevoMapa[Game.cA][Game.cB][Game.cC].pasable = mapaPasable[Game.cA][Game.cB][Game.cC];
				}
			}
		}
		
		return nuevoMapa;
	}
}