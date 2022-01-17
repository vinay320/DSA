import java.util.Arrays;
import java.util.Scanner;

public class GameScore {
    String name;
    int score;


    public GameScore(String name,int score)
    {
        this.name=name;
        this.score=score;
    }

    public static void main(String[] args) {
        GameScore[] arr= new GameScore[5];
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 5 ; i++) {
            arr[i]=new GameScore(s.next(),s.nextInt());
        }
        int arr1[]=new int[5];

        for (int i = 0; i <5 ; i++) {
            arr1[i]=arr[i].score;
        }
        Arrays.sort(arr1);

        for (int i = 0; i <5 ; i++)
        {   int am=arr1[i];
            for (int j=0;j<5;j++){
            if(arr[j].score==am)
                {
                    System.out.println(arr[j].name + " " + arr[j].score);
                }
            }
        }

    }
}
