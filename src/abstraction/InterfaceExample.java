package abstraction;

interface Callable{
    int a = 40; //constant
    void sum1();
    void sum2();
    void sum3();
    void sum4();
    void sum5();

}
interface B{
    void cal();
}

public class InterfaceExample implements Callable,B {


    @Override
    public void sum1() {
        System.out.println("Hello");

    }

    @Override
    public void sum2() {

    }

    @Override
    public void sum3() {

    }

    @Override
    public void sum4() {

    }

    @Override
    public void sum5() {

    }
    @Override
    public void cal(){

    }

    public static void main(String[] args) {
        InterfaceExample obj = new InterfaceExample();
        obj.sum1();
    }
}
