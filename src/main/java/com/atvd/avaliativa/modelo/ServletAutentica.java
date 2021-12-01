package com.atvd.avaliativa.modelo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ServletAutentica")
public class ServletAutentica extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static final String USUARIO = "usuario";
       
    public ServletAutentica() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter saida = response.getWriter();
		
		saida.write("<html><body>");
		
		String usuario = request.getParameter(USUARIO);
		String senha = request.getParameter("senha");
		
		if (autentica(usuario,senha)) {
			HttpSession sessao = request.getSession(); //criando a sessao
			sessao.setAttribute(USUARIO, usuario); //registrando o usuario com o nome do usuario na sessao.
			
			response.sendRedirect(request.getContextPath()+"/menu.jsp"); //redirecionando para o menu.
		}else {
			saida.write("Informações incorretas. <br>");
			saida.write("<a href=\"autentica.jsp\">Retornar à tela anterior.</a>");
		}
		
		
	}
	private boolean autentica(String usuario, String senha) {
		if (usuario.equals("professor") && senha.equals("Progweb2021")) {
			return true;
		}
		//Se o user for "professor" e a senha for "Progweb2021", 
		//sera criada uma sessao e redirecionara para a pagina inicial
		
		return false;
	}

}
