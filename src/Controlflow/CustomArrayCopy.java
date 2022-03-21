package Controlflow;

public class CustomArrayCopy {
    public static void main(String[] args) {
        //initialize an array
        int numbers[] = {1,2,3,4,5,12,6,7,8};
        int copy[] = new int[numbers.length];

        //before copy
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i]+ "\t");
        }
        System.out.println();

        //copy
        for (int i = 0; i < numbers.length; i++) {
            copy[i]=numbers[i];

        }
        for (int i = 0; i < copy.length; i++) {
            System.out.print(copy[i] + "\t");
        }
        System.out.println();

        int largestNumber = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i]>largestNumber)
                largestNumber=numbers[i];


        }
        System.out.println(largestNumber);

        int num[]={1,2,3,9,7,6,4,5,8};
        int valueNow =0;

        for (int i = 0; i < num.length; i++) {
            for (int j = i+1;j<num.length;j++)
                if (num[i]>num[j]){
                    valueNow=num[i];
                    num[i]=num[j];
                    num[j]=valueNow;

                }

        }
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+ "\t");

        }
        System.out.println();
        System.out.println(num.length-0);


    }
}
