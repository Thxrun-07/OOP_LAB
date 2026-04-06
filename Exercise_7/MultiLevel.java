class Person {
    Person() {
        System.out.println("Person constructor called!");
    }
}

class Employee extends Person {
    Employee() {
        System.out.println("Employee constructor called!");
    }
}

class Manager extends Employee {
    Manager() {
        System.out.println("Manager constructor called!");
    }
}

public class MultiLevel {
    public static void main(String[] args) {
        Manager myManager = new Manager();
    }
}