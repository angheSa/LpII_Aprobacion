package com.contrato.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.contrato.entidad.Menu;
import com.contrato.entidad.Usuario;
import com.contrato.interfaces.UsuarioDAO;
import com.contrato.utils.MySqlConexion;

public class MySqlUsuarioDAO implements UsuarioDAO{


		@Override
		public Usuario iniciarSesion(String login, String clave) {
			Usuario bean=null;
			Connection cn=null;
			PreparedStatement pstm=null;
			ResultSet rs=null;
			try {
				//1.
				cn=MySqlConexion.getConectar();
				//2.
				String sql="select codigoUsuario,nombreUsuario,ApellidoUsuario from tb_usuario where loginUsuario=? and passUsuario=?";
				//3.
				pstm=cn.prepareStatement(sql);
				//4.parámetros
				pstm.setString(1, login);
				pstm.setString(2, clave);
				//5.
				rs=pstm.executeQuery();
				//6.validar si existe registro
				if(rs.next()) {
					//7
					bean=new Usuario();
					//8
					bean.setCodigo(rs.getInt(1));
					bean.setNombres(rs.getString(2));
					bean.setApellidos(rs.getString(3));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(rs!=null) rs.close();
					if(pstm!=null) pstm.close();
					if(cn!=null) cn.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}		
			return bean;
		}

		@Override
		public List<Menu> traerMenusPorUsuario(int codUsu) {
			List<Menu> lista=new ArrayList<Menu>();
			Menu bean=null;
			Connection cn=null;
			PreparedStatement pstm=null;
			ResultSet rs=null;
			try {
				//1.
				cn=MySqlConexion.getConectar();
				//2.
				String sql="select a.codigoMenu,m.des_men,m.urlMenu from tb_acceso a join tb_menu m on a.codigoMenu=m.codigoMenu where a.codigoUsuario=?";
				//3.
				pstm=cn.prepareStatement(sql);
				//4.parámetros
				pstm.setInt(1, codUsu);
				//5.
				rs=pstm.executeQuery();
				//6.
				while(rs.next()) {
					//7
					bean=new Menu();
					//8
					bean.setCodigo(rs.getInt(1));
					bean.setNombre(rs.getString(2));
					bean.setUrl(rs.getString(3));
					//9
					lista.add(bean);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			finally {
				try {
					if(rs!=null) rs.close();
					if(pstm!=null) pstm.close();
					if(cn!=null) cn.close();
				} catch (SQLException e2) {
					e2.printStackTrace();
				}
			}		
			return lista;
		}


}
