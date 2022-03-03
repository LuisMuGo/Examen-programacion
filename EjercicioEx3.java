package examenProgramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class EjercicioEx3 {
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
				if (contador>0) {
					String consola="";
					for (int i=0; i<palabra[2].length(); i++) {
						if (palabra[2].substring(i, (i+1)).equals("\"") || palabra[2].substring(i, (i+1)).equals(" ")) {
							encontrado=true;
						}
					}
					if (encontrado==true) {
						System.out.println(palabra[3]);
					}
					else {
						System.out.println(palabra[2]);
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
	public static void main (String[] args) {
		String nombre = "C:\\Users\\Luisao\\Desktop\\ventasVideojuegos.csv";
		ArrayList<String> a = informacionVideojuegos(nombre);
		for (int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
	}
}
