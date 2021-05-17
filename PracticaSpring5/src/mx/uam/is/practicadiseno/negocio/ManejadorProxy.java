package mx.uam.is.practicadiseno.negocio;

public class ManejadorProxy implements Manejador {
	
	//	Referencia al manejador
	private Manejador manejador;
	
	ManejadorProxy(Manejador manejador){
		 this.manejador = manejador;
	}
	@Override
	public String[] dameDatos() {
		System.out.println("Se invocó el método dameDatos()");
		return manejador.dameDatos();
	}

	@Override
	public boolean agrega(String dato) {
		System.out.println("Se invocó el método agrega(String data)");
		return manejador.agrega(dato);
	}

	@Override
	public boolean borra(String dato) {
		System.out.println("Se invocó el método borrar(String dato)");
		return manejador.borra(dato);
	}

	@Override
	public void finaliza() {
		System.out.println("Se invocó el método manejador.finaliza()");
		manejador.finaliza();
		
	}

	@Override
	public boolean agregarObservador(Observador o) {
		// hacer traza y desplegar hacia el navegador:
		System.out.println("Se invocó el método agregarObservador(Observador o)");
		return manejador.agregarObservador(o);
	}

	@Override
	public boolean quitarObservador(Observador o) {
		System.out.println("Se invocó el método quitarObservador");
		return manejador.quitarObservador(o);
	}

	@Override
	public void notifica() {
		System.out.println("Se invocó el método notifica");
		manejador.notifica();
	}

	
	
}
