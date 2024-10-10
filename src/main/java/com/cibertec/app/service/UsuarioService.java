package com.cibertec.app.service;

import java.util.List;
import com.cibertec.app.entity.Usuario;

public interface UsuarioService {

    public Usuario saveUsuario(Usuario registroDTO);
	
	public List<Usuario> getAllUsuario();
	
	public boolean login(Usuario usuario);
}
