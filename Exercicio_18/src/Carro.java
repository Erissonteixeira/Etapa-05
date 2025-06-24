public abstract class Carro extends Automovel {
    public Carro(int velMax){
        super(4,velMax);
    }
    @Override
    public void Ligar(){
        super.Ligar();
        System.out.println("Carro ligado..");
    }

    public abstract void ligar();
}
