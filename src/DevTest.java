import java.util.Scanner;
public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);

        // test for getNonZeroLenString
        String name = getNonZeroLenString(in, "Enter your name: ");
        System.out.println("Hello " + name);

        // 2nd test for the SafeInput library file:
        name = getNonZeroLenString(in, "Enter your name: ");
        System.out.println("Hello " + name);

        // test for getInt
        int age = getInt(in, "Enter your age: ");
        System.out.println("You are " + age + " years old.");

        // 2nd test for the SafeInput library file:
        age = SafeInput.getInt(in, "Enter your age: ");
        System.out.println("You are " + age + " years old.");

        // test for getDouble
        double weight = getInt(in, "Enter your weight: ");
        System.out.println("You are " + weight + " pounds.");

        // 2nd test for the SafeInput library file:
        weight = getInt(in, "Enter your weight: ");
        System.out.println("You are " + weight + " pounds.");

        // test for getRangedInt
        int grade = getRangedInt(in, "Enter your grade ", 0, 100);
        System.out.println("You have a grade of " + grade + "%");

        // 2nd test for the SafeInput library file:
        grade = getRangedInt(in, "Enter your grade ", 0, 100);
        System.out.println("You have a grade of " + grade + "%");

        // test for getRangedDouble
        double weight2 = getRangedDouble(in, "Enter your weight: ", 0, 1000);
        System.out.println("You are " + weight2 + " pounds.");

        // 2nd test for the SafeInput library file:
        weight2 = getRangedDouble(in, "Enter your weight: ", 0, 1000);

        // test for getYNConfirm
        boolean result = getYNConfirm(in, "Do you want to continue? ");
        System.out.println("You entered: " + (result ? "True" : "False"));

        // 2nd test for the SafeInput library file:
        result = getYNConfirm(in, "Do you want to continue? ");
        System.out.println("You entered: " + (result ? "True" : "False"));

        // test for getRegExString
        String regex = getRegExString(in, "Do you agree to the terms of service? ");
        System.out.println("You entered: " + regex);

        // 2nd test for the SafeInput library file:
        regex = getRegExString(in, "Do you agree to the terms of service? ");
        System.out.println("You entered: " + regex);

    }
    // Code for the library methods goes here to be tested
    // then is copied or moved to SafeInput.java

/**
 * A method that prompts for and returns a string response with at least one character
 * @param pipe the Scanner to use for input
 * @param prompt the prompt to display to the user
 * @return a String response that is not zero length
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
/**
 * A method that prompts for and returns an integer value
 * @param pipe the Scanner to use for input
 * @param prompt the prompt to display to the user
 * @return any integer
 */

    public static int getInt(Scanner pipe, String prompt)
    {
        int retInt = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt);
            if(pipe.hasNextInt())
            {
                retInt = pipe.nextInt();
                pipe.nextLine();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid integer, not: " + trash);
            }
        } while (!done);
        return retInt;
    }

    public static double getDouble(Scanner pipe, String prompt)
    {
        double retVal = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.print("\n" + prompt);
            if (pipe.hasNextDouble())
            {
                retVal = pipe.nextDouble();
                done = true;
            }
            else
            {
                trash = pipe.nextLine();
                System.out.println("You must enter a valid double, not: " + trash);
            }
        } while (!done);
        return retVal;
    }

/**
 * a method that prompts for and returns an integer value within a specified range
 * @param pipe
 * @param prompt
 * @param low
 * @param high
 * @return an integer value between low and high
 */
public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {
        int retInt = 0;
        String trash = "";
        boolean done = false;

        do {
            System.out.println("\n" + prompt + "[" + low + " - " + high + "]: ");
            if (pipe.hasNextInt()) {
                retInt = pipe.nextInt();
                pipe.nextLine();
                if (retInt < low || retInt > high) {
                    System.out.println("You must enter a valid integer, not: " + retInt);
                } else if (retInt > low || retInt < high) {
                    done = true;
                }
            }
            else
                {
                    trash = pipe.nextLine();
                    System.out.println("You must enter a valid integer, not: " + trash);
                }

        } while (!done);
        return retInt;
    }

    /**
 * a method that prompts for and returns a double value within a specified range
 * @param pipe
 * @param prompt
 * @param low
 * @param high
 * @return an integer value between low and high
 */
public static double getRangedDouble(Scanner pipe, String prompt, int low, int high) {
    double retVal = 0;
    String trash = "";
    boolean done = false;

    do {
        System.out.println("\n" + prompt + "[" + low + " - " + high + "]: ");
        if (pipe.hasNextDouble()) {
            retVal = pipe.nextDouble();
            pipe.nextLine();
            if (retVal < low || retVal > high) {
                System.out.println("You must enter a valid integer, not: " + retVal);
            } else if (retVal > low || retVal < high) {
                done = true;
            }
        }
        else
        {
            trash = pipe.nextLine();
            System.out.println("You must enter a valid double, not: " + trash);
        }

    } while (!done);
    return retVal;
}

/**
* a method that gets a Yes or No returning true for yes and false for no
 * @param pipe
 * @param prompt
 * @return a valid string response from the user
 */
public static boolean getYNConfirm(Scanner pipe, String prompt) {
    boolean retVal = false;
    String input = "";
    boolean done = false;

    do {
        System.out.println("\n" + prompt + "[Y/N]: ");
        input = pipe.nextLine().trim().toUpperCase();
        if (input.equals("Y")) {
            retVal = true;
            done = true;
        } else if (input.equals("N")) {
            retVal = false;
            done = true;
        } else {
            System.out.println("You must enter Y or N, not: " + input);
        }
    } while (!done);
    return retVal;
}

/**
 * a method that prompts a user to input a String that matches a regular expression
 *
 * @param pipe
 * @param prompt
 * @return a valid string response from the user
 */
public static String getRegExString(Scanner pipe, String prompt) {
    boolean done = false;
    String input = "";
    String regex = "";
    do {
        System.out.println("\n" + prompt);
        input = pipe.nextLine();


        if (input.matches(regex)) {
            done = true;
        } else {
            System.out.println("You must input based on the format in the prompt, not input: " + input);
        }
    } while (!done);
    return input;
}


