
package modelWebLib;

import java.util.List;
import modelWebLib.Dao.TextoDao;
import modelWebLib.Entidades.Texto;
import modelWebLib.Hibernate.TextoHibernate;

public class TextoModel {
   
    private TextoDao dao;
    
    public TextoModel(){
        this.dao = new TextoHibernate();
    }
    
     public void cadastrarTexto(Texto texto) {
        dao.inserir(texto);
    }
    public void deletarTexto(Texto texto) {
        dao.deletar(texto);
    }
    public void alterarTexto(Texto texto) {
        dao.alterar(texto);
    }
    public Texto buscarTexto(long id) {
         return this.dao.buscar(id); 
    }
    public List<Texto> buscarTextos() {
        return this.dao.listarTodos();
    }
   
}
