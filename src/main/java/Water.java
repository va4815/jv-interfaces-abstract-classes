public class Water extends Environment<Swimmable> {

    @Override
    public void checkTraffic() {
        for (Swimmable f : this.traffic) {
            f.swim();
        }
    }

}
