package baked;

public class Pie implements Bakedable {
    @Override
    public String flour() {
        return "Пирог приготовлен из кукрузной муки";
    }

    @Override
    public int time() {
        return 60;
    }
}
