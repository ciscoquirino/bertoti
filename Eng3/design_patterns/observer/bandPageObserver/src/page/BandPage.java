package page;

import publisher.EventManager;

public class BandPage {
    public EventManager events;

    public BandPage() {
        this.events = new EventManager("tour date", "new material");
    }

    public void AddTourDate() {
        events.notify("tour date");
    }

    public void ReleaseNewMaterial() {
        events.notify("new material");
    }

}
