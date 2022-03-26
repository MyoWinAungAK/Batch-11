package three.oop;

import java.util.Scanner;

public class Sca {
    public static void main(String[] args) {
        System.out.println("Enter Your Name");
    //    System.out.println("Enter Your Number");

      Scanner scanner = new Scanner(System.in);
      String str=scanner.nextLine();
   //     String name = scanner.nextLine();
    //    int userinput = scanner.nextInt();


   //     System.out.println("My name is "+name);
    //    System.out.println("Your Number " + userinput);

      //  if (userinput%2 == 0){
      //      System.out.println("your number is even");
      //  }else {
      //      System.out.println("your number is odd");
      //  }

      //  System.out.println(str.length());
        if (str=="password"){
            System.out.println(str=="password");
            System.out.println("password");
        }else {
            System.out.println(str=="password");
            System.out.println(str);
        }



    }
}
