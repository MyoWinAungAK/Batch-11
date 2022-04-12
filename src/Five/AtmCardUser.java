package Five;

class Person1{
    int id;
    String name;

    Person1(int id,String name){
        this.id=id;
        this.name=name;
    }
}


public class AtmCardUser extends Person1 {

    double amount ;

    AtmCardUser(double amount,int id,String name){
        super(id,name);
        this.amount= amount;

    }
    void show(){

        System.out.println(super.id);
        System.out.println(name);
        System.out.println(amount);
    }

    public static void main(String[] args) {

        AtmCardUser user1 = new AtmCardUser(20000,1,"Mg Mg");
        AtmCardUser user2 = new AtmCardUser(10000,2,"Aung Aung");
        user1.show();
        user2.show();

    }


}
