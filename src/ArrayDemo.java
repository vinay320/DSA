
import java.util.Scanner;

public class ArrayDemo {
    int[] arr=null;
    public ArrayDemo()
    {
        arr=new int[5];
        for (int i = 0; i <arr.length ; i++)
        {
            arr[i]=Integer.MIN_VALUE;
        }
    }
    public void insert(int val,int index)
    {
        try {
            if(arr[index]==Integer.MIN_VALUE)
            {
                arr[index]=val;
            }
            else {
                System.out.println("NO need");
            }
        }catch (ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Error");
        }
    }
    public void delete(int index)
        {
            for (int i = index; i <arr.length-1 ; i++) {
                arr[i]=arr[i+1];

            }
        }
        void travrse()
        {
            for (int j : arr) {
                {
                    System.out.println(j);
                }
            }
        }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("----------MENU-----------");
        System.out.println("1. For Insertion");
        System.out.println("2. For Deletion");
        int ch=s.nextInt();
        System.out.println("Enter Value:");
        int val=s.nextInt();
        System.out.println("Enter Index:");
        int index=s.nextInt();
        ArrayDemo obj=new ArrayDemo();

        while(ch!=3){
            if(ch==1) {
                obj.insert(val, index);
                obj.travrse();
                ch=s.nextInt();

            }

            else if(ch==2) {
                obj.delete(index);
                obj.travrse();
                ch=s.nextInt();
            }
            else if(ch==3){
                ch=0;
                ch=s.nextInt();
            }
    }



    }
}
