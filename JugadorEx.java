package examenProgramacion;

public class JugadorEx {
	private String nombre;
	private int dorsal;
	private int disparo;
	private int porteria;
	private int vidas;
	
	public JugadorEx (String nombre, int dorsal, int disparo, int porteria) {
		this.nombre = nombre;
		this.dorsal = dorsal;
		this.disparo = disparo;
		this.porteria = porteria;
		this.vidas = 2;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public int getDisparo() {
		return disparo;
	}

	public void setDisparo(int disparo) {
		this.disparo = disparo;
	}

	public int getPorteria() {
		return porteria;
	}

	public void setPorteria(int porteria) {
		this.porteria = porteria;
	}

	public int getVidas() {
		return vidas;
	}

	public void setVidas(int vidas) {
		this.vidas = vidas;
	}
	
	public int habilidadDisparo(int disparo) {
		int x = disparo*(int) (Math.random()*10);
		return x;
	}
	
	public int habilidadPorteria(int porteria) {
		int x = porteria*(int) (Math.random()*10);
		return x;
	}
	
	@Override
	public String toString() {
		return nombre + dorsal + disparo + porteria + vidas;
	}
}
