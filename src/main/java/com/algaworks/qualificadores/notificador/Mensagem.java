package com.algaworks.qualificadores.notificador;

public class Mensagem {
	
	private String assunto;
	
	private String corpo;
	
	public Mensagem(String assunto, String corpo) {
		this.assunto = assunto;
		this.corpo = corpo;
	}

	@Override
	public String toString() {
		return "Mensagem [assunto=" + assunto + ", corpo=" + corpo + "]";
	}
}
