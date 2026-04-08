class Player {
    private int health;
    private int maxHealth;
    Player(int initialMaxHealth) {
        maxHealth = initialMaxHealth;
        health = initialMaxHealth;
    }
    int getHealth() {
        return health;
    }
    int getMaxHealth() {
        return maxHealth;
    }
    void takeDamage(int damage) {
        health = health - damage;
        if (health < 0) {
            health = 0;
            System.out.println("Player died!");
        }
    }
    void heal(int amount) {
        health = health + amount;
        if (health > maxHealth) {
            health = maxHealth;
        }
    }
}

public class Encapsulation2 {
    public static void main(String[] args) {
        Player p = new Player(100);
        p.takeDamage(30);
        System.out.println("After 30 damage: " + p.getHealth() + " HP");
        p.heal(50);
        System.out.println("After healing 50: " + p.getHealth() + " HP");
        p.takeDamage(150);
        System.out.println("After 150 damage: " + p.getHealth() + " HP");
    }
}
