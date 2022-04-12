package Five;

 class Parent3{
    void show (){
        System.out.println("Show Method");
    }
}



public class FinalKeywordex extends Parent3{
    private static final int HELLO = 529;

    @Override
    void show() {

    }

    public static void main(String[] args) {
        System.out.println(HELLO);

    }
}
