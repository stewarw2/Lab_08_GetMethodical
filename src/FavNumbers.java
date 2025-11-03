import java.util.Scanner;
public class FavNumbers {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int favNum = SafeInput.getInt(in, "Enter your favorite number: ");
    System.out.println("Your favorite number is " + favNum);
    }
}
