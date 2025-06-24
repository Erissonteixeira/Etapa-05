public class Guincho extends Automovel {
    public Guincho(int velMax){
        super(6,velMax);
    }

    public void Carregar(Automovel veiculo){
        System.out.println("Carregando veículo... ");
        if (veiculo instanceof Carro){
            System.out.println("Guincho carregou um carro.");
        } else if(veiculo instanceof Moto){
            System.out.println("Guincho carregou uma moto..");
        }
    }

}
