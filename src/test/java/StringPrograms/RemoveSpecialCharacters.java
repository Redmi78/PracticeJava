package StringPrograms;

public class RemoveSpecialCharacters {
    public static void main(String[] args) {
        String str = "Hello, World! @2025#";

        // Regular expression to match all non-alphanumeric characters
        String cleanedStr = str.replaceAll("[^a-zA-Z0-9]", "");

        System.out.println("String after removing special characters: " + cleanedStr);

        //Remove alphates and numbers
        String cleanedStr1 = str.replaceAll("[a-zA-Z0-9]", "");
        System.out.println("String after removing special characters: " + cleanedStr1);
    }
}