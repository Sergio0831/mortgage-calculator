
import java.util.Scanner;
import java.util.Locale;
import java.text.NumberFormat;

public class MortgageCalculator {
	
	public static void main(String[] args) {
		final byte MONTHS_IN_YEAR = 12;
		final byte PERCENT = 100;
		
		Scanner scanner = new Scanner(System.in);
		Locale usa = new Locale("en", "US");
		
		System.out.print("Principal: ");
		int principal = scanner.nextInt();
		
		System.out.print("Annual Interest Rate: ");
		float annualInterest = scanner.nextFloat();
		float monthlyInterest = (annualInterest / PERCENT) / MONTHS_IN_YEAR;
		
		System.out.print("Period (Years): ");
		byte years = scanner.nextByte();
		int numberOfPayments = years * MONTHS_IN_YEAR;
		
		double mortgage = (principal * monthlyInterest)  / (1 - Math.pow(1 + monthlyInterest, -numberOfPayments));
		
		String mortgageFormatted = NumberFormat.getCurrencyInstance(usa).format(mortgage);
		
		System.out.println("Mortgage: " + mortgageFormatted );
	} // method end
	
} // class end