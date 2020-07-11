package com.example.demo.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Repository.UsuarioRepository;
import com.example.demo.model.bean.Usuario;
@Service
public class LoginService {
	@Autowired
	UsuarioRepository usuarioRepo;
	public boolean logar(Usuario usuario) {
		return usuarioRepo.findOneByLoginAndSenha(usuario.getLogin(),usuario.getSenha()) !=null;
	}

}
