// Interface
interface PaymentService {
    void pay(String upiId, double amount);
    void checkBalance();
}

// Custom Exception 1
class InvalidUPIException extends Exception {
    InvalidUPIException(String message) {
        super(message);
    }
}

// Custom Exception 2
class InvalidAmountException extends Exception {
    InvalidAmountException(String message) {
        super(message);
    }
}

// Custom Exception 3
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String message) {
        super(message);
    }
}

// Wallet Class
class Wallet {
    private String userName;
    private String mobileNumber;
    private double balance;

    // Constructor
    Wallet(String userName, String mobileNumber, double balance) {
        this.userName = userName;
        this.mobileNumber = mobileNumber;
        this.balance = balance;
    }

    // Add money
    void addMoney(double amount) {
        balance = balance + amount;
        System.out.println("Money added: ₹" + amount);
    }

    // Get balance
    double getBalance() {
        return balance;
    }

    // Deduct money
    void deductMoney(double amount) {
        balance = balance - amount;
    }

    void displayUserInfo() {
        System.out.println("User Name: " + userName);
        System.out.println("Mobile Number: " + mobileNumber);
    }
}

// UPI Payment Class
class UPIPayment implements PaymentService {

    private Wallet wallet;

    // Constructor
    UPIPayment(Wallet wallet) {
        this.wallet = wallet;
    }

    // Pay method
    public void pay(String upiId, double amount) {

        try {
            // UPI ID validation using String operations
            if (upiId == null ||
                !upiId.contains("@") ||
                upiId.startsWith("@") ||
                upiId.endsWith("@") ||
                upiId.indexOf("@") != upiId.lastIndexOf("@")) {

                throw new InvalidUPIException("Invalid UPI ID!");
            }

            // Amount validation
            if (amount <= 0) {
                throw new InvalidAmountException(
                    "Payment amount must be greater than zero!"
                );
            }

            // Balance validation
            if (amount > wallet.getBalance()) {
                throw new InsufficientBalanceException(
                    "Insufficient wallet balance!"
                );
            }

            // Deduct amount
            wallet.deductMoney(amount);

            System.out.println("Payment Successful!");
            System.out.println("UPI ID: " + upiId);
            System.out.println("Amount Paid: ₹" + amount);

        } catch (InvalidUPIException e) {
            System.out.println("UPI Error: " + e.getMessage());

        } catch (InvalidAmountException e) {
            System.out.println("Amount Error: " + e.getMessage());

        } catch (InsufficientBalanceException e) {
            System.out.println("Balance Error: " + e.getMessage());

        } finally {
            System.out.println("Transaction process completed.");
        }
    }

    // Check balance
    public void checkBalance() {
        System.out.println("Current Wallet Balance: ₹" + wallet.getBalance());
    }
}

// Main Class
public class Main {
    public static void main(String[] args) {

        // Create Wallet object
        Wallet wallet = new Wallet(
            "Gopi",
            "9876543210",
            5000
        );

        wallet.displayUserInfo();

        // Add money
        wallet.addMoney(1000);

        // Create UPIPayment object and associate Wallet
        UPIPayment payment = new UPIPayment(wallet);

        System.out.println("\n--- Payment 1 ---");
        payment.pay("gopi@upi", 2000);

        System.out.println("\n--- Payment 2 ---");
        payment.pay("invalidupi", 500);

        System.out.println("\n--- Payment 3 ---");
        payment.pay("gopi@upi", -100);

        System.out.println("\n--- Payment 4 ---");
        payment.pay("gopi@upi", 10000);

        // Final balance
        System.out.println("\n--- Final Wallet Details ---");
        payment.checkBalance();
    }
}