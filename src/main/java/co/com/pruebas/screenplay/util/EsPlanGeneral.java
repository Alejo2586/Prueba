package co.com.pruebas.screenplay.util;

import java.util.Map;
import java.util.TreeMap;

public class EsPlanGeneral {

	private static Map<Integer, Map<Integer, String>> dataDrive = new TreeMap<>();

	private EsPlanGeneral() {
		assert true;
	}

	public static boolean esPlanGeneral(String planAEvaluar) {

		DataDriveExcel cargar = new DataDriveExcel();

		dataDrive = cargar.cargarDataDrive("PlanesGenerales.xlsx");
		return dataDrive.toString().contains(planAEvaluar);


	}

}

