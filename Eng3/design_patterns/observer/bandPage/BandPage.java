import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class BandPage {
    Map<String, List<Observer>> fanclube = new HashMap<>();

    public BandPage(String... operations) {
        for (String operation : operations) {
            this.fanclube.put(operation, new ArrayList<>());
        }
    }

    public void adicionar(String tipoFan, Observer fan) {
        List<Observer> panelinha = fanclube.get(tipoFan);
        panelinha.add(fan);
    }

    public void remover(String tipoFan, Observer fan) {
        List<Observer> panelinha = fanclube.get(tipoFan);
        panelinha.remove(fan);
    }

    public void notificar(String tipoFan) {
        List<Observer> panelinha = fanclube.get(tipoFan);
        for (Observer fan : panelinha) {
            fan.atualizar(tipoFan);
        }
    }

}
