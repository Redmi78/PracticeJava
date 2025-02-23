package Keywords;

public class thisKey {

    int x,y;

     thisKey(int x,int y)
    {
     this.x=x;
      this.y=y;

    }

    void display()
    {
        System.out.println(x);
        System.out.println(y);

    }
    public static void main(String[] args) {
thisKey ThisKey = new thisKey(10,20);
ThisKey.display();
    }
}
