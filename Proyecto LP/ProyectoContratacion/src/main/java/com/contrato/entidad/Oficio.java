package com.contrato.entidad;

public class Oficio {
	//Declaraci�n de variables
	private int codSoli, codOfi;
	private String asuntoOfi,nomSecre,fechaOfi;
	//M�todos get and set
	public int getCodSoli() {
		return codSoli;
	}
	public void setCodSoli(int codSoli) {
		this.codSoli = codSoli;
	}
	
	public int getCodOfi() {
		return codOfi;
	}
	public void setCodOfi(int codOfi) {
		this.codOfi = codOfi;
	}
	public String getAsuntoOfi() {
		return asuntoOfi;
	}
	public void setAsuntoOfi(String asuntoOfi) {
		this.asuntoOfi = asuntoOfi;
	}
	public String getNomSecre() {
		return nomSecre;
	}
	public void setNomSecre(String nomSecre) {
		this.nomSecre = nomSecre;
	}

	public String getFechaOfi() {
		return fechaOfi;
	}
	public void setFechaOfi(String fechaOfi) {
		this.fechaOfi = fechaOfi;
	}
	
}
