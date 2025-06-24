public class Main {
    public static void main(String[] args) {
        CarroAutomatico carroAuto = new CarroAutomatico(200);
        carroAuto.ligar();
        carroAuto.pressionarFreio();
        carroAuto.ligar();

        MotoPartidaPedal motoPedal = new MotoPartidaPedal(150);
        motoPedal.ligar();
        motoPedal.puxarAcelerador();
        motoPedal.ligar();

        Guincho guincho = new Guincho(100);
        guincho.Carregar(carroAuto);
        guincho.Carregar(motoPedal);

    }
}
