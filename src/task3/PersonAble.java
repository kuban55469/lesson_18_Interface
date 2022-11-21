package task3;

import java.time.LocalDate;
import java.time.Month;

public interface PersonAble {
    String favoriteSport(String sport);
    String favoriteLanguage(String language);
    Month favoriteMonth(Month month);
    String[] getLastName();
    LocalDate getDateOfBrith(LocalDate localDate);
    String getPhoneNumberAndEmail();
    long[] getPeopleOfAllAge(Person[] people);
}
