public interface Movable {
    default void move() {
        System.out.println(this.getClass().getSimpleName() + " is moving!");
    }
}
