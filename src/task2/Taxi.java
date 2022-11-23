package task2;

public class Taxi extends Car implements StopAble{
    private Person[] client;

    public Taxi(String name, String colour, int maxGuest, int prise, Person[] client) {
        super(name, colour, maxGuest, prise);
        this.client = client;
    }

    public Person[] getClient() {
        return client;
    }

    public void setClient(Person[] client) {
        this.client = client;
    }

    @Override
    public void stop() {
        if (getMaxGuest() < client.length && getMaxGuest() > 5){
            System.out.println("Taxi Stopping");
        }else {
            System.out.println("net mesta");
        }
    }
}
