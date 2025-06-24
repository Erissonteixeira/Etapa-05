import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class AgendaTelefonica {
    private List<Contato> contatos;


    public AgendaTelefonica() {
        this.contatos = new ArrayList<>();
    }

    public void adicionarContato(String nome, String telefone) {
        contatos.add(new Contato(nome, telefone));
        System.out.println("Contato adicionado: " + nome);
    }

    public void removerContato(String nome) {
        Iterator<Contato> iterator = contatos.iterator();

        boolean removido = false;

        while (iterator.hasNext()) {
            Contato c = iterator.next();
            if (c.getNome().equalsIgnoreCase(nome)) {
                iterator.remove();
                removido = true;
                System.out.println("Contato removido: " + nome);
                break;

            }
        }
        if (!removido) {
            System.out.println("Contato não encontrado: " + nome);
        }
    }

    public void listarContatos() {

        if (contatos.isEmpty()) {
            System.out.println("Agenda vazia.");
        } else {
            System.out.println("Contatos na agenda:");

            for (Contato c : contatos) {
                System.out.println("- " + c);
            }
        }
    }
}