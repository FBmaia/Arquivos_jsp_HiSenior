package com.javatpoint.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.javatpoint.bean.Voluntario;

public class VoluntarioDao {
	
	public static Connection getConnection(){
	    Connection con=null;
	    try{
	        Class.forName("com.mysql.jdbc.Driver");
	        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hi_senior","root","");
	    }catch(Exception e){
	    	System.out.println("Erro Connection SQL");
	    	System.out.println(e);
	    }
	    return con;
	}
	
	/* CRUD - Create */
	public static int save(Voluntario Voluntario){
		int status=0;
		try{
			Connection con=getConnection();
			PreparedStatement ps=con.prepareStatement(
			"INSERT INTO Voluntario(Nome,Data_de_nascimento,CPF,Estado,Cidade,CEP,Bairro,Logradouro,Numero,PCD,Email,Senha,Data_criacao_perfil,DDD,Telefone) VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,Voluntario.getNome());
			ps.setDate(2,new java.sql.Date(Voluntario.getData_de_nascimento().getTime()));
			ps.setString(3,Voluntario.getCPF());
			ps.setString(4,Voluntario.getEstado());
			ps.setString(5,Voluntario.getCidade());
			ps.setInt(6,Voluntario.getCEP());
			ps.setString(7,Voluntario.getBairro());
			ps.setString(8,Voluntario.getLogradouro());
			ps.setInt(9,Voluntario.getNumero());
			ps.setString(10,Voluntario.getPCD());
			ps.setString(11,Voluntario.getEmail());
			ps.setString(12,Voluntario.getSenha());
			ps.setDate(13,new java.sql.Date(Voluntario.getData_criacao_perfil().getTime()));
			ps.setInt(14,Voluntario.getDDD());
			ps.setInt(15,Voluntario.getTelefone());
			System.out.println(ps);
			status=ps.executeUpdate();
		}catch(Exception e){
			System.out.println("Erro Insert SQL");
			System.out.println(e);
		}
		return status;
	}
	
	/* CRUD - Update */
	public static int update(Voluntario Voluntario){
	    int status=0;
	    try{
	        Connection con=getConnection();
	        PreparedStatement ps=con.prepareStatement(  
	"UPDATE register SET Nome=?,Data_de_nascimento=?,CPF=?,Estado=?,Cidade=?,CEP=?,Bairro=?,Logradouro=?,Numero=?,PCD=?,Email=?,Senha=?,Data_criacao_perfil=?,DDD=?,Telefone=? WHERE ID_voluntario=?");
	        ps.setString(1,Voluntario.getNome());
			ps.setDate(2,new java.sql.Date(Voluntario.getData_de_nascimento().getTime()));
			ps.setString(3,Voluntario.getCPF());
			ps.setString(4,Voluntario.getEstado());
			ps.setString(5,Voluntario.getCidade());
			ps.setInt(6,Voluntario.getCEP());
			ps.setString(7,Voluntario.getBairro());
			ps.setString(8,Voluntario.getLogradouro());
			ps.setInt(9,Voluntario.getNumero());
			ps.setString(10,Voluntario.getPCD());
			ps.setString(11,Voluntario.getEmail());
			ps.setString(12,Voluntario.getSenha());
			ps.setDate(13,new java.sql.Date(Voluntario.getData_criacao_perfil().getTime()));
			ps.setInt(14,Voluntario.getDDD());
			ps.setInt(15,Voluntario.getTelefone());
	        status=ps.executeUpdate();
	    }catch(Exception e){
	    	System.out.println("Erro Update SQL");
	    	System.out.println(e);
	    }
	    return status;
	}
	
	/* CRUD - Delete */
	public static int delete(Voluntario Voluntario){
	    int status=0;
	    try{
	        Connection con=getConnection();
	        PreparedStatement ps=con.prepareStatement("DELETE FROM register WHERE ID_voluntario=?");
	        ps.setInt(1,Voluntario.getID_voluntario());
	        status=ps.executeUpdate();
	    }catch(Exception e){
	    	System.out.println("Erro Delete SQL");
	    	System.out.println(e);
	    }
	  
	    return status;
	}
	
	/* CRUD - Read */
	public static List<Voluntario> getAllRecords(){
	    List<Voluntario> list=new ArrayList<Voluntario>();
	      
	    try{
	        Connection con=getConnection();
	        PreparedStatement ps=con.prepareStatement("SELECT * FROM register");
	        ResultSet rs=ps.executeQuery();
	        while(rs.next()){
	            Voluntario Voluntario=new Voluntario();
	            Voluntario.setID_voluntario(rs.getInt("id"));
	            Voluntario.setNome(rs.getString("Nome"));
	            Voluntario.setData_de_nascimento(rs.getDate("Data_de_nascimento"));
	            Voluntario.setCPF(rs.getString("CPF"));
	            Voluntario.setEstado(rs.getString("Estado"));
	            Voluntario.setCidade(rs.getString("Cidade"));
	            Voluntario.setCEP(rs.getInt("CEP"));
	            Voluntario.setBairro(rs.getString("Bairro"));
	            Voluntario.setLogradouro(rs.getString("Logradouro"));
	            Voluntario.setNumero(rs.getInt("Numero"));
	            Voluntario.setPCD(rs.getString("PCD"));
	            Voluntario.setEmail(rs.getString("Email"));
	            Voluntario.setSenha(rs.getString("Senha"));
	            Voluntario.setData_criacao_perfil(rs.getDate("Data_criacao_perfil"));
	            Voluntario.setDDD(rs.getInt("DDD"));
	            Voluntario.setTelefone(rs.getInt("Telefone"));
	            list.add(Voluntario);
	        }
	    }catch(Exception e){
	    	System.out.println("Erro getAllRecords SQL");
	    	System.out.println(e);
	    }
	    return list;
	}
	
	/* CRUD - Read */
	public static Voluntario getRecordById(int id){
	    Voluntario Voluntario=null;
	    try{
	        Connection con=getConnection();
	        PreparedStatement ps=con.prepareStatement("SELECT * FROM register WHERE ID_voluntario=?");
	        ps.setInt(1,id);
	        ResultSet rs=ps.executeQuery();
	        while(rs.next()){
	        	 Voluntario =new Voluntario();
		            Voluntario.setID_voluntario(rs.getInt("id"));
		            Voluntario.setNome(rs.getString("Nome"));
		            Voluntario.setData_de_nascimento(rs.getDate("Data_de_nascimento"));
		            Voluntario.setCPF(rs.getString("CPF"));
		            Voluntario.setEstado(rs.getString("Estado"));
		            Voluntario.setCidade(rs.getString("Cidade"));
		            Voluntario.setCEP(rs.getInt("CEP"));
		            Voluntario.setBairro(rs.getString("Bairro"));
		            Voluntario.setLogradouro(rs.getString("Logradouro"));
		            Voluntario.setNumero(rs.getInt("Numero"));
		            Voluntario.setPCD(rs.getString("PCD"));
		            Voluntario.setEmail(rs.getString("Email"));
		            Voluntario.setSenha(rs.getString("Senha"));
		            Voluntario.setData_criacao_perfil(rs.getDate("Data_criacao_perfil"));
		            Voluntario.setDDD(rs.getInt("DDD"));
		            Voluntario.setTelefone(rs.getInt("Telefone"));
	        }
	    }catch(Exception e){
	    	System.out.println("Erro getRecordById SQL");
	    	System.out.println(e);
	    }
	    return Voluntario;
	}
}