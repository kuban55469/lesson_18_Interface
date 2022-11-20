package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person programmer1 = new Programmer(99, "Kuban Kelsinbekov", 20, 'M', "kuban@gmail.com", "708281398", 40000);
        Person programmer2 = new Programmer(88, "Janysh Akbalaev", 18, 'M', "janysh@mail.com", "780564738", 41000);
        Person programmer3 = new Programmer(77, "Akyl Japarov", 28, 'M', "akyl@mail.com", "998457368", 50000);

        Person driver1 = new Driver(55, "Asan Kelsinbekov", 44, 'M', "kuban@gmail.com", "708281398", 30000);
        Person driver2 = new Driver(66, "Jamila Kelsinbekova", 22, 'W', "jamila@gmail.com", "708281398", 20000);
        Person driver3 = new Driver(44, "Aigul Kelsinbekova", 33, 'W', "aigul@gmail.com", "708281398", 25000);

        Person doctor1 = new Doctor(44, "Aigul Kelsinbekova", 23, 'W', "aigul@gmail.com", "708281398", 45000);
        Person doctor2 = new Doctor(44, "Minura Kelsinbekova", 43, 'W', "aigul@gmail.com", "708281398", 46000);
        Person doctor3 = new Doctor(44, "Jaina Kelsinbekova", 52, 'W', "aigul@gmail.com", "708281398", 47000);

        Person[] people1 = {programmer1, programmer2, programmer3};
//        Person[] people2 = {driver1,driver2,driver3};
//        Person[] people3 = {doctor1,doctor2,doctor3};
        Person[] people = {programmer1, programmer2, programmer3, driver1, driver2, driver3, doctor1, doctor2, doctor3};


            System.out.println("My favorite sport is: " + programmer1.favoriteSport());
            System.out.println("My favorite language: " + programmer1.favoriteLanguage());
            System.out.println("My favorite month: " + programmer1.favoriteMonth());
            System.out.println("The last name: " + programmer1.getLastName());
            System.out.println("My dey of brith: " + programmer1.getDateOfBrith());
            System.out.println(programmer1.getPhoneNumberAndEmail());
            programmer1.getPeopleOfAllAge(people);
            System.out.println();

            System.out.println("My favorite sport is: " + programmer2.favoriteSport());
            System.out.println("My favorite language: " + programmer2.favoriteLanguage());
            System.out.println("My favorite month: " + programmer2.favoriteMonth());
            System.out.println("The last name: " + programmer2.getLastName());
            System.out.println("My dey of brith: " + programmer2.getDateOfBrith());
            System.out.println(programmer2.getPhoneNumberAndEmail());
            programmer2.getPeopleOfAllAge(people);
            System.out.println();

    }
}
