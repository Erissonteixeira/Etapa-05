public class CarroAutomatico extends Carro {
    private boolean freioPressionado;

    public CarroAutomatico(int velMax){
        super(velMax);
        this.freioPressionado = false;
    }

    public void pressionarFreio(){
        freioPressionado = true;
        System.out.println("Freio pressionado..");
    }
    @Override
    public void ligar(){
        if (freioPressionado){
            super.Ligar();
            System.out.println("Carro automatico ligado.");
        } else{
            System.out.println("Não é possível ligar. Pressione o freio.");
        }
    }
}
