import java.util.*;
public class GuessingGame{
    public static void main (String args[]){
        int number= ((int)(Math.random()*100));
        int inputnumber=0;
        int count=0;
        do{
            Scanner sc = new Scanner(System.in);
            System.out.println("Guess the number between (1-100)");
            inputnumber = sc.nextInt();
             count = count+1;
            if (inputnumber == number){
                System.out.println("It is a right number");
                break;
            } else if (inputnumber > number) {
                System.out.println("The number is too high");
            } else  {
                System.out.println("The number is too low");
            }
        } while( inputnumber > 0);

        System.out.println("The number is "+number);
        System.out.println("Number of attempts it took to win the game:"+count);
    }
    }
