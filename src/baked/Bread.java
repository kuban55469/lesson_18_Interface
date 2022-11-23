package baked;

public class Bread implements Bakedable {
    @Override
    public String flour() {
        return "Хлеб приготовлен из пишеничной муки";
    }

    @Override
    public int time() {
        return 20;
    }
}
