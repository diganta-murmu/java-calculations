class Wallet{
    String FirstName;
    String LastName;
    private double balance;
    final int id;
    static int counter = 0;
    String WithdrowMode;

//  CONSTRUCTOR
    Wallet(){
        id = ++counter;
    }
    Wallet(String FirstName, String LastName){
        this.FirstName = FirstName;
        this.LastName = LastName;
        id = ++counter;
    }
    Wallet(String FirstName, String LastName, double balance){
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.balance = balance;
        id = ++counter;
    }

// METHODES
    void deposit(double amount){
        balance += amount;
    }
    void withdrow(double amount){
        balance -= amount;
    }
    void withdrow(double amount, String withdrawMode){
        balance -= amount;
        this.WithdrowMode = withdrawMode;
    }
    void details(){
        System.out.println("Full Name: "+FirstName+" "+LastName);
        System.out.println("ID: 000"+id);
    }
    void chackBalance(){
        System.out.println("Total Balance: "+balance);
        System.out.println("Withdorw Mode: "+WithdrowMode);
    }
    void addBonus(Wallet W, int amount){
        W.balance += amount;
    }
    void swap(Wallet W_1, Wallet W_2){
        this.FirstName = W_1.FirstName;
        this.LastName = W_1.LastName;
        this.balance = W_1.balance;

        W_1.FirstName = W_2.FirstName;
        W_1.LastName = W_2.LastName;
        W_1.balance = W_2.balance;

        W_2.FirstName = this.FirstName;
        W_2.LastName = this.LastName;
        W_2.balance = this.balance;
    }
}
public class WalletApp {
    public static void main(String [] args){
        Wallet W1 = new Wallet("Raihan","Shorkar");
        Wallet W2 = new Wallet("Mohammod","Adil",500.00);
        Wallet W3 = new Wallet("Rakibul", "Tuhin");
        Wallet Temp = new Wallet();

        System.out.println(W1.id);
        System.out.println(W2.id);
        W2.details();
        W2.chackBalance();
        W2.addBonus(W3, 500);
        System.out.println("//.............................//");
        W1.deposit(500000);
        W1.withdrow(15000, "ATM");
        W1.details();
        W1.chackBalance();
        System.out.println("//.............................//");
        W3.details();
        W3.chackBalance();
        System.out.println("//.........................................................//");
        Temp.swap(W1, W3);
        W1.details();
        W1.chackBalance();
        System.out.println("//.............................//");
        W3.details();
        W3.chackBalance();
    }
}
