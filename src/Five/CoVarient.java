package Five;

class A{
    A obj(){
        return this;
    }
}
class B extends A{
    B obj(){
        return this;
    }
}

public class CoVarient {
    public static void main(String[] args) {
        A object1 = new A();
        System.out.println(object1.getClass().getName());

        B obj2 = new B ();
        System.out.println(obj2.getClass().getName());
    }
}
