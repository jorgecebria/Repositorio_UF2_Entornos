package practica1;

import java.util.Scanner;

/**
 * @see notas Clase notas, contiene los métodos para el cálculo de notas
 * @param uf1 Nota de la UF1
 * @param uf2 Nota de la UF2
 * @param uf3 Nota de la UF3
 * @param acu1 Nota de la UF1 x0,35 
 * @param acu2 Nota de la UF2 x0,35
 * @param acu3 Nota de la UF3 x0,30
 * @param def Nota definitiva, sumatorio de acu1, acu2 y acu3
 * */


public class notas {
	//declaramos la variables que nos hacen falta
	double uf1, uf2, uf3;
	double acu1, acu2, acu3, def;
	//utilizames ecaner para poder introducir datos
	Scanner entrada = new Scanner(System.in);
	
	///vamos ca crear un metodo para ingresar 
	
	/**
	 * IngresarNotas() es una función que nos pide las notas de los estudiantes parar almacenarlas en las variables uf1, uf2 y uf3.
	 * */
	
	public void IngresaNotas() {
		//cuando ejeuctamos este metodo lo primnero que queremos es que nos pida notas
		System.out.println("ingrese las notas del estudiante");
		
		System.out.print("ingrese nota 1: ");
		
		uf1= entrada.nextDouble();

		
		
		System.out.print("ingrese nota 2: ");
		
		uf2= entrada.nextDouble();
		System.out.print("ingrese nota 3: ");
		
		uf3= entrada.nextDouble();
		
	
	}
	
	// metodo para comprobar bien entroduccion de notas
	
	/**
	 * Comprobarcion() es una función que verifica que las notas introducidas tienen el formato correcto. 
	 * 
	 * */
	
	public void comprobarcion(){
		
		if (uf1>10) {
			System.out.println(" nota1 mal introducida");
			
		}else {
			System.out.println(" nota1 correcta");
		}
		
		if (uf2>10) {
			System.out.println(" nota2 mal introducida");
			
		}else {
			System.out.println(" nota2 correcta");
		}
		if (uf3>10) {
			System.out.println(" nota3 mal introducida");
			
		}else {
			System.out.println(" nota3 correcta");
		}
		
			
		
		
	}
	// metodo para calcular nota
	
	/**
	 * Calculonotas() es una función que utiliza las notas introducidas para realizar el calculo de la nota definitiva. 
	 * */
	
	public void Calculonotas() {
		acu1= uf1*0.35;
		acu2 = uf2 * 0.35;
		acu3 = uf3 * 0.30;
		
		def = acu1 + acu2+ acu3;
		
		//hasta aqui la tenemos calculada peor no la mostramos
	}
	
	/**
	 * La función Mostrar() hace un print de las nota de cada UF, del acumulado y de la nota definitiva. 
	 * */
	
	public void Mostrar() {
		//print ln lo que hace es que al terminar el print baja la linea
		System.out.println(" notas introducidas son:");
		System.out.println(" nota1 = " + uf1);
		System.out.println(" nota2 = " + uf2);
		System.out.println(" nota3 = " + uf3);
		
		System.out.println(" acumuado 1 = "+ acu1);
		System.out.println(" acumuado 2 = "+ acu2);
		System.out.println(" acumuado 3 = "+ acu3);
		
		System.out.println(" nota definitiva es = "+ def);
		
	}

	/**
	 * La función aprobado() comprueba si el alumno está aprobado o suspendido. También si hay algun error con las notas. 
	 * */
	
	public void aprobado() {
			
			if(def<5 && def>=0) {
				System.out.println("suspendio");
			}else {
				if (def>=5 && def<=10 ) {
				System.out.println("aprobado");
				}else {
					System.out.println(" error en la notas");
				}
			}
		}
	
	/**
	 * La función MostrarVariables() Muestra todas las variables para el entregable 1, ejercicio 2. Se uso en la anterior UF.
	 * */
	
	public void MostrarVariables() {
		
		System.out.println("*******************************************************");
		System.out.println("Función Mostrar variables para Entregable 1 Ejercicio 2");
		System.out.println("*******************************************************");
		System.out.println("  ");
		System.out.println(" Las variables usadas son:");
		System.out.println(" 1. uf1 como nota1 cuyo valor es = " + uf1);
		System.out.println(" 2. uf2 como nota2 cuyo valor es = " + uf2);
		System.out.println(" 3. uf3 como nota3 cuyo valor es = " + uf3);
		
		System.out.println(" 4. acu1 como acumulado 1 cuyo valor es = "+ acu1);
		System.out.println(" 5. acu2 como acumulado 2 cuyo valor es = "+ acu2);
		System.out.println(" 6. acu3 como acumulado 3 cuyo valor es = "+ acu3);
		
		System.out.println(" 7. def como nota definitiva cuyo valor es = "+ def);
		
	}
		
	

}




