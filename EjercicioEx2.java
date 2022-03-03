package examenProgramacion;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class EjercicioEx2 {
	public static void main (String[] args) {
		int longitud=8;
		palabrasMasLargasQue(longitud);
		
	}
	public static void palabrasMasLargasQue(int longitud) {
		String nombre = "C:\\Users\\Luisao\\Desktop\\textoExamen.txt";
		File file = new File(nombre);
		int contador=0;
		try {
			Scanner f = new Scanner(file);
			while(f.hasNext()) {
				boolean comprobador = false;
				String palabra = f.next();
				String palabra1 = "";
				for (int i=0; i<palabra.length(); i++) {
					if(palabra.substring(i,(i+1)).equals(".") || palabra.substring(i,(i+1)).equals(",")) {
						comprobador = true;
					}
					else if(palabra.substring(i,(i+1)).equals("(") || palabra.substring(i,(i+1)).equals(")")) {
						comprobador = true;
					}
					else if(palabra.substring(i,(i+1)).equals("\"")) {
						comprobador = true;
					}
					if (comprobador == false) {
						palabra1=palabra1+palabra.substring(i,(i+1));
					}
				}
				if (palabra1.length()>=longitud) {
					contador++;
				}
			}
			System.out.println(contador);
		
			f.close();
		} catch(FileNotFoundException e) {
			System.out.println("El fichero " + nombre + " no ha podido ser abierto.");
		}
	}
}
