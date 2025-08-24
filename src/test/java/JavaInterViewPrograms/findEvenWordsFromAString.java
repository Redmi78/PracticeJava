package JavaInterViewPrograms;

public class findEvenWordsFromAString {
    public static void main(String args[]) {
        String str = "sky is blue and vast";
      String data[]=  str.split(" ");
      for(String word: data) {
         int wordsLength= word.length();
          if(wordsLength%2==0){
              System.out.println(word);
          }
      }
    }
}
