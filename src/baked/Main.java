package baked;

public class Main {
    public static void main(String[] args) {
        Bread bread = new Bread();
        System.out.println(bread.flour());
        System.out.println("Готовится " + bread.time() + " минут.\n");

        Pie pie = new Pie();
        System.out.println(pie.flour());
        System.out.println("Готовится " + pie.time() + " минут.\n");

        Bun bun = new Bun();
        System.out.println(bun.flour());
        System.out.println("Готовится " + bun.time() + " минут.");
    }
}
