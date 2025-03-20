package StringPrograms;

public class findWordInaStrings {
    public static void main(String[] args) {
        String str = "subbareddy";
        String word = "reddy";
        if (str.contains(word)) {
            System.out.println("Word is present in the string");
        } else {
            System.out.println("Word is not present in the string");
        }
    }
}
