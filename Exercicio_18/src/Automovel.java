public class Automovel {
    protected int numRodas;
    protected int velMax;
    protected boolean ligado;

    public Automovel(int numRodas, int velMax){
        this.numRodas = numRodas;
        this.velMax = velMax;
        this.ligado = false;

    }
    public void Ligar(){
        ligado = true;
        System.out.println("Automóvel ligado..");
    }

    public void desligar(){
        ligado = false;
        System.out.println("Automóvel desligado.");
    }
    public boolean isLigado(){
        return ligado;
    }

}
