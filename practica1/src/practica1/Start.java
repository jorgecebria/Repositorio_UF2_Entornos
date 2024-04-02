package practica1;
import java.util.Scanner;

public class Start {
	
	public static void main(String[] args) {
		// creamos mecanimos para llamar a cualquier metodo fuero de la clase
		
		System.out.println("¡Bienvenido a la aplicación de notas!");
		
		
		notas fc= new notas();
		
		fc.IngresaNotas();
		
		fc.comprobarcion();
		
		fc.Calculonotas();
		
		fc.Mostrar();
		
		fc.aprobado();
		
		fc.MostrarVariables();
		

	}
	
}

		