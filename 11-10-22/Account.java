public class Account {

    int accountNumber;
    String accountHolderName;
    double balance;

    void setAccountNumber(int an) {
        this.accountNumber = an;
    }

    void setAccountHolderName(String ahn) {
        this.accountHolderName = ahn;
    }

    void setBalance(double b) {
        this.balance = b;   
    }

    int getAccountNumber() {
        return this.accountNumber;
    }


    String getAccountHolderName() {
        return this.accountHolderName;
    }

    double getBalance() {
        return this.balance;
    }

    void showDetails() {
        System.out.println("Account Number: "+" "+ this.accountNumber);
        System.out.println("Account Holder Name: "+" "+ this.accountHolderName);
        System.out.println("Account Balance: "+" "+ this.balance);
    }

    // public static void main(String args[]) {

    //     Account A = new Account();
    //     Account B = new Account();

    //     A.setAccountNumber(123456);
    //     A.setAccountHolderName("Mr Bean");
    //     A.setBalance(152413);
    //     A.showDetails();

    //     B.setAccountNumber(1234567);
    //     B.setAccountHolderName("Charlie Chaplin");
    //     B.setBalance(134654);
    //     B.showDetails();
    // }

}