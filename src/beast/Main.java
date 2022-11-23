package beast;

public class Main {
    public static void main(String[] args) {
        Beast tiger = new Tiger("Tiger",90);
        Beast gepard = new Gepard("Gepard",80);
        Beast wolf = new Wolf("Wolf",70);

        Beast[] beasts = {tiger,gepard,wolf};
        for (Beast beast : beasts) {
            if (beast instanceof Tiger){
                System.out.println(beast);
                tiger.attacking();
                tiger.speed();
                System.out.println();
            } else if (beast instanceof Gepard) {
                System.out.println(beast);
                gepard.attacking();
                gepard.speed();
                System.out.println();
            } else if (beast instanceof Wolf) {
                System.out.println(beast);
                wolf.attacking();
                wolf.speed();
            }
        }
    }
}
