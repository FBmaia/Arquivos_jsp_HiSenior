package com.javatpoint.bean;
import java.util.*;

public class Idoso {
	
	private int ID_idoso;
	private String Nome;
	private Date Data_de_nascimento = new Date();
	private String CPF;
	private String Estado;
	private String Cidade;
	private int CEP;
	private String Bairro;
	private String Logradouro;
	private int Numero;
	private String PCD;
	private String Email;
	private String Senha;
	private Date Data_criacao_perfil = new Date();
	private int DDD;
	private int Telefone;
	public int getID_idoso() {
		return ID_idoso;
	}
	public void setID_idoso(int iD_idoso) {
		ID_idoso = iD_idoso;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public Date getData_de_nascimento() {
		return Data_de_nascimento;
	}
	public void setData_de_nascimento(Date data_de_nascimento) {
		Data_de_nascimento = data_de_nascimento;
	}
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getEstado() {
		System.out.println("get");
		System.out.println(Estado);
		return Estado;
	}
	public void setEstado(String estado) {
		Estado = estado;
		System.out.println("set");
		System.out.println(Estado);
	}
	public String getCidade() {
		return Cidade;
	}
	public void setCidade(String cidade) {
		Cidade = cidade;
	}
	public int getCEP() {
		return CEP;
	}
	public void setCEP(int cEP) {
		CEP = cEP;
	}
	public String getBairro() {
		return Bairro;
	}
	public void setBairro(String bairro) {
		Bairro = bairro;
	}
	public String getLogradouro() {
		return Logradouro;
	}
	public void setLogradouro(String logradouro) {
		Logradouro = logradouro;
	}
	public int getNumero() {
		return Numero;
	}
	public void setNumero(int numero) {
		Numero = numero;
	}
	public String getPCD() {
		return PCD;
	}
	public void setPCD(String pCD) {
		PCD = pCD;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getSenha() {
		return Senha;
	}
	public void setSenha(String senha) {
		Senha = senha;
	}
	public Date getData_criacao_perfil() {
		return Data_criacao_perfil;
	}
	public void setData_criacao_perfil(Date data_criacao_perfil) {
		Data_criacao_perfil = data_criacao_perfil;
	}
	public int getDDD() {
		return DDD;
	}
	public void setDDD(int dDD) {
		DDD = dDD;
	}
	public int getTelefone() {
		return Telefone;
	}
	public void setTelefone(int telefone) {
		Telefone = telefone;
	}
	
	
	
}

	





