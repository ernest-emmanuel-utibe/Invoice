import java.time.LocalDateTime;
import java.util.ArrayList;

public class DominoInvoice {
    public void firstDisplay() {
        System.out.println("""
                                        INVOICE
                                CHICKEN REPUBLIC, DOMINO.
                                    E-CENTER, DOMINO PLAZA
                                       SABO, YABA LAGOS
                            Email: e-center@chicken-republic.com
                                Phone No: 08090165901
                            Customer Care Line: 0809 016 5942.           \s
                \n""");
    }

    public void displayTableHeader() {
        LocalDateTime time = LocalDateTime.now();
        System.out.printf("TICKET-ID: S%s - T%-20sDATE: %s%n", time.getSecond(),time.getMinute(),time.toString());
        System.out.printf("%-10s%-35s%-20s%s%n", "QTY", "DESCRIPTION", "PRICE", "AMOUNT");
    }

    public void displayBody(ArrayList<Integer> qty, ArrayList<String> description,
                            ArrayList<Double> price) {
        for (int i = 0; i < qty.size(); i++) {
            System.out.printf("%-10d%-35s%-20.2f%.2f%n", qty.get(i), description.get(i), price.get(i), qty.get(i) * price.get(i));
        }
    }

    public void printLine(int number) {
        System.out.println("*".repeat(number));
    }

    public void lastDisplay(double total, double vat, double conTax) {
        System.out.printf("%35s%20.2f%n", "Sub TOTAL", total);
        System.out.printf("%35s%20.2f%n", "VAT", vat);
        System.out.printf("%35s%20.2f%n", "Consumption Tax", conTax);
        System.out.printf("%35s%20.2f%n", "Total Tax",vat + conTax);
        System.out.println();
        System.out.printf("%35s%20.2f%n", "Total",total + vat + conTax);
        System.out.println();



        System.out.println("""
                                                    *** THANK YOU ***
                                            "O"utstanding "S"ervice "E"verytime
                                                        (OSE)
                                                        
                """);
    }
}
