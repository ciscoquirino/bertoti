

public class Veiculo {
    private Pedagio pedagio;
    public float valorBase = 2.22f;
    
    public void setPedagio(Pedagio pedagio){
        this.pedagio = pedagio;
    }

    public void pagarPedagio() {
        this.pedagio.pagar(valorBase);
    }
}
