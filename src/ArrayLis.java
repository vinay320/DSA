import java.util.ArrayList;
import java.util.Scanner;

public class ArrayLis {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int[][] arr=new int[2][n];
        for (int i = 0; i <2 ; i++)
        {
            for (int j = 0; j < n; j++)
            {
                arr[i][j]=s.nextInt();
            }
        }

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<(n);j++)
            {
                System.out.print(" "+arr[i][j]);
            }
            System.out.println();
        }

        ArrayList<Integer> l1=new ArrayList<>();
        ArrayList<Integer> l2=new ArrayList<>();

        for(int i=0;i<2;i++) {
            for (int j = 0; j <n; j++)
            {   int m=arr[i][j];
                if(m% 2 == 0)
                {
                    l1.add(m);
                }
                else if (m%2!=0)
                {
                    l2.add(m);
                }

            }
        }
        System.out.println(l1);
        System.out.println(l2);
    }
}
