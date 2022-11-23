package beast;

public class Wolf extends Beast implements AttackAble, SpeedAble{
    public Wolf(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void attacking() {
        System.out.println(getName() + " attacking");
    }

    @Override
    public void speed() {
        System.out.println("Speed: " + 300 + " km/h");
    }
}
