public abstract class Moto extends Automovel{
    public Moto(int velMax){
        super(2,velMax);
    }
    @Override
    public void Ligar(){
        super.Ligar();
        System.out.println("Moto ligada..");

    }

    public abstract void ligar();
}
