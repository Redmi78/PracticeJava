package jatin;

public class missingNumberInAArray {
    public static void main(String[] args) {
        int inputArray[] = {1,2,3,5,6};
        int totalNumbers = 6;
        int sumOfInputArray=(totalNumbers*(totalNumbers+1))/2;
        System.out.println(sumOfInputArray);
int sum=0;
        for(int i=0;i<inputArray.length;i++ )
        {
            sum=sum+inputArray[i];
        }

        System.out.println(sum);

        System.out.println(sumOfInputArray-sum);
    }
}
