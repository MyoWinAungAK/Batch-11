package three.oop;

import jdk.internal.dynalink.beans.StaticClass;

public class ObjectAndClass {
    //fields => globle variable

   int num =68; // global instance variable
    int a = 40;
   static int number = 12; //globle static variable
    static String name = "myo";

    public static void main(String[] args) {
    //    int a = 55; //local Variable

        ObjectAndClass object1 = new ObjectAndClass() ;
        System.out.println(object1.num);
        System.out.println(ObjectAndClass.name);


    }
}
// Group =>2
// Local ver
// Globle var

//State
//Behavior => java method  /Other programming  Function =

//Class => field and method