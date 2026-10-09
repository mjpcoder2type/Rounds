import java.util.Scanner;
// A little game I will call Rounds
// Author : mjpcoder_type@outlook.com
// 10/9/2026   Total time to completion: 2 hrs
// Version 1.0
public class RoundsGame
{
    static int DoAdd(int PassedValue)
    {
        return PassedValue + 2000;
    }
    static int DoSub(int PassedValue)
    {
        return PassedValue - 2025;
    }
    static int DoMult(int PassedValue)
    {
        return PassedValue*500;
    }
    static int DoDiv(int PassedValue)
    {
        return PassedValue/60;
    }
    public static void main(String[] args)
    {
        Scanner RoundsScanner = new Scanner(System.in);
        System.out.println("Welcome to the game I love to call Rounds!");
        System.out.println("You'll be prompted for a number!");
        System.out.println("And the Rounds will begin!");
        System.out.println("One last thing...numbers only...they are to have NO decimal pointers!");
        try{
            Thread.sleep(2000);
        } catch (InterruptedException e)
        {
            Thread.currentThread().interrupt();
        }
        System.out.println("Let the games begin!");
        try{
            Thread.sleep(2500);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }

        System.out.println("Enter a numnber:");
        int FirstReadNumber = RoundsScanner.nextInt();
        int FirstReadMultByTwo = FirstReadNumber*2;
        System.out.println("Nice! Something happened to that number behind the scenes.");
        System.out.println("I'll keep that close to my vest for now!");
        System.out.println("Enter another number!");
        int SecondReadNumber = RoundsScanner.nextInt();
        int SecondMultByTwoAddFirstRead = ((SecondReadNumber*FirstReadMultByTwo)*2)+FirstReadNumber;
        System.out.println("Wait a minute....something else happened!  This is wild!");
        try{
            Thread.sleep(1500);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("Hey....for some fun.  Take a guess at what the number up to this point might be!");
        int NumberGuess = RoundsScanner.nextInt();
        if(NumberGuess == SecondMultByTwoAddFirstRead)
        {
            System.out.println("You are correct!  You had to be psychic or have read the source Java file to know that!  Either way?  Kickass!  Java is pretty cool to program!");
        } else {
            System.out.println("No deal!  On to the next one!");
        }
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("It's early in this game...but you can leave now if you wish...enter Y to leave or any other key to continue.  Hit enter after giving your choice!");
        char ProceedOrLeave = RoundsScanner.next().charAt(0);
        if (ProceedOrLeave == 'Y' || ProceedOrLeave == 'y')
        {
            System.exit(0);
        } else {
            System.out.println("Let's continue:");
        }
        try{
            Thread.sleep(1000);
        } catch (InterruptedException e){
            Thread.currentThread().interrupt();
        }
        System.out.println("Glad you stuck around.  We will do one last thing before leaving!");
        System.out.println("Make a choice!  The numbers provided so far will be used to either multiply,divide,add or subtract from a hidden number.  The result will be given and the game will cease!");
        System.out.println("Enter a single digit from these choices: 1. Multiplication 2. Division 3. Addition 4. Subtraction");
        int ChoiceForProvidedForGameEnd = RoundsScanner.nextInt();
        switch (ChoiceForProvidedForGameEnd)
        {
            case 1:
                int MultResult = DoMult(SecondMultByTwoAddFirstRead);
                System.out.println(MultResult);
                break;
            case 2:
                int DivResult = DoDiv(SecondMultByTwoAddFirstRead);
                System.out.println(DivResult);
                break;
            case 3:
                int AddResult = DoAdd(SecondMultByTwoAddFirstRead);
                System.out.println(AddResult);
                break;
            case 4:
                int SubResult = DoSub(SecondMultByTwoAddFirstRead);
                System.out.println(SubResult);
                break;
            default:
                System.out.printf("You gave an incorrect response!  The final untouched value is:%d",SecondMultByTwoAddFirstRead);

        }






        RoundsScanner.close();
        
    }
}