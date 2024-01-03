import java.util.*;
import java.util.Scanner;

class ATM_Machine{
    private String cust_Name;
    private String acc_No;
    private double amount;

    public ATM_Machine(String name, String accNo, double amt)
    {
        cust_Name = name;
        acc_No = accNo;
        amount = amt;
    }

    public boolean withdraw(double amt)
    {
        if(amount > amt)
        {
            amount -= amt;
            return true;
        }
        return false;
    }

    public double get_Amount()
    {
        return amount;
    } 

    public void deposit(double amt){
        amount += amt;

    }
}

class ATM_Interface{
    public static void main(String []args)
    {
        ATM_Machine atm = new ATM_Machine("Dishant", "1202012012", 100000);

        System.out.println("Current Amount");
        System.out.println(atm.get_Amount());
        do{
            System.out.println("\n1. Withdraw ");
            System.out.println("2. Deposit ");
            System.out.println("3. Check Balance ");
        
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter Choose : ");
            int op = sc.nextInt();

            if(op == 1){
                System.out.print("Enter Amount = ");
                double amt = sc.nextDouble();
                if(atm.withdraw(amt))
                    System.out.println("Successful Amount Withdraw");
                else
                    System.out.println("Unsuccessful Withdrawing, Your Amount : "+atm.get_Amount());
            }
            else if (op == 2) {
                System.out.print("Enter Amount = ");
                double amt = sc.nextDouble();
                atm.deposit(amt);
                System.out.println("Successful Amount Deposite");
            }
            else if (op == 3) {
                System.out.println("Current Balance : "+atm.get_Amount());
                
            }
            else{
                break;
            }
        }while(true);
    }
    
}
