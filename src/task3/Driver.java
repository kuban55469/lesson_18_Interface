package task3;

import java.time.LocalDate;
import java.time.Month;

public class Driver extends Person implements PersonAble{

    public Driver(int id, String fullName, int age, char gender, String email, String phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }

    @Override
    public String favoriteSport() {
        return null;
    }

    @Override
    public String favoriteLanguage() {
        return null;
    }

    @Override
    public Month favoriteMonth() {
        return null;
    }

    @Override
    public String getLastName() {
        return null;
    }


    @Override
    public LocalDate getDateOfBrith() {
        return null;
    }

    @Override
    public String getPhoneNumberAndEmail() {
        return null;
    }

    @Override
    public long[] getPeopleOfAllAge(Person[] people) {
        return new long[0];
    }
}
