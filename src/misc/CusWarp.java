package misc;

class Custom{
    private int num ;
    Custom (int num){
        this.num = num;
    }

    @Override
    public String toString() {
        return "Hello";
    }
}

public class CusWarp {
    public static void main(String[] args) {
        Custom obj = new Custom(7);
        System.out.println(obj);
    }
}
