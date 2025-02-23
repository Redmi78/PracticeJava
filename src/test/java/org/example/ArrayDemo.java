package org.example;

public class ArrayDemo {
    public static void main(String[] args) {
        //approach 1
        int a[] = new int[5];
        a[0] = 1;
        a[1] = 2;
        a[2] = 3;
        a[3] = 4;
        a[4] = 5;
        System.out.println(a.length);
        for (int i = 0; i < a.length; i++) {
            System.out.println("for loop" + a[i]);
        }

        //enhance for loop -for loop
        for (int x : a) {
            System.out.println("enchance for loop" + x);
        }

        //approach 2
        int b[] = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(b.length);
        //Two dimensional array
        int c[][] = new int[2][2];
        c[0][0] = 5;
        c[0][1] = 6;

        c[1][0] = 5;
        c[1][1] = 6;

        System.out.println(c.length);
        System.out.println(c[0].length);


        //approach 2
        int d[][] = {{1, 2, 35}, {5, 865}};

        // Retrieve values using nested loops for a two-dimensional array
        for (int j = 0; j < c.length; j++) { // Iterate through the rows
            for (int k = 0; k < c[j].length; k++) { // Iterate through the columns
                System.out.println("Array d[" + j + "][" + k + "]: " + c[j][k]);
            }


        }

        for (int y[] : c)//rows for arrays why [] -> multiple rows
        {
            for (int z : y) { //colums
System.out.println(z);
            }
        }
        /// Reverse an array
        int[] array1 =new int[]{5,865,84};
      System.out.println("original array is ");
      for(int l=0;l<array1.length;l++)
      {
          System.out.println(array1[l]);
      }

        for(int p=array1.length-1;p>=0;p--)
        {
            System.out.println(array1[p]);
        }

        int m[] = new int[3];
                m[0]=1;
        m[1]=2;
        m[2]=3;
        for(int z=m.length-1;z>=0;z--)
        {
            System.out.println(m[z]);
        }

    }
}