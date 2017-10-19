import java.util.*;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int number;
        boolean correct = false;
        int guess;
        Random rn = new Random();
        int guessCounter = 0;
        int lastGuess = 0;


        number = rn.nextInt(3) + 1;
        System.out.println(number);


        do {

            System.out.print("Guess a number: ");
            guess = in.nextInt();

            lastGuess = guess;

            if(guess == number ){
                System.out.println("Just Right");
            }else if(guess < number){
                System.out.println("Too small");
            }else {
                System.out.println("Too Large");
            }



            guessCounter++;

            System.out.println("counter: " + guessCounter);
            System.out.println("last: " + lastGuess);

        }while(number != guess);

        System.out.println("number guesses: " + guessCounter );

    }



}




