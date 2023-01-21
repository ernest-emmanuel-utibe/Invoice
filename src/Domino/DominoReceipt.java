package Domino;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DominoReceipt {
    DominoInvoice invoice = new DominoInvoice();

    public void displayReceipt() {
        ArrayList<String> product = new ArrayList<>();
        ArrayList<Integer> items = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        double total = 0;
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter customer's name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter seller's name: ");
        String sellerName = scanner.nextLine();

        do {
            scanner = new Scanner(System.in);
            System.out.print("Enter item: ");
            String item = scanner.nextLine();
            product.add(item);
            if (item.equals("quit")) {
                break;
            }
            //System.out.print("Enter quantity: ");
            int itemQuantity = quantity();
            items.add(itemQuantity);
            double price = item.length() + itemQuantity * 50.00;
            prices.add(price);
            total += price * itemQuantity;
        } while (true);

        invoice.firstDisplay();
        System.out.printf("Customer name: %s%n", customerName);
        invoice.printLine(72);
        invoice.displayTableHeader();
        invoice.printLine(72);
        invoice.displayBody(items, product, prices);
        invoice.printLine(72);
        invoice.printLine(72);
        invoice.lastDisplay(total, 7.50, 0.5 * total);
        System.out.printf("You have been served by: %s%n", sellerName);
    }

    public static int quantity() {
        try {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter quantity: ");
            return scanner.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Wrong input, try again");
            quantity();
        }
        return 0;
    }
}
