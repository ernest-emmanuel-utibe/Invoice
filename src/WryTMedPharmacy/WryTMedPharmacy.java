package WryTMedPharmacy;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class WryTMedPharmacy {

    public void firstDisplay() {
        System.out.println("""
                \n
                                    
                                    WRYTEMED PHARMACY
                                    87, KARIMU IKOTUN STREET,
                                    OYADIRAN ESTATE SABO,
                                    YABA,
                                    LAGOS.
                                    TEL.: 09093787655.    \s
                \n""");
    }

    public void displayTimeAndDate() {
        LocalDateTime date = LocalDateTime.now();
        System.out.println(date.toString());
    }

    public void displayTableHeader() {
        LocalDateTime date = LocalDateTime.now();
        System.out.printf("TICKET-ID: S%s - T%-20sDATE: %s%n", date.getSecond(),date.getMinute(),date.toString());
        System.out.printf("%-10s%-35s%-20s%s%n", "ITEM", "PRICE", "QTY", "TOTAL");
    }

    public void displayBody(ArrayList<String> item, ArrayList<Double> price,
                            ArrayList<Integer> qty) {
        for (int i = 0; i < item.size(); i++) {
            System.out.printf("%-10s%-35.2f%-20d%.2f%n", item.get(i), price.get(i), qty.get(i), price.get(i) * qty.get(i));
        }
    }

    public void printLine(int number) {
        System.out.println("*".repeat(number));
    }

    public void lastDisplay(String item, double price, int quantity) {
        System.out.println("""
                GOODS PURCHASED IN GOOD CONDITION CANNOT BE RETURNED
                """);
    }
}
