package HomeWorks;


import java.util.Scanner;

public class PhoneBillPackage {
    public static void main(String[] args) {

        System.out.print("Enter Code :");
        String userInputCode = new Scanner(System.in).nextLine();

        if (userInputCode.equals("106")) {
            System.out.println("1.Voice");
            System.out.println("2.Data");
            System.out.println("3.အထူးလက်ဆောင်");
            System.out.println("4.ဖုန်းဘေလက်ကျန်စစ်မည်");
            System.out.println("5.ဖုန်းငွေဖြည့်မည်");

            System.out.print("Chose Number :");
            int userInput1 = new Scanner(System.in).nextInt();
            if (userInput1==1){
                System.out.println("Voice Pack");
                System.out.println("1. 619Min = 3900Ks");
                System.out.println("2. 234Min = 1500Ks");
                System.out.println("3. 132Min = 850Ks");

                System.out.print("Chose Number :");
                int user1 =new  Scanner(System.in).nextInt();
                switch (user1){
                    case 1:
                        System.out.println("Your Package is 619 Min Successful");
                        break;
                    case 2:
                        System.out.println("Your Package is 234 Min Successful");
                        break;
                    case 3:
                        System.out.println("Your Package is 132 Min Successful");
                        break;
                    default:
                        System.out.println("Your Code is Wrong");


                }
            }else if(userInput1 ==2){
                System.out.println("Data Pack");
                System.out.println("1. 80MB = 299Ks");
                System.out.println("2. 350MB = 799Ks");
                System.out.println("3. 400MB = 949Ks");

                System.out.print("Chose No :");
                int user2 = new Scanner(System.in).nextInt();
                switch (user2){
                    case 1:
                        System.out.println("Your Data Pack is 80MB Successful");
                        break;
                    case 2:
                        System.out.println("Your Data Pack is 350MB Successful");
                        break;
                    case 3:
                        System.out.println("Your Data Pack is 400MB Successful");
                        break;
                    default:
                        System.out.println("Your Code is Wrong");
                }

            }else if (userInput1 == 3){
                System.out.println("အထူးလက်ဆောင်");
                System.out.println("1. 480MB = 999Ks (30D)");
                System.out.println("2. 280MB = 585Ks (30D)");
                System.out.println("3. 85Min (MPT) = 555Ks (30D)");
                System.out.print("Chose No :");
                int user3 = new Scanner(System.in).nextInt();
                switch (user3){
                    case 1:
                        System.out.println("Your Data Pack is 480MB Successful");
                        break;
                    case 2:
                        System.out.println("Your Data Pack is 280MB Successful");
                        break;
                    case 3:
                        System.out.println("Your Data Pack is 85Min Successful");
                        break;
                    default:
                        System.out.println("Your Code is Wrong");
                }
            }else if (userInput1 == 4){
                System.out.println("ဖုန်းဘေစစ်မည်");
                System.out.print("Enter Code :");
                String user4 = new Scanner(System.in).nextLine();
                double num = 10;
                if (user4.equals("*124#")){
                    System.out.println("လူကြီးမင်း၏ လက်ကျန်မှာငွေမှာ :\t"+num+ "\tကျပ်");
                }else {
                    System.out.println("Your Code is Wrong");
                }
            }else if (userInput1 == 5){
                System.out.println("ဖုန်းငွေဖြည့်မည်");
                System.out.print("Enter Amount :");
                double user5 = new Scanner(System.in).nextInt();
             //   double num1 = 10 ;
                if (user5 <= 100){
                    System.out.println("Your balance is low");
                }else {
                    System.out.println("လူကြီးမင်း၏ ဖုန်းငွေ \t"+user5+"\tကျပ် တိတိဖြည့်ပြီးပါပြီ။");
                }
            }
        }else {
            System.out.println("Your Code is Wrong");
        }


    }

}
