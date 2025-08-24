package JavaInterViewPrograms;

public class removeAllZerotoEnd {
    public static void main(String args[]) {
        int a[] ={1,0,2,0,3,0,4,5,0};

        int temp;
        int nonzeroValue=0;
        for(int i=0;i<=a.length-1;i++)
        {
            if(a[i]!=0)
            {
                temp=a[nonzeroValue];
                a[nonzeroValue]=a[i];
                a[i]=temp;
                nonzeroValue++;
            }
        }

        for(int no :a)
        {
            System.out.print(no+" ");
        }

    }
}
