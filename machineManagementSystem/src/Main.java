import java.util.Scanner;

class ATM{
    float balance;
    int PIN = 142;

    public void checkPIN(){ //check the entered pin
        System.out.println("Enter your pin: ");
        Scanner sc = new Scanner(System.in);
        int enteredPin = sc.nextInt();

        if(enteredPin == PIN){ //if matches show menu function
            menu();
        } else {
            System.out.println("Enter a valid pin!");
        }
    }

    public void menu() { //functionalities for your ATM class
        System.out.println("Enter your Choice: ");
        System.out.println("1. Check A/C Balance");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. EXIT");

        Scanner sc = new Scanner(System.in);
        int option = sc.nextInt();

        if(option == 1){
            checkBalance(); //balance in your account
        } else if(option == 2){
            withdrawMoney(); //withdraw amount you wish
        } else if(option == 3){
            depositMoney(); //deposit any amount you like
        } else if(option == 4){
            return; //exit the program
        } else {
            System.out.println("Enter a valid option!");
        }
    }
    public void checkBalance(){
        System.out.println("Balance: " + balance);
        menu();
    }
    public void withdrawMoney(){
        System.out.println("Enter Amount to Withdraw: ");
        Scanner sc = new Scanner(System.in);
        float amount = sc.nextFloat();
        if(amount > balance){ //if amount that is withdrawn is over the limit of your balance
            System.out.println("Insufficient Balance!");
        } else { //withdraw amount
            balance = balance - amount;
            System.out.println("Money Withdrawn Successfully!");
        }
        menu();
    }
    public void depositMoney(){
        System.out.println("Enter the Amount: ");
        Scanner sc = new Scanner(System.in);
        float amt = sc.nextFloat();
        balance = balance + amt; //add money to your account balance
        System.out.println("Money Deposited Successfully!");
        menu();
    }
}

public class Main {
    public static void main(String[] args) {

        ATM obj = new ATM();
        obj.checkPIN();
    }
}