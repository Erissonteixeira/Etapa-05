public class MotoPartidaPedal extends  Moto {
    private boolean aceleradorPuxado;

    public MotoPartidaPedal(int velMax) {
        super(velMax);
        this.aceleradorPuxado = false;
    }

    public void puxarAcelerador() {
        aceleradorPuxado = true;
        System.out.println("Acelerador puxado..");
    }

    @Override
    public void ligar() {
        if (aceleradorPuxado) {
            super.Ligar();
            System.out.println("Moto com partida no pedal ligada.");
        } else {
            System.out.println("Puxe o acelarador para ligar a moto.");
        }
    }
}