public class FanTour implements Observer {
    private String nome;

    public FanTour(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String tipoFan) {
        System.out.println("Olá " + nome + "! Sua banda favorita acabou de " + tipoFan
                + "! Compre ingressos em www.faketickets.com!!");
    }

}
