package Arras;

public class smallestandlargest {
    public static void main(String[] args) {
        int[] a ={1,15,18,30};
        int largest = a[0];
        int smallest = a[0];
        for(int i=0;i<a.length;i++)
        {
            if(a[i]>largest)
            {
                largest=  a[i];

            }
            if(a[i]<smallest)
            {
                smallest=  a[i];

            }
        }
        System.out.println("largest"+largest);
        System.out.println("smallest"+smallest);
    }
}
