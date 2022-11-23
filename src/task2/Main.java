package task2;

public class Main {
    public static void main(String[] args) {
        Person people0 = new Person("Kuban","kunan@mail.com",20);
        Person people1 =  new Person("Emir","emir@mail.com",22);
        Person people2 = new Person("Kutman","kutman@mail.com",18);
        Person people3 = new Person("Janysh","janush@mail.com",18);
        Person people4 = new Person("Janysh","janush@mail.com",18);
        Person[] people ={people0,people1,people2,people3,people4};
        Person[] client ={people0,people1,people2,people3,people4};

        Bus bus = new Bus("Mir","red",3,11,people);
        bus.stop();
        for (Person person : people) {
            System.out.println(person);
        }

        Taxi taxi = new Taxi("Yandex","black",5,100,client);
        taxi.stop();
        for (Person person : client) {
            System.out.println(person);
        }
    }
}
