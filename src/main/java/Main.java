import java.util.*;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int number;
        Integer guess;
        Random rn = new Random();
        int guessCounter = 0;
        Integer lastGuess = null;


        number = rn.nextInt(3) + 1;
        System.out.println(number);


        do {

            System.out.print("Guess a number: ");
            guess = in.nextInt();

            if(guess == number ){
                System.out.println("Just Right");
            }else if(guess < number){
                System.out.println("Too small");
            }else {
                System.out.println("Too Large");
            }


            if(guess != lastGuess)
                guessCounter++;

            lastGuess = guess;

            System.out.println("counter: " + guessCounter);
            System.out.println("last: " + lastGuess);

        }while(number != guess);

        System.out.println("number guesses: " + guessCounter );

    }



}




