package beast;

public class Tiger extends Beast implements AttackAble , SpeedAble  {
    public Tiger(String name, int weight) {
        super(name, weight);
    }

    @Override
    public  void attacking() {
        System.out.println(getName() + " attacking");
    }

    @Override
    public void speed() {
        System.out.println("Speed: " + 250 + " km/h");
    }
}
