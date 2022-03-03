package examenProgramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioEx3 {
	 /* 
	  * Pre: recibe un nombre (nombre del fichero) desde el main
	  * Post: Este método java lee un fichero.csv del que saca información de las consolas que paracen,
	  * 	  las almacena en un ArrayList sin repetirlas.
	  */
	public static ArrayList<String> informacionVideojuegos(String nombre) {
		File file = new File(nombre);
		ArrayList<String> a = new ArrayList<String>();
		try {
			Scanner f = new Scanner(file);
			int contador = 0;
			while(f.hasNextLine()) {
				String linea = f.nextLine();
				String[] palabra = linea.split(",");
				boolean encontrado = false;
				boolean esta = false;
				if (contador>0) {
					String consola="";
					for (int i=0; i<palabra[2].length(); i++) {
						if (palabra[2].substring(i, (i+1)).equals("\"") || palabra[2].substring(i, (i+1)).equals(" ")) {
							encontrado=true;
						}
					}
					if (encontrado==true) {
						consola=consola+palabra[3];
					}
					else {
						consola=consola+palabra[2];
					}
					for (int j=0; j<a.size(); j++) {
						if (a.get(j).equals(consola)) {
							esta=true;
							break;
						}
					}
					if (esta==false) {
						a.add(consola);
					}
				}
				contador++;
			}
			f.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
		return a;
	}
	
	/*
	 * Pre: recibe un ArrayList
	 * Post: Este método main manda la ubicación y nombre del archivo y muestra por pantalla el ArrayList que recibe
	 */
	public static void main (String[] args) {
		String nombre = "C:\\Users\\Luisao\\Desktop\\ventasVideojuegos.csv";
		ArrayList<String> a = informacionVideojuegos(nombre);
		for (int i=0; i<a.size(); i++) {
			
			System.out.println(a.get(i));
			
		}
	}
}
