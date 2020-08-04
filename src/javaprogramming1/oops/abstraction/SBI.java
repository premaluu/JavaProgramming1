package javaprogramming1.oops.abstraction;

public class SBI extends Bank {
	double rateOfInterest = 7;
	@Override
	public double getRateOfInterest() {
		return this.rateOfInterest;
	}
}