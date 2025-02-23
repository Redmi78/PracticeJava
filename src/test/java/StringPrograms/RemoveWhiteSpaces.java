package StringPrograms;

public class RemoveWhiteSpaces {
    public static void main(String[] args) {
        String str = "sub ba reddy test ";
       String removeSpace= str.replaceAll(" ","");
       System.out.println(removeSpace);
        String removeSpace1= str.replaceAll("\\s","");
        System.out.println(removeSpace1);
    }
}
