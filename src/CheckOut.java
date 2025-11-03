import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        boolean done = false;
        double totalCost = 0.0;  // Variable to accumulate the total

        do {
            double cost = SafeInput.getRangedDouble(in, "Enter your item cost: ", (int) .5, (int) 10.00);
            totalCost += cost;  // Add this item's cost to the running total

            System.out.println("Current total: $" + String.format("%.2f", totalCost));

            done = !SafeInput.getYNConfirm(in, "Do you have more items? ");

        } while (!done);

        // Display final total
        System.out.println("\n--- Final Total ---");
        System.out.println("Total cost of all items: $" + String.format("%.2f", totalCost));
    }
}
