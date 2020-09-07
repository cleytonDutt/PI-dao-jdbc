package model.dao;

import java.util.List;

import model.entities.Consumidores;

public interface ConsumidoresDao {
	
	void insert(Consumidores obj);
	void update(Consumidores obj);
	void deleteById(Integer id);
	Consumidores findById(Integer id);
	List<Consumidores> findAll();
	

}
