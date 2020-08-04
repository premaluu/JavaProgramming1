package javaprogramming1.oops.inheritance;

public class TrackBicycle extends MountainBicycle {

    int weight;

    TrackBicycle(int gear, int speed, int seatHeight, int weight) {
        super(gear, speed, seatHeight);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return (super.toString() + "\nWeight of bicycle is :- " + this.weight);
    }
}
