package Five;

class Parent{
    Parent(){
        System.out.println("Parent constructor is working");
    }
}

class Parent2 extends Parent{
    Parent2(int a){
        System.out.println("Parent 2's default parameter is working");
    }
}

public class InitializerBlockExample {

    //instance data member / fields


    InitializerBlockExample(){
        System.out.println("Value is");
    }
    {
        System.out.println("working");
    }

    public static void main(String[] args) {
        new InitializerBlockExample();
        new Parent2 (2);
    }
}
