package com.algaworks.qualificadores.notificador;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Qualifier("urgente")
@Component
public class Sms implements Notificador {

	@Override
	public void notificar(Mensagem mensagem) {
		System.out.println("Mensagem por SMS: " + mensagem);
	}
}
