package StringPrograms;

public class findlast4chars {
    public static void main(String[] args) {
        String str ="subbareddy";
        String firstfour = str.substring(0,4);
        System.out.println(firstfour);
        String lastfour = str.substring(str.length()-4);
        System.out.println(lastfour);
    }
}
