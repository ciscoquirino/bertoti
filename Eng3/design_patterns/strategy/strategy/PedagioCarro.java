package strategy;

public class PedagioCarro implements Pedagio {
    public void pagar(float vb) {
        System.out.println("Carro de passeio: R$" + vb);
    }
}
