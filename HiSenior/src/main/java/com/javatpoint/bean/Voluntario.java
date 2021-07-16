package com.javatpoint.bean;
import java.util.*;

public class Voluntario {
	
	private int ID_voluntario;
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
	public int getID_voluntario() {
		return ID_voluntario;
	}
	public void setID_voluntario(int iD_voluntario) {
		ID_voluntario = iD_voluntario;
	}
	
	public String getNome() {
		return Nome;
	}
	
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	
	public Date getData_de_nascimento() {
		return Data_de_nascimento;
	}
	
	public void setData_de_nascimento(Date Data_de_nascimento) {
		this.Data_de_nascimento = Data_de_nascimento;
	}
	
	public String getCPF() {
		return CPF;
	}
	
	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
	
	public String getEstado() {
		return Estado;
	}
	
	public void setEstado(String Estado) {
		this.Estado = Estado;
	}
	
	public String getCidade() {
		return Cidade;
	}
	
	public void setCidade(String Cidade) {
		this.Cidade = Cidade;
	}
	
	public int getCEP() {
		return CEP;
	}
	
	public void setCEP(int CEP) {
		this.CEP = CEP;
	}
	
	public String getBairro() {
		return Bairro;
	}
	
	public void setBairro(String Bairro) {
		this.Bairro = Bairro;
	}
	
	public String getLogradouro() {
		return Logradouro;
	}
	
	public void setLogradouro(String Logradouro) {
		this.Logradouro = Logradouro;
	}
	
	public int getNumero() {
		return Numero;
	}
	
	public void setNumero(int Numero) {
		this.Numero = Numero;
	}
	
	public String getPCD() {
		return PCD;
	}
	
	public void setPCD(String PCD) {
		this.PCD = PCD;
	}
	
	public String getEmail() {
		return Email;
	}
	
	public void setEmail(String Email) {
		this.Email = Email;
	}
	
	public String getSenha() {
		return Senha;
	}
	
	public void setSenha(String Senha) {
		this.Senha = Senha;
	}
	
	public Date getData_criacao_perfil() {
		return Data_criacao_perfil;
	}
	
	public void setData_criacao_perfil(Date Data_criacao_perfil) {
		this.Data_criacao_perfil = Data_criacao_perfil;
	}
	
	public int getDDD() {
		return DDD;
	}
	
	public void setDDD(int DDD) {
		this.DDD = DDD;
	}
	
	public int getTelefone() {
		return Telefone;
	}
	
	public void setTelefone(int Telefone) {
		this.Telefone = Telefone;
	}	

}
