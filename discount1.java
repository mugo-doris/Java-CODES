//NAME : Doris Nduta
//REG NO : CT101/G/21006/23
//DATE : 22/01/2025
//ASSIGNMENT : 2

/*Program that calculate discount according to the value
 assigned to the price variable. The program uses functions
  where the function is called in the main function. */
public class discount1 {
    public static double getDiscount(double price) {
        double discount = 0;

        if (price > 5000) {
            discount = 0.1 * price;
        } else if (price >= 1000 && price <= 5000) {
            discount = 0.05 * price;
        } else {
            discount = 0;
        }
        return discount;
    }
/*main function that outputs the calculated discount
 according to the value assigned to variable price */
    public static void main(String[] args) {
        double price = 10000;
        double discount = getDiscount(price);
        System.out.println("Discount is: " + discount);
    }
}