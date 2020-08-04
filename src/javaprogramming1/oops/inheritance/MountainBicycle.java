package javaprogramming1.oops.inheritance;

public class MountainBicycle extends Bicycle {
    int seatHeight;
    public MountainBicycle(int gear, int speed, int seatHeight) {
        super(gear, speed);
        this.seatHeight = seatHeight;
    }
    public void setHeight(int seatHeight) {
        this.seatHeight = seatHeight;
    }
    @Override
    public String toString() {
        return(super.toString()+"\nHeight of seat :- "+this.seatHeight);
    }
}