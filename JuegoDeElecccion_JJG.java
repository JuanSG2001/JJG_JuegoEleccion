package programacion;

import java.util.Scanner;

public class JuegoDeElecccion_JJG {

	public static void main(String[] args) {

		
		Scanner scanner=new Scanner(System.in);
		
		int opcion;
		
		String nombre;
		
		System.out.print(" \n - Escriba su nombre para empezar el juego: ");
		nombre=scanner.next().toUpperCase();
		
		System.out.println("\n ��BIENVENIDO "+nombre+" !! \n");
		
		System.out.println("Empezemos con la historia...\n");
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Esta es la historia de "+nombre+", el/la cual se encontraba tumbad@ en la cama, un d�a cualquiera, cuando....");
		
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1: Se queda 20 minutos mas en la cama.\n"
						+  "2: Se levanta de la cama y se va a desayunar \n"
						+  "3: De repente escuch� un estruendo proveniente del jard�n del vecino, y decide echar un vistazo por la ventana. \n");
		
		opcion=scanner.nextInt();
		
		if(opcion<=0 || opcion>3 ) {
			System.out.println("Escoge de nuevo");
			opcion=scanner.nextInt();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	if (opcion == 3) {
		
		try {
			Thread.sleep(1500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Entre lega�as, " + nombre + " se asoma por la ventana y descubre que un coche \nse ha estrellado contra la casa del vecino. Ante este panorama... \n");
		
		try {
			Thread.sleep(3500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("1: Avisa a la polic�a.\n"
				+  "2: Se pone su chaleco y va a investigar.\n");
		
		opcion=scanner.nextInt();
		
		if(opcion<=0 || opcion>3 ) {
			System.out.println("Escoge de nuevo");
			opcion=scanner.nextInt();
		}
		if (opcion == 1) {
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(nombre + " cuenta lo ocurrido a la polic�a desde la seguridad de su casa, y minutos mas tarde, \nun par de oficiales se aproximan al coche estrellado, del cual por cierto, no ha salido nadie por el momento. \nTus vecinos no parecen haberse percatado del incidente.\nEs todo muy extra�o.\nDesde la ventana observas que los polic�as se miran extra�ados y comienzan a llamar a la puerta de tu vecino\nEn el instante en el que el pu�o del oficial golpea la puerta suena tu tel�fono...\n");
			
			try {
				Thread.sleep(3500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println("1: Coges el tel�fono.\n"
					+  "2: No coges el tel�fono.\n");
			
			opcion=scanner.nextInt();
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			if (opcion == 1) {
				System.out.println("Escuchas como tu vecino te invoca a un juicio.\n Apareces sentado entre los testigos del accidente que se cobr� la vida de tu vecino.\n El juez Dios est� sentado ante vosotros, dictaminando la sentencia.\n Dios dijo: " + nombre + ". �T� crees que suicid� tu vecino?\n A lo que respondiste: Yo no creo eso, porque se ve�a bien mi vecino, pienso que fue un accidente.\n A lo que Dios dijo: As� pues, al purgatorio. \n Se pone todo en blanco y sientes como tu vecino te da las gracias.");
			}else {
				System.out.println("A pesar de no coger el tel�fono sientes como tu vecino te llama.\n Escuchas como tu vecino te invoca a un juicio.\n Apareces sentado entre los testigos del accidente que se cobr� la vida de tu vecino.\n El juez Dios est� sentado ante vosotros, dictaminando la sentencia.\n Dios dijo: " + nombre + ". �T� crees que suicid� tu vecino?\n A lo que respondiste: Yo no creo eso, porque se ve�a bien mi vecino, pienso que fue un accidente.\n A lo que Dios dijo: As� pues, al purgatorio. \n Se pone todo en blanco y sientes como tu vecino te da las gracias.");
				opcion = 1;
			}
			
		}
		if (opcion == 2) {
			
			try {
				Thread.sleep(1500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			System.out.println(nombre + " se pone su chaleco y se aproxima al coche para darse cuenta, por desgracia, de que el que se ha estrellado es su vecino.\n Ante esta situaci�n procedes a llamar a una ambulancia.\n Para tu asombro la voz que te responde es la de tu vecino, el cual, te invoca a un juicio.\n Apareces sentado entre los testigos del accidente que se cobr� la vida de tu vecino.\n El juez Dios est� sentado ante vosotros, dictaminando la sentencia.\n Dios dijo: " + nombre + ". �T� crees que suicid� tu vecino?\n A lo que respondiste: Yo no creo eso, porque se ve�a bien mi vecino, pienso que fue un accidente.\n A lo que Dios dijo: As� pues, al purgatorio. \n Se pone todo en blanco y sientes como tu vecino te da las gracias.");
			
		}
		
	}	
		
		
		
		

	}
	
}