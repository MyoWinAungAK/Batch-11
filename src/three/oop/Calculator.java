package three.oop;

import java.util.Scanner;

public class Calculator {
  static   void sum (int num1,int num2,String operation){
      System.out.println("Your first number is "+num1);
      System.out.println("Your second number is "+num2);
      System.out.println("You chose "+ operation);
      System.out.println(num1+num2);
    }
 static    void subtract (int num1,int num2,String operation){
     System.out.println("Your first number is "+num1);
     System.out.println("Your second number is "+num2);
     System.out.println("You chose "+ operation);
        System.out.println(num1-num2);
    }
   static void multiply (int num1,int num2,String operation){
       System.out.println("Your first number is "+num1);
       System.out.println("Your second number is "+num2);
       System.out.println("You chose "+ operation);
        System.out.println(num1*num2);
    }
   static void division (int num1,int num2,String operation){
       System.out.println("Your first number is "+num1);
       System.out.println("Your second number is "+num2);
       System.out.println("You chose "+ operation);
        System.out.println(num1/num2);
    }
    public static void main(String[] args) {


        System.out.print("Enter an number:");
        int number1 = new Scanner(System.in).nextInt();
        System.out.print("Enter second number:");
        int number2 = new Scanner(System.in).nextInt();

        System.out.println("Enter a number\n"+
                "1 for add\n"+
                "2 for subtract\n"+
                "3 for multiply\n"+
                "4 for division\n");

        //   System.out.print("Enter an operator \" + - * / \"");
        int operator = new Scanner(System.in).nextInt();


        if (operator==1){
            sum(number1,number2,"sum operation");
        }else if (operator==2){
            subtract(number1,number2,"subtract operation");
        }else if (operator==3){
            multiply(number1,number2,"multiply operation");
        }else if (operator==4){
            division(number1,number2,"division operation");
        }else {
            System.out.println("Your input operator is worng");
        }


    }
}
