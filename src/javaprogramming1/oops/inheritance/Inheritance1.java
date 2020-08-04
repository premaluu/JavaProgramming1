package javaprogramming1.oops.inheritance;

public class Inheritance1 {
    public static void main(String args[]) {
        MountainBicycle m = new MountainBicycle(4, 100, 4); // this class contain single inheritance
        System.out.println("Bicycle details :- "+m.toString());
        TrackBicycle t = new TrackBicycle(5, 150, 6, 20);
        System.out.println(t.toString());
        CycloCrossBicycle c = new CycloCrossBicycle(4, 100, 400);
        System.out.println(c.toString());
    }
}