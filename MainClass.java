import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        AtmOperationInterf op = new AtmOperationImpl();
        int atmNumber = 12345;
        int atmPin = 123;
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to ATM Machine !!!");
        System.out.print("Enter ATM Number: ");
        int enteredAtmNumber = in.nextInt();
        System.out.print("Enter PIN: ");
        int enteredPin = in.nextInt();

        if (atmNumber == enteredAtmNumber && atmPin == enteredPin) {
            while (true) {
                System.out.println("\n1. View Available Balance");
                System.out.println("2. Withdraw Amount");
                System.out.println("3. Deposit Amount");
                System.out.println("4. View Mini Statement");
                System.out.println("5. Exit");
                System.out.print("Enter Choice: ");
                int choice = in.nextInt();

                switch (choice) {
                    case 1:
                        op.viewBalance();
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        double withdrawAmount = in.nextDouble();
                        op.withdrawAmount(withdrawAmount);
                        break;
                    case 3:
                        System.out.print("Enter amount to deposit: ");
                        double depositAmount = in.nextDouble();
                        op.depositAmount(depositAmount);
                        break;
                    case 4:
                        op.viewMiniStatement();
                        break;
                    case 5:
                        System.out.println("Collect your ATM Card\nThank you for using the ATM Machine!");
                        System.exit(0);
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }
        } else {
            System.out.println("Incorrect ATM Number or PIN.");
        }

        in.close();
    }
}
