package WryTMedPharmacy;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class WryTMedPharmacyReceipt {
    WryTMedPharmacy invoice = new WryTMedPharmacy();

    public void displayReceipt() {
        ArrayList<String> items = new ArrayList<>();
        ArrayList<Double> price = new ArrayList<>();
        ArrayList<Integer> qty = new ArrayList<>();
        double total = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter customer's name: ");
        String customerName = scanner.nextLine();
        System.out.print("Enter attendant name: ");
        String attendantName = scanner.nextLine();

        do {
            scanner = new Scanner(System.in);
            System.out.print("Enter item bought: ");
            String item = scanner.nextLine();

            if (item.equals("quit")) {
                break;
            }
            items.add(item);

            int itemQuantity = quantity();
            qty.add(itemQuantity);

            double cusPrice = item.length() + itemQuantity * 50.00;
            price.add(cusPrice);
            total += cusPrice * itemQuantity;
        } while(true);

        invoice.firstDisplay();
        System.out.printf("Customer name: %s%n", customerName);
        invoice.printLine(72);
        invoice.displayTableHeader();
        invoice.printLine(72);
        invoice.displayBody(items, price, qty);
        invoice.printLine(72);
        invoice.printLine(72);
        invoice.lastDisplay(String.valueOf(items), 7.50, (int) (0 * total));
        System.out.printf("You have been served by: %s%n", attendantName);
    }

    public static int quantity() {
        try{
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter quantity: ");
            return scanner.nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Wrong input, try again.");
            quantity();
        }
        return 0;
    }
}
