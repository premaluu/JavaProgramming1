package javaprogramming1.oops.aggression;

public class Address {
    String city, state, country;
    
    public Address(String city, String state, String country) {
        this.city = city;
        this.state = state;
        this.country = country;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setState(String state) {
        this.state = state;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getCity() {
        return this.city;
    }
    public String getState() {
        return this.state;
    }
    public String getCountry() {
        return this.country;
    }
    @Override
    public String toString() {
        return(this.city+"\t"+this.state+"\t"+this.country);
    }
}