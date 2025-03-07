package ConditionsLoops;

public class loops {
    public static void main(String[] args) {
for(int i=0;i<=5;i++)
{
    System.out.println(i);
}
int[] ids= {1,2,3,4,5};
for( int id: ids)
{
    System.out.println(id);
}

/// the while and do-while loops are used to execute a block of code repeatedly as long as a specified condition is true
int j=2;
while(j>5)
        {
            System.out.println("inside while"+ j);
            j++; //// Incrementing j to avoid infinite loop
        }
do{
    System.out.println("inside do while" + j);
    j++;// Incrementing j to avoid infinite loop
}while(j>=5);
    }
}
