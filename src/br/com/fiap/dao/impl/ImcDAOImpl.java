package br.com.fiap.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import br.com.fiap.conexao.ConexaoBDManager;
import br.com.fiap.dao.ImcDAO;
import br.com.fiap.model.Imc;

public class ImcDAOImpl implements ImcDAO {
	
	private Connection conexao;

	@Override
	public List<Imc> listarTodos() {
		List<Imc> lista = new ArrayList<Imc>();
		PreparedStatement stmt = null;
		ResultSet rs = null;

		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "SELECT * FROM T_HTL_IMC";
			stmt = conexao.prepareStatement(sql);
			rs = stmt.executeQuery();

			while (rs.next()) {
				Integer idImc = rs.getInt("ID_IMC");
				Double valor = rs.getDouble("VL_IMC");
				java.sql.Date dtCad = rs.getDate("DT_CADASTRO");
				Calendar dtCadastro = Calendar.getInstance();
				dtCadastro.setTimeInMillis(dtCad.getTime());
				Double peso = rs.getDouble("NR_PESO");
				Double altura = rs.getDouble("NR_ALTURA");
				Integer idUsuario = rs.getInt("T_HTL_USUARIO_ID_USUARIO");

				Imc imc = new Imc(idImc, valor, dtCadastro, peso, altura, idUsuario);

				lista.add(imc);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (NullPointerException e) {
			e.printStackTrace();
		}
		finally {
			try {
				stmt.close();
				rs.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return lista;
	}

	@Override
	public void cadastrar(Imc imc) {
		PreparedStatement stmt = null;

		try {
			conexao = ConexaoBDManager.obterConexao();
			String sql = "INSERT INTO T_HTL_IMC (ID_IMC, VL_IMC, DT_CADASTRO, NR_PESO,"
					+ " NR_ALTURA, T_HTL_USUARIO_ID_USUARIO) VALUES (SEQ_IMC.NEXTVAL, ?, ?, ?, ?, ?)";
			stmt = conexao.prepareStatement(sql);
			stmt.setDouble(1, imc.getValor());
			java.sql.Date dataAtual = new java.sql.Date(imc.getDtCadastro().getTimeInMillis());
			stmt.setDate(2, dataAtual);
			stmt.setDouble(3, imc.getPeso());
			stmt.setDouble(4, imc.getAltura());
			stmt.setInt(5, imc.getIdUsuario());
			stmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				conexao.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
	}

	@Override
	public void atualizar(Imc imc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void remover(int idImc) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Imc buscarPorId(int idImc) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
