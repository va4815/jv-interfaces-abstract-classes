public class Road extends Environment<Movable> {

    @Override
    public void checkTraffic() {
        for (Movable f : this.traffic) {
            f.move();
        }
    }

}
