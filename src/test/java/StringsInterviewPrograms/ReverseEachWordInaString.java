package StringsInterviewPrograms;

public class ReverseEachWordInaString {
    public static void main(String[] args) {
        String sentence = "Hello world";
        String[] words = sentence.split(" ");
        String result = "";


        for (int i = 0; i < words.length; i++) {
            String reversedWord = "";
            for (int j = words[i].length() - 1; j >= 0; j--) {
                reversedWord = reversedWord + words[i].charAt(j);
            }
            result =result + reversedWord + " ";
        }

        System.out.println(result);
    }
}