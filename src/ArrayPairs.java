import java.util.Scanner;

public class ArrayPairs {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i]=s.nextInt();
        }
        int count=0;
        int pro=0;
        for (int i = 0; i <n-1 ; i++) {
            pro=arr[i]*arr[i+1];

            if(pro%2!=0)
            {
                count++;
            }

        }
        System.out.println("There are "+count+" no of pairs ");
    }
}
