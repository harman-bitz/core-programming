import java.util.*;
public class UnitPriceQuantity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the unitPrice :");
        double unitPrice = sc.nextDouble();
        System.out.println("Enter the quantity :");
        int quantity = sc.nextInt();


        double totalPrice = unitPrice * quantity;

        System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity +"and unit price is INR "+unitPrice);

        sc.close();
    }
}
