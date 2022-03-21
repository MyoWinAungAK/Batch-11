package Controlflow;

public class DuplicateElement {
    public static void main(String[] args) {
        int number[] = {1,2,4,5,6,8,9,9,8,7,6,5,4,3,2,1};
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1;j<number.length;j++){
                if (number[i]==number[j]){
                    System.out.println(number[j]);
                }
            }

        }
    }
}
