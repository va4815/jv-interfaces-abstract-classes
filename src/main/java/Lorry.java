public class Lorry extends Vehicle {

    @Override
    public void move() {
        System.out.println(this.getClass().getSimpleName() + " is being driven");
    }

}
