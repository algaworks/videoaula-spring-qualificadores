package com.algaworks.qualificadores.servico.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.algaworks.qualificadores.model.Usuario;
import com.algaworks.qualificadores.notificador.Mensagem;
import com.algaworks.qualificadores.notificador.Notificador;
import com.algaworks.qualificadores.servico.UsuarioServico;

@Service
public class UsuarioServicoImpl implements UsuarioServico {
	
	@Qualifier("urgente")
	@Autowired
	private Notificador notificador;
	
	@Override
	public void cadastrar(Usuario usuario) {
		System.out.println("Novo usuário: " + usuario);
		
		notificador.notificar(new Mensagem("Bem vindo!", "Olá!"));
	}
}