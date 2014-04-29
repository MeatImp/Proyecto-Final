import java.io.*;

public class Game {
	 static BufferedReader in = new BufferedReader(new   InputStreamReader(System.in));
	
	//Contadores
	
	public static int cA,cB,cC,cD,cE;
	
	//Variables Publicas
	
	public static boolean gameend = false, gamecomplete = false;
	
	//Terreno
	
	public static Terreno [][][] Mapa = Terreno.crearTerreno();
	
	//Oso
	
	public static Yogi Oso = new Yogi(2,4,0);
	
	
	public static Player jugador;
	
	public static void main(String Arg[ ]) throws IOException    {
		
		
		
		@SuppressWarnings("unused")
		String salir;
	
		System.out.println("La Cueva, un juego de exploracion a base de Texto.");
		System.out.println("<-----Por Joseph M. Trippp, 27427, salon 2405---->");
		System.out.println("<-----Por Luis F. Martinez, 27105, salon 2405---->");
		System.out.println("<---##########################################--->");
		
		System.out.println(/*Introduccion*/);
		System.out.println("¿Que haras ahora?");
		System.out.println("*Puedes escribir 'Ayuda' para obtener una lista de comandos*");
		
		while(!(gameend)){
			llegue();
			leerInput();
		}
		
		System.out.println("Ingresa cualquier cosa para salir.");
		salir = in.readLine();
	}
	
	public static String input;
	public static String [] palabrasInp;
	
	public static String []	palabrasMovimiento;{
		palabrasMovimiento[0] = "ir";
		palabrasMovimiento[1] = "viajar";
		palabrasMovimiento[2] = "caminar";
		palabrasMovimiento[3] = "moverse";
	}
	
	public static void imprimirAyuda(){
		
		boolean necesitoAyuda = true;
		int opcionAyuda;
		
		while (necesitoAyuda){
			System.out.println("Menu de Ayuda... Quieres?");
			System.out.println("1.- Observar");
			System.out.println("2.- Trasladarte");
			System.out.println("3.- Que mas puedo hacer?");
			System.out.println("4.- Salir");
			
			try {
				opcionAyuda = Integer.parseInt(in.readLine( ));
			} catch (IOException e) {
				opcionAyuda = 0;
			}
			
			switch (opcionAyuda){
			default:
				System.out.println("Esa no parece una opcion, vuelve a intentar.");
				break;
			case 1:
				System.out.println("Puedes decir IR, VIAJAR, CAMINAR o MOVERSE, seguido de la direccion que quieras, para moverte.");
				System.out.println("EJEMPLO... Caminar hacia el Norte");
				break;
			case 2:
				System.out.println("Puedes decir VER, OBSERVAR o MIRAR para investigar algo o tus alrededores, como si fuera la primera vez que los ves.");
				System.out.println("EJEMPLO... Ver alrededor");
				break;
			case 3:
				System.out.println("Tambien puedes ... ");
				System.out.print(" usar cosas,");
				System.out.print(" subir o bajar (bajo ciertas condiciones),");
				System.out.print(" preguntar QUE DEBO HACER,");
				System.out.print(" etc...");
				break;
			case 4:
				necesitoAyuda = false;
				break;
			
			}
			
		}
	}
	
	public static void leerInput(){
		try {
			input = in.readLine();
			input = input.toLowerCase();
			palabrasInp = input.split(" ");
			 
			if (input != "ayuda"){
				
			}
			else{
				imprimirAyuda();
			}
			
		} 
		catch (IOException e) {
			
			System.out.println("*Introducir texto en blanco podria causar errores, intenta no hacerlo.*");
			//e.printStackTrace();
		}
		
	}

	public static void llegue(){
		//Mueve el oso despues del jugador	
		Oso = Yogi.movimientoOso(Oso);
		
		//BUSCAROSO player.buscaroso(jugador,Oso);
		
		
		//Se revela la posicion del jugador "Donde quede", y cosas como donde esta el oso "Que hay a mi alrededor"
		revelarPosicion();
		//Se marca la casilla como visitada
		Mapa[jugador.z][jugador.y][jugador.x].visitado = true;
	}
	
	
	
	public static void revelarPosicion(){
		if (Mapa[jugador.z][jugador.y][jugador.x].visitado){
			
			//si ya fue visitado
			
			switch(Mapa[jugador.z][jugador.y][jugador.x].tipo + ""){
				case ("A"):
					System.out.println("Estas en ");
					break;
				case ("B"):
					System.out.println("Estas en ");
					break;
				case ("C"):
					System.out.println("Estas en ");
					break;
				case ("D"):
					System.out.println("Estas en ");
					break;
				case ("G"):
					System.out.println("Estas en ");
					break;
				case ("L"):
					System.out.println("Estas en ");
					break;
				case ("P"):
					System.out.println("Estas en ");
					break;
				case ("R"):
					System.out.println("Estas en ");
					break;
				case ("Z"):
					System.out.println("Estas en ");
					break;
			}
		}
		else{
			
			//si aun no ha sido visitado
			
			switch(Mapa[jugador.z][jugador.y][jugador.x].tipo + ""){
				case ("A"):
					System.out.println("Estas en ");
					break;
				case ("B"):
					System.out.println("Estas en ");
					break;
				case ("C"):
					System.out.println("Estas en ");
					break;
				case ("D"):
					System.out.println("Estas en ");
					break;
				case ("G"):
					System.out.println("Estas en ");
					break;
				case ("L"):
					System.out.println("Estas en ");
					break;
				case ("P"):
					System.out.println("Estas en ");
					break;
				case ("R"):
					System.out.println("Estas en ");
					break;
				case ("Z"):
					System.out.println("Estas en ");
					break;
			}
		}
	}
	
	/* Definiciones de mapa
	A = Arbusto
	B = Bosque
	C = Cueva
	D = Ceniza
	G = Pasto
	L = Lago
	P = Playa
	R = Risco
	Z = Casa
	*/
	
	/* Libreria
	input = lo que el jugador escribio en bruto
	palabrasInp = arreglo de las diferentes palabras en input.
	*/
	
	/* Declaraciones etc
	lectura int  Integer.parseInt(in.readLine( ));
	lectura float  Float.parseFloat(in.readLine( ));
	lectura double Double.parseDouble(in.readLine( ));
	impresion   System.out.print("impresion");
	lectura String  in.readLine( );

	 
	 int [] algo = new int []; 
	 

	.length(): Regresa el tamaño de una cadena
	.charAt(i): Regresa un caracter de una cadena
	.equals(t): Regresa verdadero cuando s y t son cadenas exactamente iguales
	.equalsIgnoreCase(t): Regresa verdadero cuando s=t sin importar may/min.
	.compareTo(t): Regresa cero si son iguales, menor o mayor a cero si es s es menor/mayor a t
	.compareToIgnoreCase(t): Lo mismo pero sin importar mayúsculas/minúsculas
	 */
}
