package Controlflow;

import java.sql.SQLOutput;

public class JavaArray {
    public static void main(String[] args) {
        int a = 67; // variable initializa
        int b;
        //String name = "mg mg";

        int numbers[]={23,3345,355,345,46,354}; // initializa
        String names[]= new String []{"mgmg","Khaung","Codewall","kyaw","Technology",null,""};
        //Collection Framework

        String cars[]=new String[4];
        cars[0]="marcedes";
        cars[2]="toyota";
        cars[3]="lamborghini";
    //    System.out.println(names.length);
    //    names[2]="page";
    //    System.out.println(names[2]);

     //   System.out.println(names);
     //   System.out.println(numbers);

        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i] + "\t");

        }
        System.out.println();

        for (String name : names) {
            System.out.print(name+ "\t");
        }
        System.out.println();
        for (int i = names.length - 1; i >= 0; i--) {
            System.out.print(names[i]+"\t");
            
        }
            }

        }



//Array