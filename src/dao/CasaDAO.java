package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.Casa;

public class CasaDAO {
	private Connection connection;

	public CasaDAO() {
		connection = new FabricaConexoes().getConnection();
	}

	public int inserir(Casa c) {
		int inseriu = 0;
		String sql = "insert into Casa(numero, nomeprop, numerocond) values (?, ?, ?)";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setInt(1, c.getNumero());
			stmt.setString(2, c.getNomeprop());
			stmt.setInt(3, c.getNumerocond());
			inseriu = stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return inseriu;
	}
}
