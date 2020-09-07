package model.entities;

import java.io.Serializable;

public class Fornecedores implements Serializable {

	private static final long serialVersionUID = 1L;
	private int Id;
	private String Nome;
	private int RG;
	private String CPF;
	private String CNPJ;
	private String Cidade;
	private String Estado;
	private String Rua;
	private int Numero;
	private String Complemento;
	private int CEP;

	private Consumidores consumidores;

	public Fornecedores() {
	}

	public Fornecedores(int id, String nome, int rG, String cPF, String cNPJ, String cidade, String estado, String rua,
			int numero, String complemento, int cEP, Consumidores consumidores) {
		super();
		Id = id;
		Nome = nome;
		RG = rG;
		CPF = cPF;
		CNPJ = cNPJ;
		Cidade = cidade;
		Estado = estado;
		Rua = rua;
		Numero = numero;
		Complemento = complemento;
		CEP = cEP;
		this.consumidores = consumidores;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public int getRG() {
		return RG;
	}

	public void setRG(int rG) {
		RG = rG;
	}

	public String getCPF() {
		return CPF;
	}

	public void setCPF(String cPF) {
		CPF = cPF;
	}

	public String getCNPJ() {
		return CNPJ;
	}

	public void setCNPJ(String cNPJ) {
		CNPJ = cNPJ;
	}

	public String getCidade() {
		return Cidade;
	}

	public void setCidade(String cidade) {
		Cidade = cidade;
	}

	public String getEstado() {
		return Estado;
	}

	public void setEstado(String estado) {
		Estado = estado;
	}

	public String getRua() {
		return Rua;
	}

	public void setRua(String rua) {
		Rua = rua;
	}

	public int getNumero() {
		return Numero;
	}

	public void setNumero(int numero) {
		Numero = numero;
	}

	public String getComplemento() {
		return Complemento;
	}

	public void setComplemento(String complemento) {
		Complemento = complemento;
	}

	public int getCEP() {
		return CEP;
	}

	public void setCEP(int cEP) {
		CEP = cEP;
	}

	public Consumidores getConsumidores() {
		return consumidores;
	}

	public void setConsumidores(Consumidores consumidores) {
		this.consumidores = consumidores;
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
		Fornecedores other = (Fornecedores) obj;
		if (Id != other.Id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Fornecedores [Id=" + Id + ", Nome=" + Nome + ", RG=" + RG + ", CPF=" + CPF + ", CNPJ=" + CNPJ
				+ ", Cidade=" + Cidade + ", Estado=" + Estado + ", Rua=" + Rua + ", Numero=" + Numero + ", Complemento="
				+ Complemento + ", CEP=" + CEP + ", consumidores=" + consumidores + "]";
	}

}