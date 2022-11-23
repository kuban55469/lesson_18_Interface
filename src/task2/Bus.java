package task2;

public class Bus extends Car implements StopAble{
    private Person[] people;

    public Bus(String name, String colour, int maxGuest, int prise, Person[] people) {
        super(name, colour, maxGuest, prise);
        this.people = people;
    }

    public Person[] getPeople() {
        return people;
    }

    public void setPeople(Person[] people) {
        this.people = people;
    }

    @Override
    public void stop() {
        if (getMaxGuest() < people.length && getMaxGuest() < 30){
            System.out.println("Bus Stopping");
        }else {
            System.out.println("Net mesta Bus");
        }
    }
}
