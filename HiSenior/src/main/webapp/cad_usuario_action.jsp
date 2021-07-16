<%@page import="com.javatpoint.dao.IdosoDao, java.lang.*, java.util.*"%>
<jsp:useBean id="Idoso" class="com.javatpoint.bean.Idoso"></jsp:useBean>
<jsp:setProperty property="*" name="Idoso"/>



<%
//out.println(request.getParameter("Nome"));
//out.println(Idoso.getNome());
Idoso.setNome(request.getParameter("Nome"));
Idoso.setEstado(request.getParameter("Estado"));
Idoso.setCidade(request.getParameter("Cidade"));
Idoso.setLogradouro(request.getParameter("Logradouro"));
Idoso.setNumero(Integer.parseInt(request.getParameter("Numero")));
Idoso.setEmail(request.getParameter("Email"));
Idoso.setSenha(request.getParameter("Senha"));
Idoso.setTelefone(Integer.parseInt(request.getParameter("Telefone")));

int i=IdosoDao.save(Idoso);
if(i>0){
	 response.sendRedirect("ver_dados_usuario.jsp"); 
}else{
	 response.sendRedirect("erro_usuario.jsp");
}
%>