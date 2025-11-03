import java.util.Scanner;
void main() {
    String name = SafeInput.getNonZeroLenString(new Scanner(System.in), "Enter your name: ");
    System.out.println("Hello " + name);

}