
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelWebLib.Entidades.Texto;

public class teste2 {

    public static void testeTexto(EntityManager em) {
        Texto t = new Texto();
        t.setAutor("cw");
        t.setCategoria("poesia");
        t.setGenero("amor");
        t.setConteudo("Por muito tempo\n"
                + "Achei que não amava\n"
                + "porque ninguém me arrebatava\n"
                + "me deixava sem chão\n"
                + "\n"
                + "Mesmo “sem amar”\n"
                + "me relacionava\n"
                + "mas muitas vezes me perguntava\n"
                + "será o amor, uma ilusão?\n"
                + "\n"
                + "Por fim, tive uma paixão\n"
                + "mesmo assim, me desliguei\n"
                + "como quem aperta um botão\n"
                + "Será que sou sem coração?\n"
                + "\n"
                + "Verdade que chorei,\n"
                + "Verdade que fantasiei\n"
                + "mas ao mesmo tempo\n"
                + "minha cabeça sempre comandou a ação\n"
                + "\n"
                + "Nos vendem uma loucura\n"
                + "De que o amor cega\n"
                + "extasia, desestrutura\n"
                + "Agora eu descobri\n"
                + "que, pelo menos pra mim,\n"
                + "amor é uma escolha\n"
                + "Que faço todo o tempo\n"
                + "\n"
                + "Escolho compartilhar\n"
                + "escolho amar e não amar\n"
                + "escolho ficar sã\n"
                + "escolho dividir \n"
                + "escolho unir\n"
                + "escolho testemunhar");
        t.setTitulo("sfsdf");

        em.persist(em);
        System.out.println(t.toString());
    }

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            testeTexto(em);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
            em.getTransaction().rollback();
            System.out.println("Erro");
        } finally {
            em.close();
            emf.close();
        }

    }
}
