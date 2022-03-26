package three.oop;

public class Method {

    int multiple (int nun1, int nun2){
        System.out.println(nun1+nun2);
        return nun1*nun2;
    }
    String str(){
        return "Hellow World";
    }


    void add(int a, int b){

    //    int a =45;
    //    int b =40;
        System.out.println(a+b);
    }

  static void name (String firstName,String lastName){
        System.out.println("First name is "+ firstName);
        System.out.println("Last name is "+ lastName);


    }
    public static void main(String[] args) {
   //    Method method = new Method();
   //    method.add(43,50);
   //    method.add(1,2);
   //    method.add(30,45);
   //    method.add(10,22);
    //    name("Myo","Win");
        Method object = new Method();
        String str = object.str();
       int result= object.multiple(4,5);

        System.out.println(str);
        System.out.println(result);





    }




}


//syntax
//create

//returnType methodName(){
//
//}

//method // Predefined method
        // User defined method

//access modifier non-access modifier  return type methodName(perameter) => method header

//{implementation } => method body