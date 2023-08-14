package strategy;

public class App {

    public static void main(String[] args) {
        Veiculo v1 = new Veiculo();
        v1.setPedagio(new PedagioCarro());
        v1.pagarPedagio();

        Veiculo v2 = new Veiculo();
        v2.setPedagio(new PedagioMoto());
        v2.pagarPedagio();

        Veiculo v3 = new Veiculo();
        v3.setPedagio(new PedagioCaminhao());
        v3.pagarPedagio();
    }
}