public class TesteBandPage {
    public static void main(String[] args) throws Exception {
        BandPage b = new BandPage("lançar material novo", "adicionar nova data na agenda");
        FanTour ft = new FanTour("Carinha que vai nos shows");
        FanDisco fd = new FanDisco("Carinha que compra disco");
        b.adicionar("lançar material novo", fd);
        b.adicionar("adicionar nova data na agenda", ft);

        try {
            b.notificar("lançar material novo");
            b.notificar("adicionar nova data na agenda");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
