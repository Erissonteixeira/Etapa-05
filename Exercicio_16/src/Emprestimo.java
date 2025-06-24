import java.time.LocalDate;

public class Emprestimo {

    private Livro livro;
    private Pessoa pessoa;
    private LocalDate dataEmprestimo;

    public Emprestimo(Livro livro, Pessoa pessoa){
        this.livro = livro;
        this.pessoa = pessoa;
        this.dataEmprestimo = LocalDate.now();
        livro.emprestar();
    }
    public void mostrarDetalhes(){
        System.out.println("Emprestimo:");
        System.out.println("Livro: " + livro.getTitulo());
        System.out.println("Pessoa: " + pessoa.getNome());
        System.out.println("Data: " + dataEmprestimo);
    }
}
