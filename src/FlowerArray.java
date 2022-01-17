import java.util.Scanner;

public class FlowerArray {
    String name;
    int petals;
    float price;

    public FlowerArray(String name,int petals,float price)
    {
        this.name=name;
        this.petals=petals;
        this.price=price;
    }

    public static void main(String[] args) {
        FlowerArray arr[]=new FlowerArray[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5 ; i++) {
            arr[i]=new FlowerArray(s.next(),s.nextInt(),s.nextFloat());
        }

        for (int i = 0; i <5 ; i++) {
            System.out.println(arr[i].name+" "+arr[i].petals+" "+arr[i].price);
        }

    }

}
