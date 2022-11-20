package task3;

public abstract class Person implements PersonAble {
    private int id;
    private String fullName;
    private int age;
    private char gender;
    private String email;
    private String phoneNumber;
    private double governmentsSalary;

    public Person(int id, String fullName, int age, char gender, String email, String phoneNumber, double governmentsSalary) {
        this.id = id;
        this.fullName = fullName;
        if (age > 0 && age <= 120) {
            this.age = age;
        }else {
            System.out.println("Error age!");
        }
        this.gender = gender;
        if (email.contains("@")) {
            this.email = email;
        }else {
            System.out.println("Error email!!");
        }
        this.phoneNumber = phoneNumber;
        this.governmentsSalary = governmentsSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getGovernmentsSalary() {
        return governmentsSalary;
    }

    public void setGovernmentsSalary(double governmentsSalary) {
        this.governmentsSalary = governmentsSalary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", email='" + email + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", governmentsSalary=" + governmentsSalary +
                '}';
    }
}
