package controllerWebLib;

import java.io.IOException;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import modelWebLib.UsuarioModel;


@ManagedBean
@RequestScoped
public class LoginController {
    private UsuarioModel um = new UsuarioModel();
    
    private String usuario;
    private String senha;
    
   public LoginController(){
      this.usuario= "";
      this.senha = "";
    }
    
    public String getUsuario() {
        return usuario;
    }

    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    
    public String getSenha() {
        return senha;
    }

    
    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    
    public void login() {
        FacesContext context = FacesContext.getCurrentInstance();
        
        if(this.usuario.equals("admin") && this.senha.equals("admin")) {
            context.getExternalContext().getSessionMap().put("user", usuario);
            context.getExternalContext().getSessionMap().put("perfil", "usuario");
            try{
                context.getExternalContext().redirect("Logout.xhtml");
            } catch(IOException e){
                e.printStackTrace();
            }
        } else {
            context.addMessage(null, new FacesMessage("A autenticaçao falhou."));
        }
    }
    public void logout(){
        FacesContext context = FacesContext.getCurrentInstance();
        context.getExternalContext().invalidateSession();
        try{
            context.getExternalContext().redirect("index.xhtml");
        }catch(IOException e){
            e.printStackTrace();
        }
    }
} 