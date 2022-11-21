package task3;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
         1.Person деген абстрактный класс тузунуз.
         Анын полялары :
         private int id;
         private String fullName;
         private byte age;
         private char gender;
         private String email;
         private String phoneNumber;
         private double governmentsSalary;
         2.Person классын мурастаган 3 класс тузунуз.
         Алар:
         "Programmer Driver жана Doctor"
         ар бирине озунчо уникальный поле кошунуздар.
         3.PersonAble деген интерфейс ачып анын ичине
         void favoriteSport();

         String favoriteLanguage();

         Month favoriteMouth();

         String getLastName();

         LocalDate getDateOfBrith();

         String getPhoneNumberAndEmail();

         long[] getPeopleOfAllAges(Person[] people);
         деген методдорду тузунуз.Жана алардын реализацияларын кылуу учун
         "Programmer Driver жана Doctor" класстары impiliment кылсын.
         4.Main класста алардын ар бирине 3 тон обеъкт тузуп жазган логиканыз
         туура иштедиби текшериниз.

         */

        Person programmer1 = new Programmer(99, "Kuban Kelsinbekov", 20, 'M', "kuban@gmail.com", "708281398", 40000);
        Person programmer2 = new Programmer(88, "Janysh Akbalaev", 18, 'M', "janysh@mail.com", "780564738", 41000);
        Person programmer3 = new Programmer(77, "Akyl Japarov", 28, 'M', "akyl@mail.com", "998457368", 50000);

        Person driver1 = new Driver(55, "Asan Kelsinbekov", 44, 'M', "asan@gmail.com", "708281398", 30000);
        Person driver2 = new Driver(66, "Jamila Kelsinbekova", 22, 'W', "jamila@gmail.com", "708281398", 20000);
        Person driver3 = new Driver(44, "Aigul Kelsinbekova", 33, 'W', "aigul@gmail.com", "708281398", 25000);

        Person doctor1 = new Doctor(44, "Aigul Kelsinbekova", 23, 'W', "aigul@gmail.com", "708281398", 45000);
        Person doctor2 = new Doctor(44, "Minura Kelsinbekova", 43, 'W', "minura@gmail.com", "708281398", 46000);
        Person doctor3 = new Doctor(44, "Jaina Kelsinbekova", 52, 'W', "jaina@gmail.com", "708281398", 47000);

        Person[] people1 = {programmer1, programmer2, programmer3};
        Person[] people2 = {driver1, driver2, driver3};
        Person[] people3 = {doctor1, doctor2, doctor3};

        Person[] people = {programmer1, programmer2, programmer3, driver1, driver2, driver3, doctor1, doctor2, doctor3};

        Scanner scanner = new Scanner(System.in);
        System.out.println(programmer1.toString());
        System.out.println("Favorite sport is: " + programmer1.favoriteSport("Football"));
        System.out.println("Favorite language: " + programmer1.favoriteLanguage("English"));
        System.out.println("Favorite month: " + programmer1.favoriteMonth(Month.DECEMBER));
        System.out.println("The last name: " + Arrays.toString(programmer1.getLastName()));
        System.out.println("Dey of brith: " + programmer1.getDateOfBrith(LocalDate.of(2002, 12, 10)));
        System.out.println(programmer1.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(programmer1.getPeopleOfAllAge(people1)));
        System.out.println();


        System.out.println(programmer2.toString());
        System.out.println("Favorite sport is: " + programmer2.favoriteSport("Tennis"));
        System.out.println("Favorite language: " + programmer2.favoriteLanguage("Russia"));
        System.out.println("Favorite month: " + programmer2.favoriteMonth(Month.OCTOBER));
        System.out.println("The last name: " + Arrays.toString(programmer2.getLastName()));
        System.out.println("Dey of brith: " + programmer2.getDateOfBrith(LocalDate.of(2004, 10, 11)));
        System.out.println(programmer2.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(programmer2.getPeopleOfAllAge(people1)));
        System.out.println();

        System.out.println(programmer3.toString());
        System.out.println("Favorite sport is: " + programmer3.favoriteSport("Volleyball"));
        System.out.println("Favorite language: " + programmer3.favoriteLanguage("Kyrgyzstan"));
        System.out.println("Favorite month: " + programmer3.favoriteMonth(Month.MARCH));
        System.out.println("The last name: " + Arrays.toString(programmer3.getLastName()));
        System.out.println("Dey of brith: " + programmer3.getDateOfBrith(LocalDate.of(2005, 3, 21)));
        System.out.println(programmer3.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(programmer3.getPeopleOfAllAge(people1)));
        System.out.println();


        System.out.println(driver1.toString());
        System.out.println("Favorite sport is: " + driver1.favoriteSport("Cyber sport"));
        System.out.println("Favorite language: " + driver1.favoriteLanguage("Uzbek"));
        System.out.println("Favorite month: " + driver1.favoriteMonth(Month.JUNE));
        System.out.println("The last name: " + Arrays.toString(driver1.getLastName()));
        System.out.println("Dey of brith: " + driver1.getDateOfBrith(LocalDate.of(1990, 7, 21)));
        System.out.println(driver1.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(driver1.getPeopleOfAllAge(people2)));
        System.out.println();

        System.out.println(doctor1.toString());
        System.out.println("Favorite sport is: " + doctor1.favoriteSport("Cyber sport"));
        System.out.println("Favorite language: " + doctor1.favoriteLanguage("Uzbek"));
        System.out.println("Favorite month: " + doctor1.favoriteMonth(Month.FEBRUARY));
        System.out.println("The last name: " + Arrays.toString(doctor1.getLastName()));
        System.out.println("Dey of brith: " + doctor1.getDateOfBrith(LocalDate.of(1980, 2, 28)));
        System.out.println(doctor1.getPhoneNumberAndEmail());
        System.out.println(Arrays.toString(doctor1.getPeopleOfAllAge(people3)));
        System.out.println();


    }
}
