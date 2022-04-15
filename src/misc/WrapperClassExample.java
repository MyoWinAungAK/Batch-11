package misc;

public class WrapperClassExample {
    public static void main(String[] args) {


        int a = 60;
        String massage = "Mg Mg";


        Integer integer = a;
      //  System.out.println(integer.getClass().getName());
        String str = integer.toString();
        System.out.println(str.length());

        String num = "234567";
        Integer num1 = Integer.parseInt(num);
        System.out.println(num1);
    }
}
