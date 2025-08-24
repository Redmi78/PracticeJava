package JavaInterViewPrograms;

public class largestNumber {
    public static void main(String[] args)
    {
        int arr[]={10,20,30,1000,50,60,70,80,90,100};
        int largest = arr[0]; // Assume the first element is the largest
        for(int i=1;i<arr.length;i++)
        {
            if(arr[i]>largest)
            {
                largest = arr[i]; // Update largest if current element is greater
            }
        }
        System.out.println("Largest number in the array is: " + largest);
    }
}
