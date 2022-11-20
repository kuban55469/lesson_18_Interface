package task3;

import java.time.LocalDate;
import java.time.Month;

public interface PersonAble {
    String favoriteSport();
    String favoriteLanguage();
    Month favoriteMonth();
    String getLastName();
    LocalDate getDateOfBrith();
    String getPhoneNumberAndEmail();
    long[] getPeopleOfAllAge(Person[] people);
}
