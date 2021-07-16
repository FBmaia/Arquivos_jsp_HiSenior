package com.javatpoint.bean;

import java.util.*;

public class Entrega 
{
	private int ID_entrega;
	private int ID_idoso;
	private int ID_voluntario;
	private String Status;
	private String Descricao_pedido;
	private Date Data_pedido = new Date();
	private Date Data_entrega = new Date();
	
	/*ID_entrega*/
	public int getID_entrega()
	{
		return ID_entrega;
	}
	
	public void setID_entrega(int ID_entrega)
	{
		this.ID_entrega = ID_entrega;
	}
	/*ID_idoso*/
	public int getID_idoso()
	{
		return ID_idoso;
	}
	
	public void setID_idoso(int ID_idoso)
	{
		this.ID_idoso = ID_idoso;
	}
	
	/*ID_voluntario*/
	public int getID_voluntario()
	{
		return ID_voluntario;
	}
	
	public void setID_voluntario(int ID_voluntario)
	{
		this.ID_voluntario = ID_voluntario;
	}
	
	/*Status*/
	public String getStatus()
	{
		return Status;
	}
	
	public void setStatus(String Status)
	{
		this.Status = Status;
	}
	/*Data_pedido*/
	public Date getData_pedido()
	{
		return Data_pedido;
	}
	
	public void setData_pedido(Date Data_pedido)
	{
		this.Data_pedido = Data_pedido;
	}
	/*Data_entrega*/
	public Date getData_entrega()
	{
		return Data_entrega;
	}
	public void setData_entrega(Date Data_entrega)
	{
		this.Data_entrega = Data_entrega;
	}
	/*Descricao_pedido*/
	public String getDescricao_pedido()
	{
		return Descricao_pedido;
	}
	public void setDescricao_pedido(String Descricao_pedido)
	{
		this.Descricao_pedido = Descricao_pedido;
	}
}