package publisher;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import observers.Fan;

public class EventManager {
    Map<String, List<Fan>> fans = new HashMap<>();

    public EventManager(String... operations) {
        for (String operation : operations) {
            this.fans.put(operation, new ArrayList<>());
        }
    }

    public void subscribe(String eventType, Fan fan) {
        List<Fan> fanclub = fans.get(eventType);
        fanclub.add(fan);
    }

    public void unsubscribe(String eventType, Fan fan) {
        List<Fan> fanclub = fans.get(eventType);
        fanclub.remove(fan);
    }

    public void notify(String eventType) {
        List<Fan> fanclub = fans.get(eventType);
        for (Fan fan : fanclub) {
            fan.update(eventType);
        }
    }

}
