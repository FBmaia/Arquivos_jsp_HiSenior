<%@page import="com.javatpoint.dao.VoluntarioDao, java.lang.*, java.util.*"%>
<jsp:useBean id="Voluntario" class="com.javatpoint.bean.Voluntario"></jsp:useBean>
<jsp:setProperty property="*" name="Voluntario"/>



<%
Voluntario.setNome(request.getParameter("Nome"));
Voluntario.setEstado(request.getParameter("Estado"));
Voluntario.setCidade(request.getParameter("Cidade"));
Voluntario.setLogradouro(request.getParameter("Logradouro"));
Voluntario.setNumero(Integer.parseInt(request.getParameter("Numero")));
Voluntario.setEmail(request.getParameter("Email"));
Voluntario.setSenha(request.getParameter("Senha"));
Voluntario.setTelefone(Integer.parseInt(request.getParameter("Telefone")));

int i=VoluntarioDao.save(Voluntario);
if(i>0){
	 response.sendRedirect("ver_dados_voluntario.jsp"); 
}else{
	 response.sendRedirect("erro_voluntario.jsp");
}
%>