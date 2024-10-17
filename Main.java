import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Order order = new Order();

        boolean keepOrdering = true;

        while (keepOrdering) {
            System.out.println("\nWelcome to the Multi-Cuisine Restaurant!");
            System.out.println("Please choose a cuisine:");
            System.out.println("1. Rajasthani");
            System.out.println("2. Tamil Nadu");
            System.out.println("3. Maharashtran");
            System.out.println("4. Punjabi");

            int cuisineChoice = sc.nextInt();
            cuisine selectedCuisine;

            // Determine which cuisine the user selected
            switch (cuisineChoice) {
                case 1:
                    selectedCuisine = new Rajasthani();
                    break;
                case 2:
                    selectedCuisine = new TamilNadu();
                    break;
                case 3:
                    selectedCuisine = new Maharastran();
                    break;
                case 4:
                    selectedCuisine = new Punjabi();
                    break;
                default:
                    System.out.println("Invalid choice. Exiting...");
                    return;
            }

            // Take order for the selected cuisine
            Place_Order.takeOrder(sc, selectedCuisine, order);

            System.out.println("\nWould you like to order more? (yes/no)");
            String choice = sc.next();
            keepOrdering = choice.equalsIgnoreCase("yes");
        }

        // Show the bill after the order is complete
        Pay_Bill.showBill(order);

        sc.close();
    }
}
