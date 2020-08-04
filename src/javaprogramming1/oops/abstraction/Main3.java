package javaprogramming1.oops.abstraction;

public class Main3 {
	public static void main(String args[]) {
		SBI sbi = new SBI();
		PNB pnb = new PNB();
		System.out.println("\nSbi rate of interest :- "+sbi.getRateOfInterest());
		System.out.println("\nPNB rate of interest :- "+pnb.getRateOfInterest());
	}
}