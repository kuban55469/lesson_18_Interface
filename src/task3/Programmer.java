package task3;

import java.time.LocalDate;
import java.time.Month;

public class Programmer extends Person implements PersonAble{
    public Programmer(int id, String fullName, int age, char gender, String email, String phoneNumber, double governmentsSalary) {
        super(id, fullName, age, gender, email, phoneNumber, governmentsSalary);
    }

    @Override
    public String favoriteSport(String name) {
        return name;
    }

    @Override
    public String favoriteLanguage(String language) {
        return language;
    }

    @Override
    public Month favoriteMonth(Month month) {
        return month;
    }



    @Override
    public String[] getLastName() {
        String[] lst = getFullName().split(" ");
        return new String[]{lst[0]};
    }

    @Override
    public LocalDate getDateOfBrith(LocalDate localDate) {
        return localDate;
    }


    @Override
    public String getPhoneNumberAndEmail() {
        return "Phone number: " + getPhoneNumber() + "\nEmail: " + getEmail();
    }

    @Override
    public long[] getPeopleOfAllAge(Person[] people) {
        return new long[]{getAge()};
    }
}
