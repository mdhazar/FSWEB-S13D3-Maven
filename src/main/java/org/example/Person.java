package org.example;

public class Person {
    private String firstName;
    private String lastName;
    private int age;
    private String address;
    private String phoneNumber;
    private String email;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, String address, String phoneNumber, String email) {
        this(firstName, lastName, age);
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean isTeen() {
        return age >= 13 && age <= 19;
    }

    public static void main(String[] args) {
        Person person1 = new Person("John", "Doe", 20);
        Person person2 = new Person("Jane", "Smith", 15, "123 Street", "555-1234", "jane@email.com");

        System.out.println("Firstname: " + person1.getFirstName());
        System.out.println("LastName: " + person1.getLastName());
        System.out.println("Age: " + person1.getAge());
        System.out.println("Is Teen: " + person1.isTeen());

        System.out.println("\nFirstname: " + person2.getFirstName());
        System.out.println("LastName: " + person2.getLastName());
        System.out.println("Age: " + person2.getAge());
        System.out.println("Is Teen: " + person2.isTeen());
    }
}