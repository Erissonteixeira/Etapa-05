public class Pessoa {

    private String nome;
    private int idade;
    private Pessoa pai;
    private Pessoa mae;


    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }


    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;

    }

    public Pessoa getPai() {
        return pai;
    }



    public void setPai(Pessoa pai) {
        this.pai = pai;
    }

    public Pessoa getMae() {
        return mae;

    }

    public void setMae(Pessoa mae) {

        this.mae = mae;

    }

    public void exibirInformacoes() {

        System.out.println("Nome: " + nome);

        System.out.println("Idade: " + idade);

        if (pai != null) {

            System.out.println("Pai: " + pai.getNome());

        } else {

            System.out.println("Pai: não informado");
        }



        if (mae != null) {

            System.out.println("Mãe: " + mae.getNome());

        } else {

            System.out.println("Mãe: não informada");

        }

    }

}