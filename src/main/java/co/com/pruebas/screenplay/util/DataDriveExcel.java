package co.com.pruebas.screenplay.util;

import jline.internal.Log;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class DataDriveExcel {

    private Map<Integer, Map<Integer, String>> listaTotal = new TreeMap<>();
    private Map<Integer, String> datosDelCliente = new TreeMap<>();
    private static final String NUMERIC = "NUMERIC";

    public Map<Integer, Map<Integer, String>> cargarDataDrive(String strNombreArchivo, Integer... numeroHoja) {

        String rutaArchivo = "src/test/resources/Datadriven/" + strNombreArchivo;

        int numeroDeColumna;
        int numeroDeFila;

        try (FileInputStream file = new FileInputStream(new File(rutaArchivo))) {
            XSSFWorkbook worbook = new XSSFWorkbook(file);
            XSSFSheet sheet = null;
            if (numeroHoja.length == 0) {
                sheet = worbook.getSheetAt(0);
            } else {
                sheet = worbook.getSheetAt(numeroHoja[0]);
            }
            worbook.close();
            Iterator<Row> rowIterator = sheet.iterator();
            Row row;
            numeroDeFila = 0;
            for (Row col : sheet) {
                for (int cn = 0; cn < col.getLastCellNum(); cn++) {
                    col.getCell(cn, Row.MissingCellPolicy.CREATE_NULL_AS_BLANK);
                }
            }
            while (rowIterator.hasNext()) {
                numeroDeColumna = 0;
                row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();

                Cell cell;
                while (cellIterator.hasNext()) {

                    cell = cellIterator.next();

                    CellType tipoCelda = cell.getCellTypeEnum();
                    String tipo = tipoCelda.toString();

                    if (tipo.equals(NUMERIC)) {

                        long intDato = (long) cell.getNumericCellValue();


                        datosDelCliente.put(numeroDeColumna, String.valueOf(intDato));


                    } else {
                        datosDelCliente.put(numeroDeColumna, cell.getStringCellValue());

                    }

                    numeroDeColumna++;

                }
                listaTotal.put(numeroDeFila, datosDelCliente);
                datosDelCliente = new TreeMap<>();
                numeroDeFila++;


            }
        } catch (IOException e) {
            Log.error("No fue posible obtener el datadrive", e);
        }


        return listaTotal;

    }

}
