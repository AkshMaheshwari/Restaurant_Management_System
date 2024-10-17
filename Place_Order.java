import java.util.Scanner;

public class Place_Order {
    public static void takeOrder(Scanner sc, cuisine cuisine, Order order) {
        System.out.println("\nEnter the type of food you want to have:");
        System.out.println("1. Appetizer");
        System.out.println("2. Main Course");
        System.out.println("3. Dessert");

        int foodType = sc.nextInt();
        sc.nextLine();  // Consume newline

        switch (foodType) {
            case 1:
                cuisine.appetizer();
                System.out.println("Enter the number of the appetizer you want to order: ");
                int appetizerChoice = sc.nextInt();
                order.addAppetizer(cuisine.getAppetizerName(appetizerChoice), cuisine.getAppetizerPrice(appetizerChoice));
                break;
            case 2:
                cuisine.Main_course();
                System.out.println("Enter the number of the main course you want to order: ");
                int mainCourseChoice = sc.nextInt();
                order.addMainCourse(cuisine.getMainCourseName(mainCourseChoice), cuisine.getMainCoursePrice(mainCourseChoice));
                break;
            case 3:
                cuisine.Dessert();
                System.out.println("Enter the number of the dessert you want to order: ");
                int dessertChoice = sc.nextInt();
                order.addDessert(cuisine.getDessertName(dessertChoice), cuisine.getDessertPrice(dessertChoice));
                break;
            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 3.");
                break;
        }
    }
}