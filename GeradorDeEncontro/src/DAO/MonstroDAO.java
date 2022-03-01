package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DTO.MonstroDTO;

public class MonstroDAO {

	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<MonstroDTO> lista = new ArrayList<>();
	
	public void cadastrarMonstro(MonstroDTO objMonstroDto) {
		String sql = "insert into monstro (id, nome) values (?,?)";
		conn = new ConexaoDAO().conectaDB();
		
		try {
			pstm = conn.prepareStatement(sql);
			pstm.setInt(1, objMonstroDto.getId());
			pstm.setString(2, objMonstroDto.getNome());
			
			pstm.execute();
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "MonstroDAO cadastrar: " + erro);
		}
		
	}
	
	public ArrayList<MonstroDTO> consultarMonstro(){
		String sql = "select * from monstro;";
		
		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			conn = new ConexaoDAO().conectaDB();
			
			while (rs.next()) {
				MonstroDTO objMonstroDto = new MonstroDTO();
				objMonstroDto.setId(rs.getInt("Id"));
				objMonstroDto.setNome(rs.getString("nome"));
				
				lista.add(objMonstroDto);
				
			}
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "FuncionarioDAO consultar: " + erro);
		}
		
	    
		return lista;

	}
	
}
