import java.util.List;

public class Main {

    public static void main(String[] args) {

        Sky sky = new Sky();
        sky.addTraffic(new Duck());
        sky.addTraffic(new Pigeon());
        sky.addTraffic(new Aeroplane());

        Water water = new Water();
        water.addTraffic(new Duck());
        water.addTraffic(new Fish());

        List<Environment<?>> environments = List.of(sky, water);

        for (Environment<?> environment: environments) {
            environment.checkTraffic();
        }


    }

}
