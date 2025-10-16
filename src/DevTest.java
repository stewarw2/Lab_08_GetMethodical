import java.util.Scanner;
public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        // test for getNonZeroLenString
        String name = getNonZeroLenString(in, "Enter your name: ");
        System.out.println("Hello " + name);
    }
    // Code for the library methods goes here to be tested
    // then is copied or moved to SafeInput.java

/**
 * A method that prompts for and returns a string response with at least one character
 * @param pipe the Scanner to use for input
 * @param prompt the prompt to display to the user
 * @return
 */

public static String getNonZeroLenString(Scanner pipe,String prompt)
    {
        String retString = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt);
            retString = pipe.nextLine();

            if (retString.isEmpty())
            {
                System.out.println("You must enter at least one character");
            }
        } while (retString.isEmpty());
        return retString;
    }