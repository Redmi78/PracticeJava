package JavaInterViewPrograms;

public class findMissingNumberInAarray {
    public static void main(String args[]) {
        int a[]={1,2,3,5,6};
        int c=a.length+1;
        int sumOfN=c*(c+1)/2; // Formula for sum of first n natural numbers
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=a[i]+sum;
        }

int missingNumber=sumOfN-sum; // The missing number is the difference between the expected sum and the actual sum
        System.out.println("Missing Number"+missingNumber);
    }

}
