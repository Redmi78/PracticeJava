package PrimitiveDataTypes;
//Long - Validation for Extremely Large Values
//Real-time use: For unique identifiers or financial transactions where the number can get very large.
//Example Use Case: Validating the transaction ID or user account balance, where the ID is large and needs to be handled as a long.
public class Longs {

        public static void validateTransactionId(long transactionId) {
            if (transactionId <= 0) {
                System.out.println("Invalid transaction ID.");
            } else {
                System.out.println("Valid transaction ID: " + transactionId);
            }
        }

        public static void main(String[] args) {
            long validTransactionId = 123456789012345L;  // Valid transaction ID
            validateTransactionId(validTransactionId);

            long invalidTransactionId = -1L;  // Invalid transaction ID
            validateTransactionId(invalidTransactionId);
        }
    }



