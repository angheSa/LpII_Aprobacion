package com.contrato.services;

import java.util.List;

import com.contrato.entidad.Menu;
import com.contrato.entidad.Usuario;
import com.contrato.fabrica.DAOFactory;
import com.contrato.interfaces.UsuarioDAO;

public class UsuarioService {
	private DAOFactory fabrica=DAOFactory.getDAOFactory(1);
	private UsuarioDAO objUsuario=fabrica.getUsuarioDAO();
	
	public Usuario loginUsuario(String login, String clave) {
		return objUsuario.iniciarSesion(login, clave);
	}
	public List<Menu> menuDelUsuario(int codUsu) {
		return objUsuario.traerMenusPorUsuario(codUsu);
	}
	
}
