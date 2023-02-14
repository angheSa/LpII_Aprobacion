package com.contrato.dao;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


import com.contrato.entidad.Solicitante;
import com.contrato.interfaces.SolicitanteDAO;
import com.contrato.utils.MySqlConexion;

public class MySqlSolicitanteDAO implements SolicitanteDAO {

	@Override
	public int save(Solicitante bean) {
		int salida=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			//1
			cn=MySqlConexion.getConectar();
			//2
			String sql="insert into tb_solicitante values(null,?,?,?,?,?,?,?,?)";
			//3
			pstm=cn.prepareStatement(sql);
			//4
			
			pstm.setString(1, bean.getNomSoli());
			pstm.setString(2, bean.getApeSoli());
			pstm.setInt(3, bean.getDniSoli());
			
			pstm.setString(4, bean.getDistrito());
			pstm.setString(5, bean.getDireccSoli());
			pstm.setInt(6, bean.getCeluSoli());
			pstm.setString(7, bean.getSexo());
			pstm.setString(8, bean.getTipoContrato());
			
			
			//5
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
	public int update(Solicitante bean) {
		int salida=-1;
		Connection cn=null;
		PreparedStatement pstm=null;
		try {
			cn=MySqlConexion.getConectar();
			String sql="update tb_solicitante set nombreSoli=?,apellidosSoli=?,dniSoli=?,distrito=?,"
					+ "direccion=?,celular=?,sexo=?,tipoContratacion=? where codSolicitante=?";
			

			pstm=cn.prepareStatement(sql);
			//Accediendo a los campos
		;
			pstm.setString(1, bean.getNomSoli());
			pstm.setString(2, bean.getApeSoli());
			pstm.setInt(3, bean.getDniSoli());
			pstm.setString(4, bean.getDistrito());
			pstm.setString(5, bean.getDireccSoli());
			pstm.setInt(6, bean.getCeluSoli());
			pstm.setString(7, bean.getSexo());
			pstm.setString(8, bean.getTipoContrato());
			pstm.setInt(9, bean.getCodSoli());
			
			
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
			String sql="delete from tb_solicitante where codSolicitante=?";
	
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
	public Solicitante findById(int cod){
		
		Solicitante bean=null;
		Connection cn=null;
		PreparedStatement pstm=null;
		ResultSet rs=null;
		try {
			
			//Conexion y acceder a los datos
			cn=MySqlConexion.getConectar();
			String sql="select *from tb_solicitante where codSolicitante=?";
			pstm=cn.prepareStatement(sql);
			pstm.setInt(1, cod);
			rs=pstm.executeQuery();
			if(rs.next()) {
				//Crear un objeto de Solicitante
				bean=new Solicitante();
				bean.setCodSoli(rs.getInt(1));
				bean.setNomSoli(rs.getString(2));
				bean.setApeSoli(rs.getString(3));
				bean.setDniSoli(rs.getInt(4));
				bean.setDistrito(rs.getString(5));
				bean.setDireccSoli(rs.getString(6));
				bean.setCeluSoli(rs.getInt(7));
				bean.setSexo(rs.getString(8));
				bean.setTipoContrato(rs.getString(9));
				
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
	public List<Solicitante> listAll() {
	List<Solicitante> lista=new ArrayList<Solicitante>();
	Solicitante bean=null;
	Connection cn=null;
	PreparedStatement pstm=null;
	ResultSet rs=null;
	try {
		
		//Conexion y acceder a los datos
		cn=MySqlConexion.getConectar();
		String sql="select *from tb_solicitante";
		pstm=cn.prepareStatement(sql);
		rs=pstm.executeQuery();
		while(rs.next()) {
			//Crear un objeto de Solicitante
			bean=new Solicitante();
			bean.setCodSoli(rs.getInt(1));
			bean.setNomSoli(rs.getString(2));
			bean.setApeSoli(rs.getString(3));
			bean.setDniSoli(rs.getInt(4));
			bean.setDistrito(rs.getString(5));
			bean.setDireccSoli(rs.getString(6));
			bean.setCeluSoli(rs.getInt(7));
			bean.setSexo(rs.getString(8));
			bean.setTipoContrato(rs.getString(9));
		
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

	
