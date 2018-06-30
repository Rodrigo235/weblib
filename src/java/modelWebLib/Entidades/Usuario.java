package modelWebLib.Entidades;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="usuario")
public class Usuario implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_usuario", nullable = false)
    private long id_usuario;
    @Column(name="nome", nullable = false)
    private String nome;
    @Column(name="login", nullable = false)
    private String login;
    @Column(name="senha", nullable = false)
    private String senha;
    @OneToMany(mappedBy="usuario")
    private List<Livro> livros;
    @OneToMany(mappedBy="usuario")
    private List<Texto> textos;
       

    public Usuario(String nome, String login, String senha, long id_usuario, List<Livro> livros, List<Texto> textos){
        this.nome = nome;
        this.login = login;
        this.senha = senha;
        this.id_usuario = id_usuario;
        this.livros = livros;
        this.textos = textos;
    }    
    public Usuario(){
        
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public void setLivros(List<Livro> livros) {
        this.livros = livros;
    }
    public List<Texto> getTexto() {
        return textos ;
    }

    public void setTextos(List<Texto> textos) {
        this.textos = textos;
    }

    @Override
    public String toString() {
        return "Usuario{" + "id_usuario=" + id_usuario + 
                ", nome=" + nome + ", login=" + login + 
                ", senha=" + senha + ", livros=" + livros + 
                ", textos=" + textos + '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_usuario, nome, login); 
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Usuario usuario = (Usuario) obj;
        if (this.id_usuario != usuario.id_usuario) {
            return false;
        }
        return Objects.equals(this.id_usuario, usuario.id_usuario);
    }

    
    
    
        
        
}
