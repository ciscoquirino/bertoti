public class FanDisco implements Observer {
    private String nome;

    public FanDisco(String nome) {
        this.nome = nome;
    }

    @Override
    public void atualizar(String tipoFan) {
        System.out.println("Olá " + nome + "! Sua banda favorita acabou de " + tipoFan
                + "! Escute agora nas plataformas de streaming ou compre o vinil na nossa loja online!");
    }

}
