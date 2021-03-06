package mx.uam.is.practicadiseno;
import mx.uam.is.practicadiseno.datos.MapeadorDatosImpl;
import mx.uam.is.practicadiseno.negocio.ManejadorImpl;
import mx.uam.is.practicadiseno.vista.Ventana;

public class Programa {

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		// Crea el mapedor de datos
		MapeadorDatosImpl mapeador = new MapeadorDatosImpl();

		// Crea el manejador pasando la referencia de mapeador
		ManejadorImpl manejador = new ManejadorImpl(mapeador);
		// Crea la ventana y le pasa referencia
		Ventana ventana = new Ventana(manejador);
		Ventana v1 = new Ventana(manejador);
		Ventana v2 = new Ventana(manejador);
		// Muestra la ventana arrancando asi el programa
		ventana.setVisible(true);
		v1.setVisible(true);
		v2.setVisible(true);
	}

}
