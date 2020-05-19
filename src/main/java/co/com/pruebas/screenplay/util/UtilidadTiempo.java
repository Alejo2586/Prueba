package co.com.pruebas.screenplay.util;

import java.util.concurrent.TimeUnit;

public class UtilidadTiempo {

	//Se espera X cantidad de tiempo para cargar todas las opciones
	public static void esperar(int tiempo) {
		try {
			TimeUnit.SECONDS.sleep(tiempo);
		} catch (InterruptedException e) {
			Thread.currentThread().interrupt();
		}
	}

}
