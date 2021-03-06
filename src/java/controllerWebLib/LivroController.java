
package controllerWebLib;

import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import modelWebLib.Entidades.Livro;
import modelWebLib.LivroModel;

public class LivroController {
   private Livro livro = new Livro();
   private LivroModel lm = new LivroModel();
   private List<Livro> livros = new ArrayList<>();
   
   public void AdicionarLivro(){
       FacesContext context = FacesContext.getCurrentInstance();
      	 try {
            lm.cadastrarLivro(livro);			
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage("Falha ao adicionar livro!"));
        }
   }
   public void DeletarLivro() {
       FacesContext context = FacesContext.getCurrentInstance();
      	 try {
            lm.deletarLivro(livro);			
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage("Falha ao excluir livro!"));
        }
   }
    public void AlterarLivro() {
       FacesContext context = FacesContext.getCurrentInstance();
      	 try {
            lm.alterarLivro(livro);			
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage("Falha ao alterar livro!"));
        }
   }
     public void BuscarLivro() {
       FacesContext context = FacesContext.getCurrentInstance();
      	 try {
            lm.buscarLivro(livro.getId());			
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage("Falha ao buscar livro!"));
        }
   }
      public void BuscarLivros() {
       FacesContext context = FacesContext.getCurrentInstance();
      	 try {
            lm.buscarLivros();			
        } catch (Exception ex) {
            context.addMessage(null, new FacesMessage("Falha ao listar livros!"));
        }
   }
   

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public LivroModel getLm() {
        return lm;
    }

    public void setLm(LivroModel lm) {
        this.lm = lm;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
   
   
}
