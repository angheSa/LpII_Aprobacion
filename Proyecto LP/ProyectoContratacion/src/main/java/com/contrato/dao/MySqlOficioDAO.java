package com.contrato.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import com.contrato.utils.MySqlConexion;
import com.contrato.entidad.Oficio;
import com.contrato.interfaces.OficioDAO;

public class MySqlOficioDAO implements OficioDAO {

	@Override
	public int save(Oficio bean) {
		int salida=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			//Generar la conexion
			cn=MySqlConexion.getConectar();
			//Utilizar sentencias 
			String sql="insert into tb_oficio values(null,?,?,?,?)";
			pstm=cn.prepareStatement(sql);
			//Accediendo a los campos
			
			pstm.setString(1, bean.getFechaOfi());
			pstm.setString(2, bean.getAsuntoOfi());
			pstm.setString(3, bean.getNomSecre());
			pstm.setInt(4, bean.getCodSoli());			
			
			salida=pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(pstm!=null) pstm.close();
				if(cn!=null) cn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return salida;
	}

	@Override
	public int update(Oficio bean) {
		
		int salida=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			cn=MySqlConexion.getConectar();
			String sql="update tb_oficio set fechaOficio=?,asuntoOficio=?,nomSecretaria=?,codSolicitante=? where codOficio=?";
			
			pstm=cn.prepareStatement(sql);
			//Accediendo a los campos
			
			pstm.setString(1, bean.getFechaOfi());
			pstm.setString(2, bean.getAsuntoOfi());
			pstm.setString(3, bean.getNomSecre());
			pstm.setInt(4, bean.getCodSoli());
			pstm.setInt(5, bean.getCodOfi());
			salida=pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(pstm!=null) pstm.close();
				if(cn!=null) cn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return salida;
	}

	@Override
	public int delete(int cod) {
		int salida=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			cn=MySqlConexion.getConectar();
			String sql="delete from tb_oficio where codOficio=?";
	
			pstm=cn.prepareStatement(sql);
			
			pstm.setInt(1, cod);
			
			salida=pstm.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		finally {
			try {
				if(pstm!=null) pstm.close();
				if(cn!=null) cn.close();
			} catch (SQLException e2) {
				e2.printStackTrace();
			}
		}
		return salida;
	}

	@Override
	public Oficio findById(int cod) {
		
		
		Oficio bean=null;
		Connection cn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
	
			cn=MySqlConexion.getConectar();
			String sql="select *from tb_oficio where codOficio=?";
			pstm=cn.prepareStatement(sql);
			pstm.setInt(1, cod);
			rs=pstm.executeQuery();
			//Validamos si existe el registro de oficio
			if(rs.next()) {
				bean=new Oficio();
				bean.setCodOfi (rs.getInt(1));
				bean.setFechaOfi(rs.getString(2));
				bean.setAsuntoOfi(rs.getString(3));
				bean.setNomSecre(rs.getString(4));
				bean.setCodSoli(rs.getInt(5));
				
				
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
	public List<Oficio> listAll() {
	
		List<Oficio> listaOficio=new ArrayList<Oficio>();
		Oficio bean=null;
		Connection cn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			//Conexion y acceder a los datos
			cn=MySqlConexion.getConectar();
			String sql="select *from tb_oficio";
			pstm=cn.prepareStatement(sql);
			rs=pstm.executeQuery();
			
			while(rs.next()) {
				//Crear un objeto de Oficio
				bean=new Oficio();
				
				bean.setCodOfi (rs.getInt(1));
				bean.setFechaOfi(rs.getString(2));
				bean.setAsuntoOfi(rs.getString(3));
				bean.setNomSecre(rs.getString(4));
				
				bean.setCodSoli(rs.getInt(5));
				listaOficio.add(bean);
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
		
		return listaOficio;
		
	}

	
}


	
	


