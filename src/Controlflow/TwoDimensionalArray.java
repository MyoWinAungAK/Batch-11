package Controlflow;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        int numbers [][] = new int [5][5];

        int dNumbers[][]={
                {1,2,3,4,5},
                {5,4,3,2,1},
                {1,1,1,1,1000},
                {5,5,3,3,4}
        };
    //    System.out.println(dNumbers.length);
    //    System.out.println(numbers[0].length);
        for (int row = 0; row < dNumbers.length; row++) {
           for (int colum = 0;colum<dNumbers[row].length;colum++) {
               System.out.print(dNumbers[row][colum]+"\t");
           }
            System.out.println();
        }

        //     System.out.println(dNumbers[2][4]);
   //     dNumbers[3][2]=7;
   //     System.out.println(dNumbers[3][2]);

    }
}
