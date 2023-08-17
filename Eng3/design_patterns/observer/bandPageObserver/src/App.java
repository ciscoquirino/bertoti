import page.BandPage;
import observers.FanMaterial;
import observers.FanTour;

public class App {
    public static void main(String[] args) {
        BandPage bandPage = new BandPage();
        bandPage.events.subscribe("tour date", new FanTour("Fulano Que Vai Nos Shows"));
        bandPage.events.subscribe("new material", new FanMaterial("Carinha Que Compra Disco"));

        try {
            bandPage.AddTourDate();
            bandPage.ReleaseNewMaterial();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
