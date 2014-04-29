import java.io.*;

public class Game {
	 static BufferedReader in = new BufferedReader(new   InputStreamReader(System.in));
	
	//Contadores
	
	public static int cA,cB,cC,cD,cE;
	
	//Variables Publicas
	
	public static boolean gameend = false, gamecomplete = false;
	
	//Terreno
	
	public Terreno [][][] Mapa = Terreno.crearTerreno();
	
	public static void main(String Arg[ ]) throws IOException    {
		
		
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
	public static String [] palabrasImp;
	
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
			System.out.print(" subir o bajar,");
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
			 palabrasImp = input.split(" ");
			 
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
