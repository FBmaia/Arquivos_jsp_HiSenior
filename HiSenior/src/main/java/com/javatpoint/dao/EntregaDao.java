	package com.javatpoint.dao;
	import java.sql.*;
	import java.util.ArrayList;
	import java.util.List;

import com.javatpoint.bean.Entrega;
	

public class EntregaDao 
{
		
		public static Connection getConnection()
		{
		    Connection con=null;
		    try
		    {
		        Class.forName("com.mysql.jdbc.Driver");
		        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hi_Senior","root","");
		    }
		    catch(Exception e)
		    {
		    	System.out.println("Erro Connection SQL");
		    	System.out.println(e);
		    }
		    return con;
}
		
		/* CRUD - Create */
		public static int save(Entrega Entrega){
			int status=0;
			try
			{
				Connection con=getConnection();
				PreparedStatement ps=con.prepareStatement(
				"INSERT INTO entrega(ID_entrega,ID_idoso,ID_voluntario,Status,Descricao_pedido,Data_pedido,Data_entrega) VALUES(?,?,?,?,?,?)");
				ps.setInt(1,Entrega.getID_idoso());
				ps.setInt(2,Entrega.getID_voluntario());
				ps.setString(3,Entrega.getStatus());
				ps.setString(4,Entrega.getDescricao_pedido());
				ps.setDate(5,new java.sql.Date(Entrega.getData_pedido().getTime()));
				ps.setDate(6,new java.sql.Date(Entrega.getData_entrega().getTime()));
				status=ps.executeUpdate();
			}
			catch(Exception e)
			{
				System.out.println("Erro Insert SQL");
				System.out.println(e);
			}
			return status;
		}
		
		/* CRUD - Update */
		public static int update(Entrega Entrega){
		    int status=0;
		    try{
		        Connection con=getConnection();
		        PreparedStatement ps=con.prepareStatement(  
		"UPDATE entrega SET ID_idoso=?,ID_voluntario=?,Status=?,Descricao_pedido=?,Data_pedido=?,Data_entrega=? WHERE ID_entrega=?");
				ps.setInt(1,Entrega.getID_idoso());
				ps.setInt(2,Entrega.getID_voluntario());
				ps.setString(3,Entrega.getStatus());
				ps.setString(4,Entrega.getDescricao_pedido());
				ps.setDate(5,new java.sql.Date(Entrega.getData_pedido().getTime()));
				ps.setDate(6,new java.sql.Date(Entrega.getData_entrega().getTime()));
				ps.setInt(7,Entrega.getID_entrega());
		        status=ps.executeUpdate();
		    }catch(Exception e){
		    	System.out.println("Erro Update SQL");
		    	System.out.println(e);
		    }
		    return status;
		}
		
		/* CRUD - Delete */
		public static int delete(Entrega Entrega){
		    int status=0;
		    try{
		        Connection con=getConnection();
		        PreparedStatement ps=con.prepareStatement("DELETE FROM entrega WHERE id=?");
		        ps.setInt(1,Entrega.getID_entrega());
		        status=ps.executeUpdate();
		    }catch(Exception e){
		    	System.out.println("Erro Delete SQL");
		    	System.out.println(e);
		    }
		  
		    return status;
		}
		
		/* CRUD - Read */
		public static List<Entrega> getAllRecords(){
		    List<Entrega> list=new ArrayList<Entrega>();
		      
		    try{
		        Connection con=getConnection();
		        PreparedStatement ps=con.prepareStatement("SELECT * FROM entrega");
		        ResultSet rs=ps.executeQuery();
		        while(rs.next()){
		            Entrega Entrega=new Entrega();
		            Entrega.setID_entrega(rs.getInt("ID_entrega"));
		            Entrega.setID_idoso(rs.getInt("ID_idoso"));
		            Entrega.setID_voluntario(rs.getInt("ID_voluntario"));
		            Entrega.setStatus(rs.getString("Status"));
		            Entrega.setDescricao_pedido(rs.getString("Descricao_pedido"));
		            Entrega.setData_pedido(rs.getDate("Data_pedido"));
		            Entrega.setData_entrega(rs.getDate("Data_entrega"));
		            list.add(Entrega);
		        }
		    }catch(Exception e){
		    	System.out.println("Erro getAllRecords SQL");
		    	System.out.println(e);
		    }
		    return list;
		}
		
		/* CRUD - Read */
		public static Entrega getRecordById(int ID_entrega){
		    Entrega Entrega=null;
		    try{
		        Connection con=getConnection();
		        PreparedStatement ps=con.prepareStatement("SELECT * FROM entrega WHERE id=?");
		        ps.setInt(1,ID_entrega);
		        ResultSet rs=ps.executeQuery();
		        while(rs.next()){
		        		Entrega= new Entrega();
		        	 	Entrega.setID_entrega(rs.getInt("ID_entrega"));
			            Entrega.setID_idoso(rs.getInt("ID_idoso"));
			            Entrega.setID_voluntario(rs.getInt("ID_voluntario"));
			            Entrega.setStatus(rs.getString("Status"));
			            Entrega.setDescricao_pedido(rs.getString("Descricao_pedido"));
			            Entrega.setData_pedido(rs.getDate("Data_pedido"));
			            Entrega.setData_entrega(rs.getDate("Data_entrega"));		        }
		    }catch(Exception e){
		    	System.out.println("Erro getRecordById SQL");
		    	System.out.println(e);
		    }
		    return Entrega;
		}
		
		/* CRUD - Read */
		public static List<Entrega> getRecordsBySQL(String sql){
		    List<Entrega> list=new ArrayList<Entrega>();
		    
		    try{
		        Connection con=getConnection();
		        PreparedStatement ps=con.prepareStatement(sql);
		        ResultSet rs=ps.executeQuery();
		        while(rs.next()){
		            Entrega Entrega=new Entrega();
		            Entrega.setID_entrega(rs.getInt("ID_entrega"));
		            Entrega.setID_idoso(rs.getInt("ID_idoso"));
		            Entrega.setID_voluntario(rs.getInt("ID_voluntario"));
		            Entrega.setStatus(rs.getString("Status"));
		            Entrega.setDescricao_pedido(rs.getString("Descricao_pedido"));
		            Entrega.setData_pedido(rs.getDate("Data_pedido"));
		            Entrega.setData_entrega(rs.getDate("Data_entrega"));
		            list.add(Entrega);
		        }
		    }catch(Exception e){
		    	System.out.println("Erro getAllRecords SQL");
		    	System.out.println(e);
		    }
		    return list;
		}
	}
