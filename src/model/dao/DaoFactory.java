package model.dao;

import db.DB;
import model.dao.impl.ConsumidoresDaoJDBC;

public class DaoFactory {

	public static ConsumidoresDao createConsumidoresDao() {
		return new ConsumidoresDaoJDBC(DB.getConnection());
	}
}
