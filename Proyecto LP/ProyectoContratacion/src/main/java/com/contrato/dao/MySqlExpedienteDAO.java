package com.contrato.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.contrato.entidad.Expediente;

import com.contrato.interfaces.ExpedienteDAO;
import com.contrato.utils.MySqlConexion;

public class MySqlExpedienteDAO implements ExpedienteDAO {

	@Override
	public int save(Expediente bean) {
		int salida=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			//Generar la conexion
			cn=MySqlConexion.getConectar();
			//Utilizar sentencias 
			String sql="insert into tb_expediente values(null,?,?,?,?,?)";
			pstm=cn.prepareStatement(sql);
			//Accediendo a los campos
	
			
			pstm.setString(1, bean.getFechaExpe());
			pstm.setString(2, bean.getContratoTiempo());
			pstm.setString(3, bean.getNomSecretria());
			pstm.setString(4, bean.getEstadoExpe());
			pstm.setInt(5, bean.getCodOficio());
		
			
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
	public int update(Expediente bean) {
		int salida=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			cn=MySqlConexion.getConectar();
			String sql="update tb_expediente set fechaExpe=?,contratoTiempo=?,nomSecretaria=?,estadoExpe=?, codOficio=? where codExpediente=?";
			
			pstm=cn.prepareStatement(sql);
			//Accediendo a los campos
			
			pstm.setString(1, bean.getFechaExpe());
			pstm.setString(2, bean.getContratoTiempo());
			pstm.setString(3, bean.getNomSecretria());
			pstm.setString(4, bean.getEstadoExpe());
			pstm.setInt(5, bean.getCodOficio());
			pstm.setInt(6, bean.getCodExpediente());
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
			String sql="delete from tb_expediente where codExpediente=?";
	
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
	public Expediente findById(int cod) {
		Expediente bean=null;
		Connection cn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
	
			cn=MySqlConexion.getConectar();
			String sql="select *from tb_expediente where codExpediente=?";
			pstm=cn.prepareStatement(sql);
			pstm.setInt(1, cod);
			rs=pstm.executeQuery();
			//Validamos si existe el registro de expediente
			if(rs.next()) {
				bean=new Expediente();
				
				bean.setCodExpediente(rs.getInt(1));
				bean.setFechaExpe(rs.getString(2));
				bean.setContratoTiempo(rs.getString(3));
				bean.setNomSecretria(rs.getString(4));
				bean.setEstadoExpe(rs.getString(5));
				bean.setCodOficio(rs.getInt(6));
				
				
				
				
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
	public List<Expediente> listAll() {
		List<Expediente> listaExpe=new ArrayList<Expediente>();
		Expediente bean=null;
		Connection cn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			//Conexion y acceder a los datos
			cn=MySqlConexion.getConectar();
			String sql="select *from tb_expediente";
			pstm=cn.prepareStatement(sql);
			rs=pstm.executeQuery();
			
			while(rs.next()) {
				//Crear un objeto de expediente
				bean=new Expediente();
				
				bean.setCodExpediente(rs.getInt(1));
				bean.setFechaExpe(rs.getString(2));
				bean.setContratoTiempo(rs.getString(3));
				bean.setNomSecretria(rs.getString(4));
				bean.setEstadoExpe(rs.getString(5));
				bean.setCodOficio(rs.getInt(6));
				listaExpe.add(bean);
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
		
		return listaExpe;
	}


}
