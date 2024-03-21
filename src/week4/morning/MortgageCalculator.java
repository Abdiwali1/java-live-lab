package week4.morning;

public class MortgageCalculator {

    public static void main(String[] args) {

        double loanAmount = 500000;
        int loanTermInYears = 15;
        String loanType = "FHA";
        double rate = 7.5;

        if(loanType == "Fixed"){
            if(loanTermInYears == 30){
                rate = 7.5 / 100;
            }else{ //15
                rate = 6.9 / 100;
            }
        } else if (loanType == "FHA") {
            if(loanTermInYears == 30){
                rate = 7.24 / 100;
            }else{
                rate = 6.62 / 100;
            }
        } else {
            if(loanTermInYears == 30){
                rate = 6.75 / 100;
            }else{
                rate = 5.99 / 100;
            }
        }

        // rate == 6.75
        double monthlyInterestRate = rate / 12;
        int numberOfPayments = loanTermInYears * 12;
        double monthlyPayment = (loanAmount * monthlyInterestRate) / (1 - Math.pow(1 + monthlyInterestRate, -numberOfPayments));
        monthlyPayment = Math.round(monthlyPayment);
        System.out.println("Your monthly mortgage payment for a " + loanTermInYears +" Yr. " + loanType + " loan is: $" + monthlyPayment);




    }
}
