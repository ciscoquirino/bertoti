package observers;

public class FanTour implements Fan {
    private String name;

    public FanTour(String name) {
        this.name = name;
    }

    @Override
    public void update(String eventType) {
        System.out.println("Hello " + name + "! You favorite band has added a new " + eventType
                + "! Tickets on sale now at www.faketickets.com!");
    }

}
