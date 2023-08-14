package strategy;

public class PedagioMoto implements Pedagio {
    public void cobrar() {
        Valor v = new Valor();
        System.out.println("Motocicleta: R$" + (v.valor / 2));
    }
}
