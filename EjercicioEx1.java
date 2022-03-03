package examenProgramacion;

import java.util.ArrayList;

public class EjercicioEx1 {
	
	 /*
	  * Pre:recibe el disparo de cada jugador
	  * Post: Este método crea la variable habilidadDisparo de forma aleatoria utilizada en el rápido y se la manda al main
	  */
	public static int habilidadDisparo(int disparo) {
		int x = disparo*(int) (Math.random()*10);
		return x;
	}
	
	/*
	  * Pre: recibe la porteria de cada jugador
	  * Post: Este método crea la variable habilidadPorteria de forma aleatoria utilizada en el rápido y se la manda al main
	  */
	public static int habilidadPorteria(int porteria) {
		int x = porteria*(int) (Math.random()*10);
		return x;
	}
	
	/*
	 * Pre:---
	 * Post: Este método crea en un array list 10 objetos de tipo JugadorEx e implementa un bucle while que los enfrenta,
	 * 		 el jugador que de manera aleatoria supera al siguiente con su disparo en porteria, le resta una vida.
	 * 		 Así hasta que los jugadores se quedan con 0 vidas.
	 */
	public static void main(String[] args) {
		ArrayList<JugadorEx> a = new ArrayList<JugadorEx>();
		JugadorEx jugador1 = new JugadorEx("Luis", 1, 5, 5);
		JugadorEx jugador2 = new JugadorEx("Alvaro", 2, 5, 5);
		JugadorEx jugador3 = new JugadorEx("Carlos", 3, 5, 5);
		JugadorEx jugador4 = new JugadorEx("Jose", 4, 5, 5);
		JugadorEx jugador5 = new JugadorEx("Elias", 5, 5, 5);
		JugadorEx jugador6 = new JugadorEx("Rut", 6, 5, 5);
		JugadorEx jugador7 = new JugadorEx("Diego", 7, 5, 5);
		JugadorEx jugador8 = new JugadorEx("Alexis", 8, 5, 5);
		JugadorEx jugador9 = new JugadorEx("Pradanos", 9, 5, 5);
		JugadorEx jugador10 = new JugadorEx("Rosana", 10, 5, 5);
		a.add(jugador1);
		a.add(jugador2);
		a.add(jugador3);
		a.add(jugador4);
		a.add(jugador5);
		a.add(jugador6);
		a.add(jugador7);
		a.add(jugador8);
		a.add(jugador9);
		a.add(jugador10);
		
		System.out.println(a.get(0).getNombre());
		int i = 0;
		while(i<a.size()) {
			if (i<9) {
				if (a.get(i).getVidas()>0 || a.get(i+1).getVidas()>0) {
					int x = habilidadDisparo(a.get(i).getDisparo());
					int y = habilidadPorteria(a.get(i+1).getPorteria());
					if (x>y) {
						a.get(i+1).setVidas(a.get(i+1).getVidas()-1);
					}
				}
				i++;
			}
			else {
				if (a.get(i).getVidas()>0 || a.get(0).getVidas()>0) {
					int x = habilidadDisparo(a.get(i).getDisparo());
					int y = habilidadPorteria(a.get(0).getPorteria());
					if (x>y) {
						a.get(0).setVidas(a.get(0).getVidas()-1);
					}
				}
				i=0;
			}
			int contador=0;
			for (int j=0; j<a.size(); j++) {
				if (a.get(i).getVidas()==0) {
					contador++;
				}
			}
			if (contador==10) {
				break;
			}
			else {
				System.out.println("Resumen");
				System.out.println("#####################");
				for (int k=0; k<a.size(); k++) {
					System.out.println(a.get(k).getNombre() + " " + a.get(k).getVidas());
				}
			}
		}
		System.out.println("Gracias por jugar al rápido");
	}
}
