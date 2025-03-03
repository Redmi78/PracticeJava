package PrimitiveDataTypes;

public class character {
    public static void validateOrderStatus(char status) {
        if (status == 'P' || status == 'C' || status == 'S') {
            System.out.println("Valid order status: " + status);
        } else {
            System.out.println("Invalid order status.");
        }
    }

    public static void main(String[] args) {
        //You want to validate a user's age during registration, ensuring it’s between 0 and 127 (using the byte range).
        //char - Validation for Single Character Data
        //Real-time use: For validating single-character inputs like product sizes, payment status, or user preferences.
        //Example Use Case: Validating order status, ensuring that the order status is within predefined characters like 'P' (Pending), 'C' (Completed), or 'S' (Shipped).
        char validStatus = 'C';  // Completed order status
        validateOrderStatus(validStatus);

        char invalidStatus = 'X';  // Invalid order status
        validateOrderStatus(invalidStatus);


    }
}
