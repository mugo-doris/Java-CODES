//NAME : Doris Nduta
//REG NO : CT101/G/21006/23
//DATE : 22/01/2025
//ASSIGNMENT : 2

/*Program that calculates discount using a function which is called
in then called in the main function. The program allows user input of the price. */
import java.util.Scanner;
public class Discount {

        public static double getDiscount(double price) {
            double discount = 0.0;

            if (price > 5000) {
                discount = 0.1*price;
                System.out.println("Discount is:" + discount);
             }
             else if (price >= 1000 && price <= 5000) {
                discount = 0.05 * price;
                System.out.println("Discount is:" + discount);
             }
              else {
                System.out.println("No discount");
             }
             return discount;

        }
//main function that outputs discount depending on user input
        public static void main(String[] args) {
             Scanner myScanner = new Scanner(System.in);
            System.out.println("Enter price:");
            double price = myScanner.nextDouble();
            getDiscount(price);

    }
}
