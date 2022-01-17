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

        for (int i = 0; i <5 ; i++) {
            for (int j = 0; j <4 ; j++) {
                if(arr[j].score<arr[j+1].score)
                {
                    GameScore temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j]=temp;
                }

            }

        }

        for (int i = 0; i <5 ; i++) {
            System.out.println(arr[i].name+" "+arr[i].score);

        }

    }
}
