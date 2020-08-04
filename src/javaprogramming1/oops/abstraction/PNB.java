package javaprogramming1.oops.abstraction;

public class PNB extends Bank {
	double rateOfInterest = 9;
	@Override
	public double getRateOfInterest() {
		return this.rateOfInterest;
	}
}