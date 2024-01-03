import java.util.*;
import java.util.Scanner;
import java.util.Random;

public class RandomNumber{
    public static void main(String[] args)
    {
        Random rand = new Random();
        int hiddenNo = rand.nextInt(100);
        Scanner sc = new Scanner(System.in);
        
        do{
            System.out.print("Enter How Many Attempt You Want To Take = ");
            int totalAttempt = sc.nextInt();
            for(int i = 0; i<totalAttempt; i++)
            {
                System.out.print("Enter Your "+(i+1)+" Guess = ");
                int guessNo = sc.nextInt();
                if(hiddenNo == guessNo){
                    System.out.println("Your Guess is Correct");
                    System.out.println("Your Score is "+((float)(i+1)/totalAttempt*100)+" Out of 100");
                    break;
                }
                System.out.println("Your Guess is Wrong");
                if(hiddenNo < guessNo){
                    System.out.println("Your Guess Number is High");
                }
                else{
                    System.out.println("Your Guess Number is Low");
                }

                if(i == totalAttempt-1){
                    System.out.println("Your All Guess is Wrong. The Number is "+hiddenNo+"\nBetter Luck Next Time");
                }
            }
            System.out.print("If You Want to Play Again (Y/N) : ");
            String choice = sc.next();
            if(choice.equals("N") || choice.equals("n"))
                break;
        }while(true);
    }
}