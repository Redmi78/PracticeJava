package PrimitiveDataTypes;

public class Ints {
    public static void validatePrice(int price) {
        if (price < 1 || price > 10000) {
            System.out.println("Invalid price. Price should be between 1 and 10,000.");
        } else {
            System.out.println("Valid price: $" + price);
        }
    }
        public static void main(String[] args) {
            //Validating a product price to ensure it falls within an acceptable range (e.g., between $1 and $10,000)

            int validPrice = 500;  // Valid price
            validatePrice(validPrice);

            int invalidPrice = 15000;  // Invalid price
            validatePrice(invalidPrice);

        }
    }

