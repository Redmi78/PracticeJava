package JavaInterViewPrograms;

public class secondLargestNumber {
    public static void main(String args[]) {
        int a[] ={1,3,-2,7,5};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int number:a)
        {
            if(number > largest) {
                secondLargest = largest; // Update second largest before largest
                largest = number; // Update largest
            } else if(number > secondLargest && number != largest) {
                secondLargest = number; // Update second largest if it's not equal to largest
            }
        }
        System.out.println("Second largest number is: " + secondLargest);
    }

    }


