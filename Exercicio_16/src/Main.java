import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Livro> livros = new ArrayList<>();
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        ArrayList<Emprestimo> emprestimos = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        livros.add(new Livro("Use a cabeça Java", "Kathy Sierra & Trisha Gee"));
        livros.add(new Livro("Entendendo Algoritmos", "Aditya Y. Bhargava"));

        pessoas.add(new Pessoa("Erisson", "857.835.771.35"));
        pessoas.add(new Pessoa("Roberto", "130.345.672.00"));

        System.out.println("Livros disponíveis:");
        for (int i = 0; i < livros.size(); i++) {
            System.out.println(i + " - " + livros.get(i));

        }
        System.out.println("Digite o número do livro para emprestar: ");
        int escolhaLivro = scanner.nextInt();
        Livro livroescolhido = livros.get(escolhaLivro);

        if (!livroescolhido.isDisponivel()){
            System.out.println("Livro já emprestado!");
            return;
        }
        System.out.println("Pessoas cadastradas:");
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(i + " - " + pessoas.get(i));

        }
        System.out.println("Digite o número da pessoa que irá pegar o livro: ");
        int escolhaPessoa = scanner.nextInt();
        Pessoa pessoaEscolhida = pessoas.get(escolhaPessoa);

        Emprestimo novoEmprestimo = new Emprestimo(livroescolhido, pessoaEscolhida);
        emprestimos.add(novoEmprestimo);
        System.out.println("\nEmpréstimo realizado com sucesso !");
        novoEmprestimo.mostrarDetalhes();



    }
}
