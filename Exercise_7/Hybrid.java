class Animal {
    Animal(int age) {
        System.out.println("Animal created with age: " + age);
    }
}

class Bird extends Animal {
    Bird(int age) {
        super(age);
        System.out.println("Bird created!");
    }
}

class Fish extends Animal {
    Fish(int age) {
        super(age);
        System.out.println("Fish created!");
    }
}

public class Hybrid {
    public static void main(String[] args) {
        Bird myBird = new Bird(3);
        System.out.println();
        Fish myFish = new Fish(5);
    }
}