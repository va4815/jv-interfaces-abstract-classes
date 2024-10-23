import java.util.ArrayList;

public class Sky extends Environment<Flyable> {

    @Override
    public void checkTraffic() {
        for (Flyable f : this.traffic) {
            f.fly();
        }
    }

}
