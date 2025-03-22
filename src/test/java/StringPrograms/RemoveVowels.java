package StringPrograms;

public class RemoveVowels {
    public static void main(String[] args) {
        String str = "testing the string programs";
        String str1 = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(str1);
    }
}
