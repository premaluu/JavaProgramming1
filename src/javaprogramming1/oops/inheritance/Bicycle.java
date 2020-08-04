package javaprogramming1.oops.inheritance;

public class Bicycle {
    int gear;
    int speed;
    
    public Bicycle(int gear, int speed) {
        this.gear = gear;
        this.speed = speed;
    }
    void speedUp(int increment) {
        this.speed += increment;
    }
    void applyBreak(int decrement) {
        this.speed -= decrement;
    }
    @Override
    public String toString() {
        return("\nSpeed of bicycle is :- "+this.speed+"\nGear of bicycle is :- "+this.gear);
    }
}