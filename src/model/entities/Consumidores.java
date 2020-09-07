package model.entities;

import java.io.Serializable;

public class Consumidores implements Serializable {

	private static final long serialVersionUID = 1L;
	private int Id;
	private String Nome;
	private int RG;
	private String CPF;
	private String Cidade;
	private String Estado;
	private String Rua;
	private int Numero;
	private String Complemento;
	private int CEP;
	private String Cardcred;
	
	private Fornecedores fornecedores;

	public Consumidores() {
	}

	public Consumidores(int id, String nome, int rG, String cPF, String cidade, String estado, String rua, int numero,
			String complemento, int cEP, String cardcred) {
		super();
		Id = id;
		Nome = nome;
		RG = rG;
		CPF = cPF;
		Cidade = cidade;
		Estado = estado;
		Rua = rua;
		Numero = numero;
		Complemento = complemento;
		CEP = cEP;
		Cardcred = cardcred;
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

	public String getCardcred() {
		return Cardcred;
	}

	public void setCardcred(String cardcred) {
		Cardcred = cardcred;
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
		Consumidores other = (Consumidores) obj;
		if (Id != other.Id)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Consumidores [Id=" + Id + ", Nome=" + Nome + ", RG=" + RG + ", CPF=" + CPF + ", Cidade=" + Cidade
				+ ", Estado=" + Estado + ", Rua=" + Rua + ", Numero=" + Numero + ", Complemento=" + Complemento
				+ ", CEP=" + CEP + ", Cardcred=" + Cardcred + "]";
	}

	
	
}