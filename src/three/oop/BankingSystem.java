package three.oop;

public class BankingSystem {
    int id;
    String name;
    double amount;//10000

    public BankingSystem(int id, String name, double amount){
        this.id =id;
        this.name = name;
        this.amount =amount;
    }

    void addAmount(double amt){
        amount += amt;
    }

    void withdraw(double a){
        if (amount>a){
            amount = amount-a;
            System.out.println("Your current is amount:" + amount);
        }else {
            System.out.println("Your amount is lower than you need");
        }

    }

    public static void main(String[] args) {
        BankingSystem user1 = new BankingSystem(1,"mgmg",10000);
        System.out.println(user1.amount);

        user1.addAmount(40000);
        System.out.println(user1.amount);

        user1.withdraw(30000);

        BankingSystem user2 = new BankingSystem(2,"aung aung ",20000);
        System.out.println(user2.amount);

        user2.addAmount(40000);
        System.out.println(user2.amount);

        user2.withdraw(30000);



    }
}
