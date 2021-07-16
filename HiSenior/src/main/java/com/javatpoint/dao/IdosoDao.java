package com.javatpoint.dao;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import com.javatpoint.bean.Idoso;

public class IdosoDao {
	
	public static Connection getConnection() {
		Connection con=null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hi_senior","root","");
		}catch(Exception e){
			System.out.println("Erro Connection SQL");
			System.out.println(e);
		}
		return con;
	}
	
	/* CRUD - Create */
	public static int save(Idoso Idoso){
		int status=0;
		try{
			Connection con=getConnection();
			
			PreparedStatement ps=con.prepareStatement(
			"insert into Idoso(Nome,Data_de_nascimento,CPF,Estado,Cidade,CEP,Bairro,Logradouro,Numero,PCD,Email,Senha,Data_criacao_perfil,DDD,Telefone) values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)");
			ps.setString(1,Idoso.getNome());
			ps.setDate(2,new java.sql.Date(Idoso.getData_de_nascimento().getTime()));
			ps.setString(3,Idoso.getCPF());
			ps.setString(4,Idoso.getEstado());
			ps.setString(5,Idoso.getCidade());
			ps.setInt(6,Idoso.getCEP());
			ps.setString(7,Idoso.getBairro());
			ps.setString(8,Idoso.getLogradouro());
			ps.setInt(9,Idoso.getNumero());
			ps.setString(10,Idoso.getPCD());
			ps.setString(11,Idoso.getEmail());
			ps.setString(12,Idoso.getSenha());
			ps.setDate(13,new java.sql.Date(Idoso.getData_criacao_perfil().getTime()));
			ps.setInt(14,Idoso.getDDD());
			ps.setInt(15,Idoso.getTelefone());
			System.out.println(ps);
			status=ps.executeUpdate();
		}catch(Exception e){
			System.out.println("Erro Insert SQL");
			System.out.println(e);
		}
		return status;
	}
	
	/* CRUD - Update */
	public static int update(Idoso Idoso){
	    int status=0;
	    try{
	        Connection con=getConnection();
	        PreparedStatement ps=con.prepareStatement(  
	"UPDATE Idoso SET Nome=?,Data_de_nascimento=?,CPF=?,Estado=?,Cidade=?,CEP=?,Bairro=?,Logradouro=?,Numero=?,PCD=?,Email=?,Senha=?,Data_criacao_perfil=?,DDD=?,Telefone=? WHERE ID_idoso=?");
			ps.setString(1,Idoso.getNome());
			ps.setDate(2,new java.sql.Date(Idoso.getData_de_nascimento().getTime()));
			ps.setString(3,Idoso.getCPF());
			ps.setString(4,Idoso.getEstado());
			ps.setString(5,Idoso.getCidade());
			ps.setInt(6,Idoso.getCEP());
			ps.setString(7,Idoso.getBairro());
			ps.setString(8,Idoso.getLogradouro());
			ps.setInt(9,Idoso.getNumero());
			ps.setString(10,Idoso.getPCD());
			ps.setString(11,Idoso.getEmail());
			ps.setString(12,Idoso.getSenha());
			ps.setDate(13,new java.sql.Date(Idoso.getData_criacao_perfil().getTime()));
			ps.setInt(14,Idoso.getDDD());
			ps.setInt(15,Idoso.getTelefone());
			ps.setInt(16,Idoso.getID_idoso());
	        status=ps.executeUpdate();
	    }catch(Exception e){
	    	System.out.println("Erro Update SQL");
	    	System.out.println(e);
	    }
	    return status;
	}
	
	/* CRUD - Delete */
	public static int delete(Idoso Idoso){
	    int status=0;
	    try{
	        Connection con=getConnection();
	        PreparedStatement ps=con.prepareStatement("DELETE FROM register WHERE ID_idoso=?");
	        ps.setInt(1,Idoso.getID_idoso());
	        status=ps.executeUpdate();
	    }catch(Exception e){
	    	System.out.println("Erro Delete SQL");
	    	System.out.println(e);
	    }
	  
	    return status;
	}
	
	/* CRUD - Read */
	public static List<Idoso> getAllRecords(){
	    List<Idoso> list=new ArrayList<Idoso>();
	      
	    try{
	        Connection con=getConnection();
	        PreparedStatement ps=con.prepareStatement("SELECT * FROM Idoso");
	        ResultSet rs=ps.executeQuery();
	        while(rs.next()){
	            Idoso Idoso=new Idoso();
	            Idoso.setID_idoso(rs.getInt("ID_idoso"));
	            Idoso.setNome(rs.getString("Nome"));
	            Idoso.setData_de_nascimento(rs.getDate("Data_de_nascimento"));
	            Idoso.setCPF(rs.getString("CPF"));
	            Idoso.setEstado(rs.getString("Estado"));
	            Idoso.setCidade(rs.getString("Cidade"));
	            Idoso.setCEP(rs.getInt("CEP"));
	            Idoso.setBairro(rs.getString("Bairro"));
	            Idoso.setLogradouro(rs.getString("Logradouro"));
	            Idoso.setNumero(rs.getInt("Numero"));
	            Idoso.setPCD(rs.getString("PCD"));
	            Idoso.setEmail(rs.getString("Email"));
	            Idoso.setSenha(rs.getString("Senha"));
	            Idoso.setData_criacao_perfil(rs.getDate("Data_criacao_perfil"));
	            Idoso.setDDD(rs.getInt("DDD"));
	            Idoso.setTelefone(rs.getInt("Telefone"));
	            list.add(Idoso);
	        }
	    }catch(Exception e){
	    	System.out.println("Erro getAllRecords SQL");
	    	System.out.println(e);
	    }
	    return list;
	}
	
	/* CRUD - Read */
	public static Idoso getRecordById(int ID_idoso){
	    Idoso Idoso=null;
	    try{
	        Connection con=getConnection();
	        PreparedStatement ps=con.prepareStatement("SELECT * FROM Idoso WHERE ID_idoso=?");
	        ps.setInt(1,ID_idoso);
	        ResultSet rs=ps.executeQuery();
	        while(rs.next()){
	        	Idoso=new Idoso();
	            Idoso.setID_idoso(rs.getInt("ID_idoso"));
	            Idoso.setNome(rs.getString("Nome"));
	            Idoso.setData_de_nascimento(rs.getDate("Data_de_nascimento"));
	            Idoso.setCPF(rs.getString("CPF"));
	            Idoso.setEstado(rs.getString("Estado"));
	            Idoso.setCidade(rs.getString("Cidade"));
	            Idoso.setCEP(rs.getInt("CEP"));
	            Idoso.setBairro(rs.getString("Bairro"));
	            Idoso.setLogradouro(rs.getString("Logradouro"));
	            Idoso.setNumero(rs.getInt("Numero"));
	            Idoso.setPCD(rs.getString("PCD"));
	            Idoso.setEmail(rs.getString("Email"));
	            Idoso.setSenha(rs.getString("Senha"));
	            Idoso.setData_criacao_perfil(rs.getDate("Data_criacao_perfil"));
	            Idoso.setDDD(rs.getInt("DDD"));
	            Idoso.setTelefone(rs.getInt("Telefone"));
	        }
	    }catch(Exception e){
	    	System.out.println("Erro getRecordById SQL");
	    	System.out.println(e);
	    }
	    return Idoso;
	}

	
}
