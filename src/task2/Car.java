package task2;

public abstract class Car implements  StopAble{
    private String name;
    private String colour;
    private int maxGuest;
    private int prise;

    public Car() {
    }

    public Car(String name, String colour, int maxGuest, int prise) {
        this.name = name;
        this.colour = colour;
        this.maxGuest = maxGuest;
        this.prise = prise;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getMaxGuest() {
        return maxGuest;
    }

    public void setMaxGuest(int maxGuest) {
        this.maxGuest = maxGuest;
    }

    public int getPrise() {
        return prise;
    }

    public void setPrise(int prise) {
        this.prise = prise;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", colour='" + colour + '\'' +
                ", maxGuest=" + maxGuest +
                ", prise=" + prise +
                '}';
    }
}
