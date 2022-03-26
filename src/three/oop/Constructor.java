package three.oop;

public class Constructor {
    int i;
    String name;

  //  Constructor(){
    //    System.out.println("Constructor is working");
   // } //==>0 argument constructor
    Constructor(int i,String nmae){
        this.i = i;
        this.name=name;
    } //Parameterized constructor

    public static void main(String[] args) {
       new Constructor(5,"Myowing");

    }
}
//syntax
//ClassName(...){....}
