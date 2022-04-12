package Five;

class Over{
    void sum(){
        System.out.println("Parent Class Method");
    }
}

public class MethodOverridingEx extends Over {

    void  sum(){
        System.out.println("Child Class Method");
    }
    public static void main(String[] args) {
       MethodOverridingEx obj = new MethodOverridingEx();
       obj.sum();
    }
}
