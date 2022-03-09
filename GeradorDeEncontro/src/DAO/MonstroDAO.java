package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import DTO.MonstroDTO;
import br.com.geradorDeEncontro.model.Encontro;

public class MonstroDAO {

	Connection conn;
	PreparedStatement pstm;
	ResultSet rs;
	ArrayList<MonstroDTO> lista = new ArrayList<>();

	public void cadastrarMonstro(MonstroDTO objMonstroDto) {
		String sql = "insert into monstro (nome, tamanho, tipo, classeDeArmadura, dadoDeVida, quantidadeDadosVida, vidaExtra, "
				+ "forca, destreza, constituicao, inteligencia, sabedoria, carisma, testeResistencia, pericias, vulnerabilidade, "
				+ "resistencia, imunidade, imunidadeCondicao, sentidos, lingua, dificuldade, acoes, magias, acoesLendarias) values "
				+ "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";
		conn = new ConexaoDAO().conectaDB();
		
		try {
			objMonstroDto.acertaDificuldade();
			pstm = conn.prepareStatement(sql);
			pstm.setString(1, objMonstroDto.getNome());
			pstm.setString(2, objMonstroDto.getTamanho());
			pstm.setString(3, objMonstroDto.getTipo());
			pstm.setInt(4, objMonstroDto.getClasseDeArmadura());
			pstm.setString(5, objMonstroDto.getDadoDeVida());
			pstm.setInt(6, objMonstroDto.getQtdDadosVida());
			pstm.setInt(7, objMonstroDto.getVidaExtra());
			pstm.setInt(8, objMonstroDto.getForca());
			pstm.setInt(9, objMonstroDto.getDestreza());
			pstm.setInt(10, objMonstroDto.getConstituicao());
			pstm.setInt(11, objMonstroDto.getInteligencia());
			pstm.setInt(12, objMonstroDto.getSabedoria());
			pstm.setInt(13, objMonstroDto.getCarisma());
			pstm.setString(14, objMonstroDto.getTesteResistencia());
			pstm.setString(15, objMonstroDto.getPericias());
			pstm.setString(16, objMonstroDto.getVulnerabilidades());
			pstm.setString(17, objMonstroDto.getResistencia());
			pstm.setString(18, objMonstroDto.getImunidade());
			pstm.setString(19, objMonstroDto.getImunidadeCondicao());
			pstm.setString(20, objMonstroDto.getSentidos());
			pstm.setString(21, objMonstroDto.getLingua());
			pstm.setFloat(22, objMonstroDto.getDificuldade());
			pstm.setString(23, objMonstroDto.getAcoes());
			pstm.setString(24, objMonstroDto.getMagias());
			pstm.setString(25, objMonstroDto.getAcoesLendarias());
			

			pstm.execute();
			JOptionPane.showMessageDialog(null, "Monstro cadastrado com sucesso");
			pstm.close();
			
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "MonstroDAO cadastrar: " + erro);
		} 
		
	}
	
	public ArrayList<MonstroDTO> consultarMonstro(int dificuldade){
		String sql = "select * from vw_ConsultaMonstro where dificuldade < " + dificuldade + ";";
		conn = new ConexaoDAO().conectaDB();

		try {
			pstm = conn.prepareStatement(sql);
			rs = pstm.executeQuery();
			
			while (rs.next()) {
				MonstroDTO objMonstroDto = new MonstroDTO();
				objMonstroDto.setId(rs.getInt("Id"));
				objMonstroDto.setNome(rs.getString("nome"));
				objMonstroDto.setQtdDadosVida(rs.getInt("quantidadeDadosVida"));
				objMonstroDto.setVidaExtra(rs.getInt("vidaExtra"));
				objMonstroDto.setDadoDeVida(rs.getString("dadoDeVida"));
				objMonstroDto.setDificuldade(rs.getFloat("dificuldade"));
				
				lista.add(objMonstroDto);
				
			}
		} catch (SQLException erro) {
			JOptionPane.showMessageDialog(null, "MonstroDAO consultar: " + erro);
		}
		return lista;

	}
	

	
}
