package javaprogramming1.oops.inheritance;

public class CycloCrossBicycle extends Bicycle{
    int maxSpeed;
    public CycloCrossBicycle(int gear, int speed, int maxSpeed) {
        super(gear, speed);
        this.maxSpeed = maxSpeed;
    }
    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
    @Override
    public String toString() {
        return(super.toString()+"\nMax speed of bicycle :- "+this.maxSpeed);
    }
}