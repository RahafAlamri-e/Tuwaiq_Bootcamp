package week03.day01_Tasks;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(){

    }

    public Account(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Account(String id, String name, int balance){
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getBalance() {
        return balance;
    }

    public int credit(int amount){
        balance += amount;
        return balance;
    }

    public int debit(int amount){
        if(amount <= balance){
            balance -= amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public int transferTo(Account another, int amount){
        if(amount <= balance){
            this.balance -= amount;
            another.balance += amount;
        } else {
            System.out.println("Amount exceeded balance");
        }
        return balance;
    }

    public String toString(){
        return "Account details: "
                + "\n id = " + id
                + "\n name = " + name
                + "\n balance = " + balance;
    }

}
