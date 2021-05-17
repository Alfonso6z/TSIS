package mx.uam.is.practicadiseno.negocio;
import java.util.ArrayList;
import java.util.List;
import mx.uam.is.practicadiseno.datos.MapeadorDatosImpl;

public class ManejadorImpl implements Manejador {

	// La estructura que contiene los datos
	private MapeadorDatosImpl mapeador;
	List<Observador> observador = new ArrayList<Observador>();

	/**
	 * Constructor que inicializa con algunos datos
	 *
	 */
	public ManejadorImpl(MapeadorDatosImpl mapeador) {
		this.mapeador = mapeador; 
	}

	/**
	 * Recupera los datos
	 *
	 * @return la lista de datos
	 */
	public String[] dameDatos() {
		return mapeador.dameDatos();
	}

	/**
	 * Agrega un dato mientras no este vacio y no este ya en la lista
	 *
	 * @param dato el dato a agregar
	 * @return true si se agrego exitosamente false sino
	 */
	public boolean agrega(String dato) {
		return mapeador.agrega(dato);
	}

	/**
	 * Borra un dato de la list
	 *
	 * @param dato el dato a borrar
	 * @return true si se borro exitosamente, false sino
	 */
	public boolean borra(String dato) {
		return mapeador.borra(dato);
	}

	/**
	 * Metodo llamado cuando se cierra el programa
	 * y no hay ventanas abiertas
	 *
	 */
	public void finaliza() {
		System.exit(0);
	}

	// Agrega observador
	@Override
	public boolean agregarObservador(Observador o) {
		if(o!=null){
			observador.add(o);
			System.out.println("Ventanas registradas: " + observador.size());
			return true;
		}
		return false;
	}

	@Override
	public boolean quitarObservador(Observador o) {
		if(o!=null){
			observador.remove(o);
			System.out.println("Ventanas registradas: " + observador.size());
			// Verifica que no hay ventanas registradas para cerrar el programa
			if(observador.size() == 0){
				// System.out.println("Termine");
				finaliza();
			}
			return true;
		}

		return false;
	}

	@Override
	public void notifica() {
		// Notifica a todos los observadores
		for( Observador o: observador){
			o.actualiza();
		}
	}
}