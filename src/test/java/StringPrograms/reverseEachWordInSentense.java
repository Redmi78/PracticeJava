package StringPrograms;

public class reverseEachWordInSentense {
    public static void main(String[] args) {
        String str = "testing the string programs";
        String result = " ";
        String[] words = str.split("\\s");
        for (int i = words.length - 1; i >= 0; i--) {
            result = result + words[i] + " ";
        }
        System.out.println(result);
    }
}
