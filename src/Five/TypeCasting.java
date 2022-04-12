package Five;

class Type{
    int num1 =30;
    void sum(){
        System.out.println("Parent sum method is working");
    }
}

public class TypeCasting extends Type{

    int num1 = 70;

    @Override
    void sum(){
        System.out.println("child sum method is working");
    }
    public static void main(String[] args) {
        int a = 5;
        double b= a; //widening casting
        int c = (int) b; //narrowing casting

     TypeCasting typeCasting = new TypeCasting();
     Type type =  typeCasting; //widening casting  //upcasting

        type.sum();
        System.out.println(type.num1);
        TypeCasting childObj = (TypeCasting) type;

    }
}
