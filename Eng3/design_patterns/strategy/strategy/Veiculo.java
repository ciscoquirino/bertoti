package strategy;

public class Veiculo {
    private Pedagio pedagio;
    
    public void setPedagio(Pedagio pedagio){
        this.pedagio = pedagio;
    }

    public void cobrarPedagio() {
        this.pedagio.cobrar();
    }
}
