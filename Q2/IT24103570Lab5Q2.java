import java.util.Scanner;

public class IT24103570Lab5Q2{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of new members introduced (>= 0): ");
        int newMembers = scanner.nextInt();

        if (newMembers < 0) {
            System.out.println("Invalid input. The number of new members should be 0 or greater.");
        } else {
                        String prize;
            switch (newMembers) {
                case 0:
                    prize = "No Prize";
                    break;
                case 1:
                    prize = "Pen";
                    break;
                case 2:
                    prize = "Umbrella";
                    break;
                case 3:
                    prize = "Bag";
                    break;
                case 4:
                    prize = "Travelling Chair";
                    break;
                default:
                    prize = "Headphone";
            }

              System.out.println("Prize: " + prize);
        }

        scanner.close();
    }
}