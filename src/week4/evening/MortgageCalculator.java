package week4.evening;

public class MortgageCalculator {
    public static void main(String[] args) {

        double loanAmount = 500_000;
        int loanTermInYears = 15;
        String loanType = "FHA";

        double interestRate = 0;
        boolean is30Years = loanTermInYears == 30;

        switch (loanType){
            case "Fixed":
                interestRate = is30Years ? 7.5 : 6.9;
                break;
            case "FHA":
                if(is30Years){
                    interestRate = 7.24;
                } else {
                    interestRate = 6.62;
                }
                break;
            case "VA":
                interestRate = is30Years ? 6.75 : 5.99;
                break;
        }

        double monthlyInterestRate = interestRate / 1200;
        int numberOfPayments = loanTermInYears * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));

        System.out.println("Loan amount: $" + loanAmount);
        System.out.println("Years: " + loanTermInYears);
        System.out.println("Loan type: " + loanType);

        System.out.println("Your monthly mortgage payment for " + loanTermInYears + " Yr. " + loanType + " loon is $" + monthlyPayment);

    }
}
/*
2. Create a Java class named MortgageCalculator with the following requirements:

    2.1 Define the following variables:

	        loanAmount: Represents the loan amount.
	        loanTermInYears: Represents the loan term in years.
	        loanType: Represents the type of loan.

    2.2 Determine the annual interest rates for different loan types:

            Fixed:
                30 years: 7.5%
                15 years: 6.9%

            FHA:
                30 years: 7.24%
                15 years: 6.62%

            VA:
                30 years: 6.75%
                15 years: 5.99%

    2.3 Write a program to calculate the monthly mortgage payment using the following formula:

        monthlyInterestRate = annualInterestRate / 100 / 12
        numberOfPayments = loanTermInYears * 12
        monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments))

    2.4 Display the output in the following format:

            Example 1:
                loanAmount = $500,000
                loanTermInYears = 30
                loanType = "Fixed"

            Output:
                Your monthly mortgage payment for a 30 Yr. Fixed loan is: $3,496.00


    Ensure that the program accurately calculates the monthly mortgage payment based on the
    specified loan amount, term, and type.
 */