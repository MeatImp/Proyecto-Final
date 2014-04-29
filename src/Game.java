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
	
	//jugador
	
	public static Player jugador;
	
	
	//Main, declare algunas variables antes por que son estaticos
	public static void main(String Arg[ ]) throws IOException    {
		
		
		//es para que no nos diga nada que no usamos salir, no te preocupes
		@SuppressWarnings("unused")
		String salir;
		
		//texto de introduccion
		System.out.println("La Cueva, un juego de exploracion a base de Texto.");
		System.out.println("<-----Por Joseph M. Trippp, 27427, salon 2405---->");
		System.out.println("<-----Por Luis F. Martinez, 27105, salon 2405---->");
		System.out.println("<---##########################################--->");
		
		System.out.println(/*Introduccion*/);
		System.out.println("¿Que haras ahora?");
		System.out.println("*Puedes escribir 'Ayuda' para obtener una lista de comandos*");
		
		/*
		 * este while literalmente es el juego completo xd.
		 * te dice la informacion de cuando llegas a una casilla
		 * lee los comandos que tiene ingresa el jugador
		 * y esas dos funciones se encargan de que salga todo
		 * 
		 * debo de poner que el lupillo pueda salir cuando queira..
		 */
		
		while(!(gameend)){
			llegue();
			leerInput();
		}
		
		System.out.println("Ingresa cualquier cosa para salir.");
		salir = in.readLine();
	}
	
	
	//cosas genericas
	public static String input;
	public static String [] palabrasInp;
	
	//librerias
	public static String []	palabrasMovimiento;{
		palabrasMovimiento[0] = "ir";
		palabrasMovimiento[1] = "viajar";
		palabrasMovimiento[2] = "caminar";
		palabrasMovimiento[3] = "moverse";
	}
	
	public static void imprimirAyuda(){
		
		//si llegaste aqui es por que necesitas ayuda, entonces...
		boolean necesitoAyuda = true;
		int opcionAyuda;
		
		//con que la necesitas?
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
			
			//estos comandos pueden mejorar bastante, pero necesito las librerias
			
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
				
				//aqui podemos poner mas comandos
				
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
		
		//los interpretes se llaman parses, si digo parse es por eso.
		try {
			
			//leer y separar las palabras
			input = in.readLine();
			input = input.toLowerCase();
			palabrasInp = input.split(" ");
			
			//la ayuda debe de ser facilmente accesible			 
			if (input != "ayuda"){
				
			}
			else{
				imprimirAyuda();
			}
			
		}//esto es un catch, nos sirve en caso que el jugador la cague de alguna manera, detecta problemas en el juego, y trata de reiniciar. Despues de muchos turnos tal vez se nos sature la memoria, muchos siendo 2^32 turnos
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
	
	/* Orden y nomenclatura
	 * 
	 * Variables usadas en el Main
	 * Arreglos y librerias usadas en el Main
	 * Main
	 * Variables usadas en las funciones
	 * Arreglos y librerias usadas en las funciones
	 * Funciones
	 * 
	 * Tratar de ordenar luego en orden alfabetico por comodidad
	 */
	
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
	
	/* Libreria (Agregar cosas que se nos olvidan que son)
	input = lo que el jugador escribio en bruto
	palabrasInp = arreglo de las diferentes palabras en input.
	*/
	
	/* Declaraciones etc
	 
	Variables
	lectura int  Integer.parseInt(in.readLine( ));
	lectura float  Float.parseFloat(in.readLine( ));
	lectura double Double.parseDouble(in.readLine( ));
	impresion   System.out.print("impresion");
	lectura String  in.readLine( );


	 Arreglos 
	 
	 int [] algo = new int []; 
	 
	 Operaciones con Strings

	.length(): Regresa el tamaño de una cadena
	.charAt(i): Regresa un caracter de una cadena
	.equals(t): Regresa verdadero cuando s y t son cadenas exactamente iguales
	.equalsIgnoreCase(t): Regresa verdadero cuando s=t sin importar may/min.
	.compareTo(t): Regresa cero si son iguales, menor o mayor a cero si es s es menor/mayor a t
	.compareToIgnoreCase(t): Lo mismo pero sin importar mayúsculas/minúsculas
	 */
}
