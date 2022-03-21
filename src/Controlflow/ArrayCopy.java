package Controlflow;

public class ArrayCopy {
    public static void main(String[] args) {
        int number[] = {1,2,3,9,8,7,5,4,3};
        System.out.println(number.getClass().getName());

        int other[] = new int [6];

        System.arraycopy(number, 3,other,0,6);

        for (int i = 0; i < other.length; i++) {
            System.out.print(other[i]+ "\t");

        }
    }
}
