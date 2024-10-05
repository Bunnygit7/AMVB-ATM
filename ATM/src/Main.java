import java.util.Scanner;
class ATM{
    private float balance=100;
    private int PIN=0000;
    ATM(){
        System.out.print("Enter your Pin:");
        Scanner sc=new Scanner(System.in);
        int enteredPin=sc.nextInt();
        if(enteredPin==PIN){
            menu();
        } else{
            System.out.println("Please Enter Correct Pin..");
        }
    }
    public void menu(){
        Scanner sc=new Scanner(System.in);
        while(true){
            System.out.println();
            System.out.println("1.Check a/c balance");
            System.out.println("2.Withdraw money");
            System.out.println("3.Deposit money");
            System.out.println("4.Exit");
            System.out.print("Enter Your Choice:");
            int Choice=sc.nextInt();
            if(Choice==1){
                checkBal();
            } else if (Choice==2) {
                withDraw();
            } else if (Choice==3) {
                deposit();
            }else if(Choice==4){
                break;
            } else{
                System.out.println();
                System.out.println(">>>>Invalid Choice<<<<");
            }
        }
        System.out.println();
        System.out.println("Thank you Visit Again....");
    }
    private void deposit() {
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter Amount:");
        int amount=sc.nextInt();
        if(amount>0){
            balance+=amount;
            System.out.println();
            System.out.println("Successfully Deposited "+amount);
            System.out.println("Total Balance:"+balance);
        }
        else{
            System.out.println("Enter valid amount!!");
        }
    }
    private void withDraw() {
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.print("please enter Amount:");
        int amount=sc.nextInt();
        if(amount<=balance&&amount>0){
            balance-=amount;
            System.out.println();
            System.out.println("With draw Successful!!");
            System.out.println("Total Balance:"+balance);
        }
        else if(amount<0){
            System.out.println("Enter valid amount!!");
        }
        else{
            System.out.println();
            System.out.println("Insuffecient balance!!");
        }
    }

    private void checkBal() {
        System.out.println();
        System.out.println("Balance:"+balance);
    }
}
public class Main {
    public static void main(String[] args) {
        ATM a=new ATM();
    }
}