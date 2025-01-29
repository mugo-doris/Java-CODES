//NAME : Doris Nduta 
//REG NO : CT101/G/21006/23
//DATE : 22/01/2025
//ASSIGNMENT : 1

/*Program that calculate the net bonus amount of an employee based on the number of years of 
service.The program should prompt the user to enter the salary and the number of years of service.*/

import java.util.Scanner;
class bonus {
    public static void main(String[]args){
        
        //prompt the user to enter the salary and the number of years of service
        Scanner myCompute = new Scanner(System.in);
        System.out.println("Enter salary:");
         System.out.println("Enter years of service:");
        int salary = myCompute.nextInt();
        int yearsOfService = myCompute.nextInt();

        //calculate the bonus based on the number of years of service
        if(yearsOfService>10){
            double bonus = 0.12*salary;
            System.out.println("Your bonus is:"+bonus);
        }
        else if(yearsOfService<=6 && yearsOfService<=10){
            double bonus = 0.1*salary;
            System.out.println("Your bonus is:"+bonus);
        }
        else if(yearsOfService<6){
            double bonus = 0.08*salary;
            System.out.println("Your bonus is:"+bonus);
        }
        
    }
}