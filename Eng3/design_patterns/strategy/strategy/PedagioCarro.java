package strategy;

public class PedagioCarro implements Pedagio {
    public void cobrar() {
        Valor v = new Valor();
        System.out.println("Carro de passeio: R$" + v.valor);
    }
}
