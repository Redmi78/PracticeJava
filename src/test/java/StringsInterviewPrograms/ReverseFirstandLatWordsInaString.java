package StringsInterviewPrograms;

public class ReverseFirstandLatWordsInaString {
    public static void main(String[] args) {
        String str = "abcd";
        char[] c = str.toCharArray();
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (!Character.isLetter(c[left])) {
                left++;
            } else if (!Character.isLetter(c[right])) {
                right--;
            } else {
                char temp = c[left];
                c[left] = c[right];
                c[right] = temp;
                left++;
                right--;
            }
        }
        System.out.println(c);

    }
}
