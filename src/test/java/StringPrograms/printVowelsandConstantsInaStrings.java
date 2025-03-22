package StringPrograms;

public class printVowelsandConstantsInaStrings {
    public static void main(String[] args) {
        String str = "testing";
        int vcount = 0;
        int ccount = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vcount++;
            } else {
                ccount++;
            }
        }
        System.out.println("Vowels count: " + vcount);
        System.out.println("Constants count: " + ccount);
    }
}
