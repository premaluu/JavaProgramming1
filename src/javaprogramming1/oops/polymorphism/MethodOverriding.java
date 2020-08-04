package javaprogramming1.oops.polymorphism;
//this example is also of covarient datatype also in this we have taken two class having method which overriden and also both have diffrent return types this is supported only if there is non primitive datatype like calss name..
class Bike {
    public Bike run() {
        System.out.println("Bike is running...");
        return this;
    }
}
class MountainBike extends Bike {
    @Override
    public MountainBike run() {
        System.out.println("Mountain bike is running...");
        return this;
    }
}
public class MethodOverriding {
    public static void main(String args[]) {
        MountainBike mountainBike = new MountainBike();
        System.out.println(new MountainBike().run().hashCode());
    }
}