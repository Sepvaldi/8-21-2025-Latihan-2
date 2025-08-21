package TugasBuPhasa;

public class SavingsAccount2 {
    public double interestRate;
    public double balance;
    public String name;

    public void displayCustomer(){
        System.out.println("Customer: " + name);
        System.out.println("Balance: " + balance);
        System.out.println("Rate: " + interestRate);
    }
        public void deposit(int x){
        balance += x;
    }

        public double calcInterest(){
        return balance * interestRate;
    }
}
