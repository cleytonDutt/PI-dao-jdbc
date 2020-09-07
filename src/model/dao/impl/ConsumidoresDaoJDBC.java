package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import db.DB;
import db.DbException;
import model.dao.ConsumidoresDao;
import model.entities.Consumidores;
import model.entities.Fornecedores;

public class ConsumidoresDaoJDBC implements ConsumidoresDao {
private Connection conn;

public ConsumidoresDaoJDBC(Connection conn) {
	this.conn = conn;
	
}
	
	@Override
	public void insert(Consumidores obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Consumidores obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Consumidores findById(Integer id) {
		PreparedStatement st = null;
		ResultSet rs = null;
		try {
			st = conn.prepareStatement(
					"SELECT consumidores.*,fornecedores.Nome as Nome "
					 + "FROM consumidores INNER JOIN fornecedores "
					+ "ON consumidores.Id = fornecedores.Id " 
					+ "WHERE consumidores.Id = ?" );
			st.setInt(1, id);
			rs = st.executeQuery();
			if (rs.next()) {
				Fornecedores fs = new Fornecedores();
				fs.setId(rs.getInt("Id"));
				fs.setNome(rs.getString("Nome"));
				Consumidores obj = new Consumidores();
				obj.setId(rs.getInt("Id"));
				obj.setNome(rs.getString("nome"));
				obj.setRG(rs.getInt("RG"));
				obj.setCPF(rs.getString("CPF"));
				obj.setCidade(rs.getString("Cidade"));
				obj.setEstado(rs.getString("Estado"));
				obj.setRua(rs.getString("Rua"));
				obj.setNumero(rs.getInt("Numero"));
				obj.setComplemento(rs.getString("Complemento"));
				obj.setCEP(rs.getInt("CEP"));
				obj.setCardcred(rs.getString("CardCred"));
				return obj;
			}
			return null;
		}
		catch (SQLException e) {
			throw new DbException(e.getMessage());
		}
		finally {
			DB.closeStatement(st);
			DB.closeResultSet(rs);
		}
	}

	@Override
	public List<Consumidores> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
