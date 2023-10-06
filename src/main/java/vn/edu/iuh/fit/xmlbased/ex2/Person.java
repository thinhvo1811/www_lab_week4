package vn.edu.iuh.fit.xmlbased.ex2;

import java.util.List;

public class Person {
    private String name;
    private int age;
    private List<String> emails;
    private List<Address> addresses;

    public Person() {
    }

    public Person(String name, int age, List<String> emails, List<Address> addresses) {
        this.name = name;
        this.age = age;
        this.emails = emails;
        this.addresses = addresses;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getEmails() {
        return emails;
    }

    public void setEmails(List<String> emails) {
        this.emails = emails;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", emails=" + emails +
                ", addresses=" + addresses +
                '}';
    }
}
