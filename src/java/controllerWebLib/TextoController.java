
package controllerWebLib;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import modelWebLib.Entidades.Texto;
import modelWebLib.TextoModel;

public class TextoController {
    private Texto texto = new Texto();
    private TextoModel tm = new TextoModel();
    private List<Texto> textos = new ArrayList<>();
    
    public void AdicionarLivro(){
        FacesContext context = FacesContext.getCurrentInstance();
      	 try {
            tm.cadastrarTexto(texto);			
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage("Falha ao adicionar texto!"));
        }
   }
   public void DeletarLivro() {
       FacesContext context = FacesContext.getCurrentInstance();
      	 try {
           tm.deletarTexto(texto);			
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage("Falha ao excluir texto!"));
        }
   }
    public void AlterarLivro() {
       FacesContext context = FacesContext.getCurrentInstance();
      	 try {
            tm.alterarTexto(texto);			
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage("Falha ao alterar texto!"));
        }
   }
     public void BuscarLivro() {
       FacesContext context = FacesContext.getCurrentInstance();
      	 try {
            tm.buscarTexto(texto.getId());			
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage("Falha ao buscar texto!"));
        }
   }
      public void BuscarLivros() {
       FacesContext context = FacesContext.getCurrentInstance();
      	 try {
            tm.buscarTextos();			
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage("Falha ao listar texto!"));
        }
   }

    public Texto getTexto() {
        return texto;
    }

    public void setTexto(Texto texto) {
        this.texto = texto;
    }

    public TextoModel getTm() {
        return tm;
    }

    public void setTm(TextoModel tm) {
        this.tm = tm;
    }

    public List<Texto> getTextos() {
        return textos;
    }

    public void setTextos(List<Texto> textos) {
        this.textos = textos;
    }
      
      
      
      
}
