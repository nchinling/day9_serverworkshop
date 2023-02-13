package sg.edu.nus.iss.app;


import java.util.Random;
import java.util.Scanner;




public final class App 
{   private App(){

    }   
    public static void main( String[] args )
    {
        Random random = new Random();

        Integer randomNumber = random.nextInt(100);

        //store my guess
        Integer myGuess = 0;

        //input from keyboard
        //convert to expect from inputstream  if it's a socket app.
        System.out.println("Enter a number:");
        Scanner scanner = new Scanner(System.in);

        //allow user to guess until tney got the random number correct. 
        while(myGuess != randomNumber){
            myGuess = scanner.nextInt();

            if(myGuess < randomNumber){
                System.out.println("Your guess is lower. ");
            }
            else if (myGuess > randomNumber){
                System.out.println("Your guess is higher. ");
            } 
            else{
                 System.out.println("It is correct! ");
                 scanner.close();
            }
        }
    }
}
