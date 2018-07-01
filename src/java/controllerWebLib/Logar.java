
package controllerWebLib;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet; 
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse; 
import modelWebLib.Entidades.Usuario;

public class Logar extends javax.servlet.http.HttpServlet{

     protected void doPost(HttpServletRequest request, HttpServletResponse
         response) throws ServletException, IOException {

         Connection conexao = null;

         PreparedStatement stmt = null;

         ResultSet res = null;

         try{

              String login = request.getParameter("login");
              String senha = request.getParameter("senha");
              Class.forName("org.postgresql.Driver");

              conexao = DriverManager.getConnection("\"jdbc:postgresql://localhost:5432/newweblib", "postgres", "1101");
              stmt = conexao.prepareStatement("SELECT * FROM usuarios WHERE login=?");
              stmt.setString(1, login);
              res = stmt.executeQuery();

              Usuario usuario = null;

              if(res.first()){

                   usuario = new Usuario();

                  usuario.setId_usuario(res.getInt("id"));

                   usuario.setNome(res.getString("nome"));

                   usuario.setLogin(res.getString("login"));

                   usuario.setSenha(res.getString("senha"));

              }

              if(usuario==null||!usuario.getSenha().equals(senha)){

                   request.getSession().setAttribute("msg", "Login ou senha incorretos!");

                   response.sendRedirect("login.xhtml");

              }else{

                   request.getSession().setAttribute("usuario", usuario);

                   response.sendRedirect("PaginaInicial.xhtml");

              }

         }catch(Exception e){

              throw new ServletException(e);

         }finally{

              try{

                   res.close();

                   stmt.close();

                   conexao.close();

              }catch(Exception e){

                   e.printStackTrace();

              }

         }

     }            

}

