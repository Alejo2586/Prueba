package co.com.pruebas.screenplay.util;

import java.util.Map;
import java.util.TreeMap;

public class ObtenerInformacionDelCliente {

	private static Map<Integer,Map<Integer,String>> dataDrive = new TreeMap<>();
	
	private static String tipoDeUsuario ;
	private static String tipoDeDocumento;
	private static String numeroDeDocumento;
	private static String nombreDeLaEmpresa;
	private static String tipoDeCuenta;
	private static String numeroDeCuenta;
	private static String tipoDocRepresentante;
	private static String numeroDocumentoRepresentante;
	private static String valorDelLimite;
	private static String numeroDeLaGarantia;
	private static String montoADesembolsar;
	private static String plazoDelDesembolso;
	private static String numeroDeSolicitudDelDesembolso;
	private static String numeroDelDesembolso;
	private static String numeroDeLaRelacion;
	private static String solicitudRM;
	
	private ObtenerInformacionDelCliente() {
		assert true;
	}
	
	
	public static void obtenerInformacionDelCliente() {

		 dataDrive = cargarDataDrive();
		
			 tipoDeUsuario = dataDrive.get(1).get(0);
			 tipoDeDocumento = dataDrive.get(1).get(1);
			 numeroDeDocumento = dataDrive.get(1).get(2);
			 nombreDeLaEmpresa = dataDrive.get(1).get(3);
			 tipoDeCuenta = dataDrive.get(1).get(4);
			 numeroDeCuenta = dataDrive.get(1).get(5);
			 tipoDocRepresentante = dataDrive.get(1).get(6);
			 numeroDocumentoRepresentante = dataDrive.get(1).get(7);
			 valorDelLimite = dataDrive.get(1).get(8);
			 numeroDeLaGarantia = dataDrive.get(1).get(9);
			 montoADesembolsar = dataDrive.get(1).get(10);
			 plazoDelDesembolso = dataDrive.get(1).get(11);
			 numeroDeSolicitudDelDesembolso = dataDrive.get(1).get(12);
			 numeroDelDesembolso = dataDrive.get(1).get(13);
			 numeroDeLaRelacion = dataDrive.get(1).get(14);
		
	}

		public static Map<Integer,Map<Integer,String>> cargarDataDrive() {
	    DataDriveExcel cargar = new DataDriveExcel();
		return cargar.cargarDataDrive("datadrive.xlsx");
	}
	
	public static Map<Integer,Map<Integer,String>> dataDrive(){
		return dataDrive;
	}
	
	public static String tipoDeUsuario() {
		return tipoDeUsuario;
	}
	
	public static String tipoDeDocumento() {
		return tipoDeDocumento;
	}
	
	public static String numeroDeDocumento() {
		return numeroDeDocumento;
	}
	 

	public static String nombreDeLaEmpresa() {
		return nombreDeLaEmpresa;
	}
	public static String tipoDeCuenta() {
		return tipoDeCuenta;
	}
	public static String numeroDeCuenta() {
		return numeroDeCuenta;
	}
	public static String tipoDocRepresentante() {
		return tipoDocRepresentante;
	}
	public static String numeroDocumentoRepresentante() {
		return numeroDocumentoRepresentante;
	}
	public static String valorDelLimite() { return valorDelLimite; }
	
	public static String numeroDeLaGarantia() {
		return numeroDeLaGarantia;
	}
	
	public static String montoADesembolsar() {
		return montoADesembolsar;
	}
	public static String plazoDelDesembolso() {
		return plazoDelDesembolso;
	}
	public static String numeroDeSolicitudDelDesembolso() {
		return numeroDeSolicitudDelDesembolso;
	}

	public static String numeroDeLaRelacion(){
		return numeroDeLaRelacion;
	}

	public static String numeroDelDesembolso() {
		return numeroDelDesembolso;
	}
	public static String solicitudRM() { return solicitudRM;}
	
	public static void actualizarNumeroDocumentoRepresentante(String numeroDocumentoRepresentanteActualizado) {
		numeroDocumentoRepresentante = numeroDocumentoRepresentanteActualizado;
	}
	
	public static void actualizarNumeroDeDocumento(String numeroDelDocumentoActualizado) {
		numeroDeDocumento = numeroDelDocumentoActualizado;
	} 
	public static void actualizarNumeroDeLaCuenta(String numeroDeLaCuentaActualizado) {
		numeroDeCuenta = numeroDeLaCuentaActualizado;
	}
	
	public static void actualizarNumeroDeSolicitudDelDesembolso(String numeroDeSolicitudDelDesembolsoActualizado) {
		numeroDeSolicitudDelDesembolso = numeroDeSolicitudDelDesembolsoActualizado;
	}
	
	public static void actualizarNumeroDelDesembolso(String numeroDelDesembolsoActualizado) {
		numeroDelDesembolso = numeroDelDesembolsoActualizado;
	}
	
	public static void actualizarNumeroDeLaGarantia(String numeroDeLaGarantiaActualizado) {
		numeroDeLaGarantia = numeroDeLaGarantiaActualizado;
	}
	public static void actualizarMontoDelDesembolso(String montoADesembolsarActualizado) {
		montoADesembolsar = montoADesembolsarActualizado;

	}
	public static void actualizarPlazoDelDesembolso(String plazodDelDesembolsoActualizado) {
		plazoDelDesembolso = plazodDelDesembolsoActualizado;
	}

	public static void actualizarTipoDePersona(String tipoDePersonaActualizado) {
		tipoDeUsuario = tipoDePersonaActualizado;
	}

	public static void actualizarTipoDeDocumento(String tipoDeDocumentoActualizado) {
		tipoDeDocumento = tipoDeDocumentoActualizado;

	}

	public static void actualizarNumeroDelaRelacion(String numeroDeLaRelacionActualizado) {
		numeroDeLaRelacion = numeroDeLaRelacionActualizado;

	}
	
}
