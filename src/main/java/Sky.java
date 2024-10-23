import java.util.ArrayList;

public class Sky extends Environment<Flyable> {

    @Override
    public void checkTraffic() {
        System.out.println(this.getClass().getSimpleName() + " is flying!");
    }

    @Override
    public void addTraffic(Flyable traffic) {
        this.traffic.forEach(p -> {
            System.out.println(this.getClass().getSimpleName() + " is flying!");
        });
    }
}
