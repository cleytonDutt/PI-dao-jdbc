package application;

import model.entities.Consumidores;
import model.entities.Fornecedores;

public class Program {

	public static void main(String[] args) {

		Consumidores obj = new Consumidores(10, "joao", 102030, "22233366699", "Araucaria", "PR", "Alagoas", 993,
				"Casa A", 83701300, "7777888899994444");

		Fornecedores fornecedores = new Fornecedores(3, "Papelaria", 40405, "99944433366", "10203040506032", "Morretes",
				"PR", "Andorinhas", 35, "galpão 7", 84203888, obj);
		
		System.out.println(fornecedores);
	}

}
