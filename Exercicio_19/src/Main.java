import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AgendaTelefonica agenda = new AgendaTelefonica();
        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {

            System.out.println("\n=== AGENDA TELEFONICA ===");
            System.out.println("1 - Adicionar contato: ");
            System.out.println("2 - Remover contato: ");
            System.out.println("3 - Listar contatos: ");
            System.out.println("0 - Sair.");
            System.out.print("Escolha uma opção: ");

            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Nome do contato: ");
                    String nome = scanner.nextLine();
                    System.out.print("Telefone do contato: ");
                    String telefone = scanner.nextLine();
                    agenda.adicionarContato(nome, telefone);
                    break;

                case 2:
                    System.out.print("Nome do contato para remover: ");
                    String nomeRemover = scanner.nextLine();
                    agenda.removerContato(nomeRemover);
                    break;

                case 3:
                    agenda.listarContatos();
                    break;

                case 0:
                    System.out.println("Encerrando agenda... ");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();

    }

}