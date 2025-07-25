package mini_projects;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class String_operations {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList<>();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Insert");
            System.out.println("2. Search");
            System.out.println("3. Delete");
            System.out.println("4. Display");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice;
            if (sc.hasNextInt()) {
                choice = sc.nextInt();
                sc.nextLine(); // Clear buffer
            } else {
                System.out.println("Invalid input. Please enter a number.");
                sc.nextLine(); // Discard invalid input
                continue;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the item to insert: ");
                    String item = sc.nextLine();
                    list.add(item);
                    System.out.println("Item added successfully.");
                    break;

                case 2:
                    System.out.print("Enter the item to search: ");
                    String searchItem = sc.nextLine();
                    if (list.contains(searchItem)) {
                        System.out.println("Item found in the list.");
                    } else {
                        System.out.println("Item not found in the list.");
                    }
                    break;

                case 3:
                    System.out.print("Enter the item to delete: ");
                    String deleteItem = sc.nextLine();
                    if (list.remove(deleteItem)) {
                        System.out.println("Item deleted successfully.");
                    } else {
                        System.out.println("Item does not exist.");
                    }
                    break;

                case 4:
                    if (list.isEmpty()) {
                        System.out.println("List is empty.");
                    } else {
                        System.out.println("Items in the list:");
                        for (String s : list) {
                            System.out.println("- " + s);
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
