import java.util.ArrayList;
import java.util.List;

public abstract class Environment<T> {
    protected List<T> traffic = new ArrayList<>();

    public abstract void checkTraffic();

    public void addTraffic(T traffic) {
        this.traffic.add(traffic);
    }

    public void checkVehicles() {
        for(T t : this.traffic) {
            if (t instanceof Movable movable) {
                movable.move();
            } else if(t instanceof Swimmable swimmable) {
                swimmable.swim();
            } else if (t instanceof Flyable flyable ) {
                flyable.fly();
            }
        }
    }
}
