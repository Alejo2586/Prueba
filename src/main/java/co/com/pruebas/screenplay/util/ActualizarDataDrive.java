package co.com.pruebas.screenplay.util;

import jline.internal.Log;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Map;

public class ActualizarDataDrive {

	public void exportarDataDrive(Map<Integer, Map<Integer, String>> dataDrive, String strNombreArchivo) {
		XSSFWorkbook libro;
		int i = 0;
		int intNumeroDeColumnas = 0;
		int intNumeroDeFilas = 0;
		String rutaArchivo = "src/test/resources/Datadriven/" + strNombreArchivo;

		String hoja = "Hoja1";
		libro = new XSSFWorkbook();
		XSSFSheet hoja1 = libro.createSheet(hoja);
		
		intNumeroDeFilas = dataDrive.size();
		intNumeroDeColumnas = dataDrive.get(0).size();


		for (i = 0; i < intNumeroDeFilas; i++) {
			XSSFRow row = hoja1.createRow(i);
			for (int j = 0; j < intNumeroDeColumnas; j++) {

				XSSFCell cell = row.createCell(j);
				cell.setCellValue(dataDrive.get(i).get(j));

			}
		}

		try {
			Files.delete(Paths.get(rutaArchivo));
		} catch (IOException e1) {
			Log.error("No fue posible reemplazar el DataDrive existente", e1);
		}

		File file;
		file = new File(rutaArchivo);
		try (FileOutputStream fileOuS = new FileOutputStream(file)) {

			libro.write(fileOuS);
			fileOuS.flush();
			libro.close();

		} catch (IOException e2) {
			Log.error("No fue posible actualizar el datadrive", e2);
		}

	}

	public void eliminarDataDriveExistente(Path rutaArchivo) {
		
		try {
			Files.delete(rutaArchivo);
		} catch (IOException e) {
			Log.error("no es posible eliminar el DataDrive existente",e);
		}
	}

}
