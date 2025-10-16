import java.util.Scanner;

public class SafeInput {
    // Static methods definitions go here
    // Are called SafeInputs.METHODNAME

    /**
     * A method that prompts for and returns a string response with at least one character
     * @param pipe the Scanner to use for input
     * @param prompt the prompt to display to the user
     * @return a non-empty String
     */

    public static String getNonZeroLenString(Scanner pipe, String prompt)
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
}

