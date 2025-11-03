import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String ssn = SafeInput.getRegExString(in, "Enter your Social Security Number [000-00-0000]: ", "^\\d{3}-\\d{2}-\\d{4}$");
        System.out.println("Your SSN is: " + ssn);

        String mNumber = SafeInput.getRegExString(in, "Enter your university M number [M00000000]: ", "^(M|m)\\d{8}$");
        System.out.println("Your M number is: " + mNumber);

        String OSVQ = SafeInput.getRegExString(in, "Would you like to Open Save View or Quit? [O/S/V/Q]: ", "^[OoSsVvQq]$");
        if (OSVQ.equalsIgnoreCase("O")) {
            System.out.println("You've chosen to open.");
        }
        else if (OSVQ.equalsIgnoreCase("S")) {
            System.out.println("You've chosen to save.");
        }
        else if (OSVQ.equalsIgnoreCase("V")) {
            System.out.println("You've chosen to view.");
        }
        else if (OSVQ.equalsIgnoreCase("Q")) {
            System.out.println("You've chosen to quit.");
        }
    }
}
