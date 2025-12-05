package jatin;

public class practiceProgram {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        for(int b:a)
        {
            System.out.println(b);
        }
        int sum=0;
        for(int i=0;i<a.length;i++)
        {
            sum=sum+a[i];
        }

        System.out.println(sum);
    }
}
