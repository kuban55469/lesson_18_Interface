package baked;

public class Bun implements Bakedable{
    @Override
    public String flour() {
        return "Для булочки используется кукрузная и пишеничная мука";
    }

    @Override
    public int time() {
        return 15;
    }
}
