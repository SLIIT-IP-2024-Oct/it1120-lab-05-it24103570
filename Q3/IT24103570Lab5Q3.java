import java.util.Scanner;

public class IT24103570Lab5Q3 {

     static final int ROOM_RATE = 48000; 
     static final int MONTH_DAYS = 31;  
     static final int NO_DISCOUNT = 0;
     static final int DISCOUNT_10 = 10;
     static final int DISCOUNT_20 = 20;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input start and end dates
        System.out.print("Enter the start date (1-31): ");
        int startDate = input.nextInt();

        System.out.print("Enter the end date (1-31): ");
        int endDate = input.nextInt();

        // Validate input dates
        if (startDate < 1 || startDate > MONTH_DAYS || endDate < 1 || endDate > MONTH_DAYS) {
            System.out.println("Error: Dates must be between 1 and 31.");
            return;
        }

        if (startDate >= endDate) {
            System.out.println("Error: Start date must be less than the end date.");
            return;
        }

        // Calculate days reserved
        int daysReserved = endDate - startDate;

        // Determine discount rate
        int discountRate;
        if (daysReserved < 3) {
            discountRate = NO_DISCOUNT;
        } else if (daysReserved <= 4) {
            discountRate = DISCOUNT_10;
        } else {
            discountRate = DISCOUNT_20;
        }

        double totalCost = daysReserved * ROOM_RATE;
        double discountAmount = (totalCost * discountRate) / 100;
        double finalAmount = totalCost - discountAmount;

        System.out.println("Number of days reserved: " + daysReserved);
        System.out.println("Total cost before discount: Rs. " + totalCost);
        System.out.println("Discount applied: " + discountRate + "%");
        System.out.println("Total amount to be paid: Rs. " + finalAmount);

        input.close();
    }
}