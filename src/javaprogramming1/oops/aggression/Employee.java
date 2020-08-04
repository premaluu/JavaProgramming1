package javaprogramming1.oops.aggression;

public class Employee {
    int id;
    String name;
    Address address;
    
    public Employee(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(Address address) {
        this.address = address;
    }
    public int getId() {
        return this.id;
    }
    public String getName() {
        return this.name;
    }
    public String getAddress() {
        return this.address.toString();
    }
    @Override
    public String toString() {
        return("\nEmployee id :- "+this.id+"\nEmployee name :- "+this.name+"\nEmployee address :- "+this.address.toString());
    }
    public static void main(String args[]) {
        Address ad1 = new Address("anand", "gujrat", "india");
        Address ad2 = new Address("surat", "gujrat", "india");
        Employee e1 = new Employee(101, "premal", ad1), e2 = new Employee(102, "paresh", ad2);
        System.out.println(e1.toString());
        System.out.println(e2.toString());
    }
}