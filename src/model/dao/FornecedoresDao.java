package model.dao;

import java.util.List;

import model.entities.Fornecedores;

public interface FornecedoresDao {
	void insert(Fornecedores obj);
	void update(Fornecedores obj);
	void deleteById(Integer id);
	Fornecedores findById(Integer id);
	List<Fornecedores> findAll();
	


}
