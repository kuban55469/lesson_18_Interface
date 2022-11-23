package beast;

public class Gepard extends Beast implements AttackAble, SpeedAble{
    public Gepard(String name, int weight) {
        super(name, weight);
    }

    @Override
    public void attacking() {
        System.out.println(getName() + " attacking");
    }

    @Override
    public void speed() {
        System.out.println("Speed: " + 200 + " km/h");
    }
}
