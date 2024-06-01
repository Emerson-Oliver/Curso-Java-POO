package util;

public class CurrencyConverter {	
	public static double dollarToReal(double amount, double dollarPrice) {
		return amount * dollarPrice * (1.0 + IOF);
		}
	public static double IOF = 0.06;
}
