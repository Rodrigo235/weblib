package modelWebLib;

import java.util.List;
import modelWebLib.Dao.UsuarioDao;
import modelWebLib.Entidades.Usuario;
import modelWebLib.Hibernate.UsuarioHibernate;

public class UsuarioModel {
    private UsuarioDao dao;
    
    public UsuarioModel(){
        this.dao = new UsuarioHibernate();
    }
    
    public void cadastrarLivro(Usuario usuario) {
        dao.inserir(usuario);
    }
    public void deletarLivro(Usuario usuario) {
        dao.deletar(usuario);
    }
    public void alterarLivro(Usuario usuario) {
        dao.alterar(usuario);
    }
    public Usuario buscarLivro(long id_usuario) {
        return this.dao.buscar(id_usuario);
    }
    public List<Usuario> buscarLivros() {
        return this.dao.listarTodos() ;
    }
}
