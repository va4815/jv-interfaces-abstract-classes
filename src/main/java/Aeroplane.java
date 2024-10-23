public class Aeroplane extends Vehicle implements Flyable {

    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName() + " is flying");
    }

    @Override
    public void fly() {
        System.out.println(this.getClass().getSimpleName() + " is flying");
    }
}
