
package modelWebLib;

import java.util.List;
import modelWebLib.Dao.LivroDao;
import modelWebLib.Entidades.Livro;
import modelWebLib.Hibernate.LivroHibernate;

public class LivroModel {
    
    private LivroDao dao;
    
    public LivroModel(){
        this.dao = new LivroHibernate();
    }
    
    public void cadastrarLivro(Livro livro) {
        dao.inserir(livro);
    }
    public void deletarLivro(Livro livro) {
        dao.deletar(livro);
    }
    public void alterarLivro(Livro livro) {
        dao.alterar(livro);
    }
    public Livro buscarLivro(long id) {
        return this.dao.buscar(id);
    }
    public List<Livro> buscarLivros() {
        return this.dao.listarTodos() ;
    }
       
        
}
