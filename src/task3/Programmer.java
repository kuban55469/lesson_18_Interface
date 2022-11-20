package task3;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Programmer extends Person implements PersonAble{
    public Programmer(int id, String fullName, int age, char gender, String email, String phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }

    @Override
    public String favoriteSport() {
        Scanner scanner = new Scanner(System.in);
        String lastname = scanner.nextLine();
        if (getLastName().equals(lastname)) {
            return "Football";
        } else if (getLastName().equals(lastname)) {
            return "Tennis";
        }else if (getLastName().equals(lastname)) {
            return "Cyber sport";
        }else
            return "Error last name";
    }

    @Override
    public String favoriteLanguage() {
        return "English";
    }

    @Override
    public Month favoriteMonth() {
        return Month.from(Month.NOVEMBER);
    }

    @Override
    public String getLastName() {
        return getFullName().substring(0, 6);
    }


    @Override
    public LocalDate getDateOfBrith() {
        return LocalDate.of(2002,12,10);
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return "Phone number: " + getPhoneNumber() + "\nEmail: " + getEmail();
    }

    @Override
    public long[] getPeopleOfAllAge(Person[] people) {
        long counter = 0L;
        for (Person person : people) {
            counter = person.getAge();
            counter++;
        }
        return new long[(int) counter];
    }
}
