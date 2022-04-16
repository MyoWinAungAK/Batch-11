package HomeWorks;


import java.util.Scanner;

public class AtmSystem {


    public static void main(String[] args) {

        int id = 1;
        String name = "Mg Mg";
        double amount = 10000;


        System.out.print("Enter Password : ");
        int ps1 = new Scanner(System.in).nextInt();

        if (ps1 == 123456){
            System.out.println("ID : "+id +"\t"+"Name : "+ name +"\t" + "Amount : "+ amount);
            System.out.println("1. Add Amount "+ "\n"+"2. With Draw"+"\n"+"3. Transfer");
            System.out.print("Enter Number : ");
            int num1 = new Scanner(System.in).nextInt();
            if (num1 == 1){
                System.out.print("Add Amount : ");
                double num2 = new Scanner(System.in).nextInt();
                System.out.println("Total Amount is : "+(num2+amount));
            }else if (num1 ==2) {
                System.out.print("Choose Amount :");
                double num3 = new Scanner(System.in).nextInt();

                if (num3 < amount) {
                    System.out.println("Your Balance is : " + (amount - num3));
                }else if (num3 > amount){
                    System.out.println("Your balance is not enough");
                }

            }else if (num1 == 3){
                System.out.print("Enter Transfer ID :");
                int num4 = new Scanner(System.in).nextInt();
                if (num4 == 00001){
                    System.out.print("Choose Transfer Amount :");
                    double num5 = new Scanner(System.in).nextInt();

                    if (num5 < amount){
                        System.out.println("Your Transfer Amount is Success");
                        System.out.println("Your balance is :"+(amount-num5));
                    }else if(num5 > amount){
                        System.out.println("Your Transfer Amount is not enough");
                    }else {
                        System.out.println("Something is Wrong");
                    }
                }else{
                    System.out.println("Something is Wrong");
                }


            }else{
                System.out.println("Somehing is Wrong");
            }

        }else {
            System.out.println("Your Password is Wrong");


        }


    }

}
