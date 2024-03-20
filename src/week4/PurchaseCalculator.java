package week4;

public class PurchaseCalculator {

    public static void main(String[] args) {

        double salesTaxRate = 8;  //8%    8/100 = 0.08
        String itemName = "Fuji Apple";
        double unitPrice = 1.5;
        int quantity = 5;

        double costBeforeTax = unitPrice * quantity;
        double salesTax = costBeforeTax * salesTaxRate/100;
        double grandTotal = costBeforeTax + salesTax;

        System.out.println("Total cost before tax: $" + costBeforeTax);
        System.out.println("Sales tax: $" + salesTax);
        System.out.println("==========================");
        System.out.println("Grand Total: $" + grandTotal);




    }




}
