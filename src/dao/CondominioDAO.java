package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import bean.Condominio;

public class CondominioDAO {
	private Connection connection;

	public CondominioDAO() {
		connection = new FabricaConexoes().getConnection();
	}

	public int inserir(Condominio c) {
		int inseriu = 0;
		String sql = "insert into Casa(nome, qtdcasas, cidade) values (?, ?, ?)";
		PreparedStatement stmt;
		try {
			stmt = (PreparedStatement) connection.prepareStatement(sql);
			stmt.setString(1, c.getNome());
			stmt.setInt(2, c.getQtdCasas());
			stmt.setString(3, c.getCidade());
			inseriu = stmt.executeUpdate();
			stmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return inseriu;
	}
}
