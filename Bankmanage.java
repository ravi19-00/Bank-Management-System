import java.util.Scanner;
class Banking
{
    private long accno;
    private String name1;
    private String name2;
    private String acc_type;
    private long balance;
    Scanner sc = new Scanner(System.in);
    public void setaccount() {
        System.out.print("Enter Account No: ");
        accno = sc.nextLong();
        System.out.print("Enter Account type: ");
        acc_type = sc.next();
        System.out.print("Enter First Name: ");
        name1 = sc.next();
        System.out.print("Enter Last Name: ");
        name2 = sc.next();
        System.out.print("Enter Balance: ");
        balance = sc.nextLong();
    }
    public void showaccount() {
        long acn;
        System.out.println("Enter the Account no. to match");
        acn=sc.nextLong();
        if(acn==(accno)){
            System.out.println("Account Details are :");
            System.out.println("Name of account holder: " + name1+" "+name2);
            System.out.println("Account no.: " + accno);
            System.out.println("Account type: " + acc_type);
            System.out.println("Balance: " + balance);
        }
        else{
            System.out.println("OOPs! Account number not matched. \nTry again");
        }
    }
    public void deposit() {
        long amt;
        long acn;
        System.out.println("Enter the Account no. for deposit");
        acn=sc.nextLong();
        if(acn==(accno)){
            System.out.println("Enter the amount you want to deposit: ");
            amt = sc.nextLong();
            if(amt<0){
                System.out.println("Not permitted.... Enter only positive number");
            }
            else{
                balance = balance + amt;
                System.out.println("Amount deposited....");
                System.out.println("Balance after deposit: "+balance);
            }
        }
        else{
            System.out.println("OOPs! Account number not found. \nTry again");
        }
    }
    public void withdrawal() {
        long amt;
        long acn;
        System.out.println("Enter the Account no. to match");
        acn=sc.nextLong();
        if(acn==(accno)){
            System.out.println("Enter the amount you want to withdraw: ");
            amt = sc.nextLong();
            if(amt<0){
                System.out.println("Not permitted.... Enter only positive number");
            }
            else{
                if (balance >= amt) {
                    balance = balance - amt;
                    System.out.println("Amount withdrawn....");
                    System.out.println("Balance after withdrawal: " + balance);
                }
                else {
                    System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
                }
            }
        }
        else{
            System.out.println("OOPs! Account number not matched. \nTry again");
        }

    }
    public void transfer(){
        long amt;
        long acn;
        System.out.println("Enter the Account no. to match");
        acn=sc.nextLong();
        if(acn==(accno)){
            long acno;
            System.out.println("Enter the account no. where to transfer");
            acno=sc.nextLong();
            System.out.println("Enter the amount you want to transfer: ");
            amt = sc.nextLong();
            if(amt<0){
                System.out.println("Not permitted.... Enter only positive number");
            }
            else{
                if (balance >= amt) {
                    balance = balance - amt;
                    System.out.println("Amount transfered....");
                    System.out.println("Balance after transfer: " + balance);
                } else {
                    System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );
                }
            }
        }

        else{
            System.out.println("OOPs! Account number not matched. \nTry again");
        }
    }
}
public class Bankmanage
{
    public static void main(String args[]){
        Banking b=new Banking();
        Scanner sc = new Scanner(System.in);
        b.setaccount();
        int ch;
        do{
            System.out.println("\n ***Bank Management System***");
            System.out.println("1.Display account details");
            System.out.println("2.Deposit the amount");
            System.out.println("3.Withdraw the amount");
            System.out.println("4.Transfer the amount");
            System.out.println("5.Exit ");
            System.out.println("Enter your choice: ");
            ch = sc.nextInt();
            switch (ch) {
                case 1:
                    b.showaccount();
                    break;
                case 2:
                    b.deposit();
                    break;
                case 3:
                    b.withdrawal();
                    break;
                case 4:
                    b.transfer();
                    break;
                case 5:
                    System.out.println("You are out. \nThankyou.");
                    break;
                default:
                    System.out.println("Wrong choice");
            }
        } while(ch!=5);
    }
}