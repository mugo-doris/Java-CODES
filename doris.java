import java.util.Scanner;

public class doris {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter name:");
        String name = myScanner.nextLine();
        System.out.println("Name is:" + name);

        System.out.println("Enter age:");
        int age = myScanner.nextInt();
        System.out.println("Age is:" + age);

        System.out.println("Enter salary:");
        double salary = myScanner.nextDouble();
        System.out.println("Salary is:" + salary);

        System.out.println("Working (true/false):");
        boolean working = myScanner.nextBoolean();
        System.out.println("Working status:" + working);


    }
}