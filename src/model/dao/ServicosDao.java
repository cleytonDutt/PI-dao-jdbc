package model.dao;

import java.util.List;

import model.entities.Servicos;

public interface ServicosDao {
	
	void insert(Servicos obj);
	void update(Servicos obj);
	void deleteById(Integer id);
	Servicos findById(Integer id);
	List<Servicos> findAll();
	


}
