package Lesson5;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Ivanov Ivan Ivanovich", "Starshi yborshic", "Sat@mggli.ru", "+798966345344", 500, 63);
        persArray[1] = new Employee("Nikolaev Nikolay Nikolaevich", "Zamestitel stashego yborshica", "UUUUUat@mali.ru", "+799983453455", 1500, 39);
        persArray[2] = new Employee("Kozlov Nikita Ivanovich", "Zamestitel zamestitel starshego yborshica", "Sat@mali.ru", "+79434545371234", 1900, 41);
        persArray[3] = new Employee("Dristina Ira Nikolaevna", "Vedyshi yborshica", "Sav@ma.ru", "+79995345789", 2000, 50);
        persArray[4] = new Employee("Zarazkina Zakira Karenovna", "Director yborshikov", "Sat@ma.ru", "+7934534545896", 8000, 19);

        Scanner scan = new Scanner(System.in);
        System.out.println(persArray);




        Employee[] sotrydnik = {};
        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].age > 40) persArray[i].print();
        }
    }
}