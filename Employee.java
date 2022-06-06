package Lesson5;

public class Employee {

    String name;
    String position;
    String email;
    String phone_number;
    int salary;
    int age;
    public Employee(String soTrydnikname, String raIting, String sotRydnik_email, String telephon, int zP, int vozrast){

        name = soTrydnikname;
        position = raIting;
        email = sotRydnik_email;
        phone_number = telephon;
        salary = zP;
        age = vozrast;
    }

    public void print() {
        System.out.println(name + ", " + position + ", " + email + ", " + phone_number + ", " + salary + ", " + age);
    }
}