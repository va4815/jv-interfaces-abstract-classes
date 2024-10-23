public class Road extends Environment<Vehicle> {

    @Override
    public void checkTraffic() {
        for (Vehicle f : this.traffic) {
            f.move();
        }
    }

}
