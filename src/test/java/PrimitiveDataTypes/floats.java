package PrimitiveDataTypes;

public class floats {
    public static void validateDiscount(float discount) {
        if (discount < 0 || discount > 100) {
            System.out.println("Invalid discount. Discount should be between 0% and 100%.");
        } else {
            System.out.println("Valid discount: " + discount + "%");
        }
    }
//float - Validation for Approximate Numeric Values
//Real-time use: For validating discount percentages, tax rates, or shipping charges where small precision is acceptable.
//Example Use Case: Validating a discount rate to ensure it's within an acceptable range (e.g., between 0% and 100%).
    //It can store up to 7 decimal digits of precision.
public static void main(String[] args) {
    float validDiscount = 25.5656878963258f;  // Valid discount
    validateDiscount(validDiscount);

    float invalidDiscount = 150.0f;  // Invalid discount
    validateDiscount(invalidDiscount);

}
}
