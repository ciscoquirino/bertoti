package observers;

public class FanMaterial implements Fan {
    private String name;

    public FanMaterial(String name) {
        this.name = name;
    }

    @Override
    public void update(String eventType) {
        System.out.println("Hello " + name + "! You favorite band just released " + eventType
                + "! Listen now on stream or pre-order the record in our online store!");
    }

}
