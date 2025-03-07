package Arras;

public class DemoArrays {
    public static void main(String[] args) {

        //array can same type of data
        int[] myArray = new int [5];
        String[] myArray2 = new String[5];
        myArray[0] = 1;
        myArray[1] = 2;
        myArray[2] = 3;
        myArray[3] = 4;
        myArray[4] = 5;
        System.out.println(myArray[1]);

        for(int i=0;i<myArray.length;i++)
        {
            System.out.println(myArray[i]);
        }
        for(int j:myArray)
        {
            System.out.println(j);
        }
        /// /two dimensional
        int[][] test = new int[2][2];
        test[0][0] = 11;
        test[1][0] = 12;
        test[1][1] = 11;
        System.out.println("print1" + " " +test.length);
        System.out.println("print2" + " " + test[1].length);


    }
}
