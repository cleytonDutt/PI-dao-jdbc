package model.entities;

import java.io.Serializable;

public class Servicos implements Serializable {

	private static final long serialVersionUID = 1L;
	private int Id;
	private String Descricao;
	private String Fotos;
	private Double Valor;
	private int ForPGTO;
	private String AgDisp;

	private Consumidores consumidores;
	private Fornecedores fornecedores;

	public Servicos() {

	}

	public Servicos(int id, String descricao, String fotos, Double valor, int forPGTO, String agDisp,
			Consumidores consumidores, Fornecedores fornecedores) {
		super();
		Id = id;
		Descricao = descricao;
		Fotos = fotos;
		Valor = valor;
		ForPGTO = forPGTO;
		AgDisp = agDisp;
		this.consumidores = consumidores;
		this.fornecedores = fornecedores;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}

	public String getFotos() {
		return Fotos;
	}

	public void setFotos(String fotos) {
		Fotos = fotos;
	}

	public Double getValor() {
		return Valor;
	}

	public void setValor(Double valor) {
		Valor = valor;
	}

	public int getForPGTO() {
		return ForPGTO;
	}

	public void setForPGTO(int forPGTO) {
		ForPGTO = forPGTO;
	}

	public String getAgDisp() {
		return AgDisp;
	}

	public void setAgDisp(String agDisp) {
		AgDisp = agDisp;
	}

	public Consumidores getConsumidores() {
		return consumidores;
	}

	public void setConsumidores(Consumidores consumidores) {
		this.consumidores = consumidores;
	}

	public Fornecedores getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(Fornecedores fornecedores) {
		this.fornecedores = fornecedores;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Servicos other = (Servicos) obj;
		if (Id != other.Id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Servicos [Id=" + Id + ", Descricao=" + Descricao + ", Fotos=" + Fotos + ", Valor=" + Valor
				+ ", ForPGTO=" + ForPGTO + ", AgDisp=" + AgDisp + ", consumidores=" + consumidores + ", fornecedores="
				+ fornecedores + "]";
	}

}
