import java.util.*;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int number;
        int guess;
        ArrayList<Integer> guesses = new ArrayList<Integer>();
        Random rn = new Random();

        number = rn.nextInt(11);

        do {
            System.out.print("Guess a number: ");
            guess = in.nextInt();

            if(!guesses.contains(guess))
                guesses.add(guess);

            if(guess == number ){
                System.out.println("Just Right");
            }else if(guess < number){
                System.out.println("Too small");
            }else {
                System.out.println("Too Large");
            }

        }while(number != guess);

        System.out.println("number guesses: " + guesses.size());

    }













}
