import java.util.Scanner;

public class MrBean {
    public static void main(String[] args) {
        int a;
        Scanner s=new Scanner(System.in);
        a=s.nextInt();
        int f=1;
        while(a>1)
        {
            f=f*(a);
            a=a-1;
        }
        System.out.println(f);
        int count=0;
        while(f>0)
        {
            int n=f%10;
            if(n==0)
            {
                count++;
            }
            else
            {
                break;
            }
            f=f/10;
        }
        System.out.println(count);
    }
}
