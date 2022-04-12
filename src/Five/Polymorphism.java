package Five;

public class Polymorphism {

    static void calculate(int num1,double num2){
        System.out.println(num1+num2);
    }
    static void calculate(double num1,int num2){
        System.out.println(num1+num2);
    }
    static void calculate(int number){
        System.out.println(number+number);
    }
    static void calculate(double num){
        System.out.println(num+num+num);
    }

    public static void main(String[] args) {
        calculate(4.0,5);
        calculate(8);
        calculate(9.0);
    }
}

//Method overloading
//Method overriding

//Type promotion
//Type ambiguity
