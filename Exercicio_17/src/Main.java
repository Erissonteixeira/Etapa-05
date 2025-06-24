import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Digite o nome da pessoa: ");
        String nomePessoa = sc.nextLine();
        System.out.print("Digite a idade da pessoa: ");
        int idadePessoa = sc.nextInt();
        sc.nextLine();

        Pessoa pessoa = new Pessoa(nomePessoa, idadePessoa);


        System.out.print("Digite o nome do pai: ");
        String nomePai = sc.nextLine();
        if (!nomePai.isEmpty()) {
            System.out.print("Digite a idade do pai: ");
            int idadePai = sc.nextInt();
            sc.nextLine();
            Pessoa pai = new Pessoa(nomePai, idadePai);
            pessoa.setPai(pai);
        }


        System.out.print("Digite o nome da mãe: ");
        String nomeMae = sc.nextLine();
        if (!nomeMae.isEmpty()) {
            System.out.print("Digite a idade da mãe: ");
            int idadeMae = sc.nextInt();
            sc.nextLine();
            Pessoa mae = new Pessoa(nomeMae, idadeMae);
            pessoa.setMae(mae);
        }


        System.out.println("\n--- Informações da Pessoa ---");
        pessoa.exibirInformacoes();

        sc.close();
    }
}