package PrimitiveDataTypes;

public class Doubles {
    public static void validateOrderTotal(double totalAmount){
        if (totalAmount < 0) {
            System.out.println("Invalid order total. Amount cannot be negative.");
        } else {
            System.out.println("Valid order total: $" + totalAmount);
        }
    }

    public static void main(String[] args) {
        //double - High Precision Validation for Financial Calculations
//Real-time use: For high precision financial calculations, such as validating order totals, shipping charges, or customer balance.
//It can store up to 15 decimal digits of precision.
        double validTotal = 299.99;  // Valid order total
        validateOrderTotal(validTotal);

        double invalidTotal = -50.0;  // Invalid order total
        validateOrderTotal(invalidTotal);

    }
}
