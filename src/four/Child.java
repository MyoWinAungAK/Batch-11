package four;

class GrandParent{
    void display(){
        System.out.println("dispay");
    }
}

class Parent extends GrandParent{
    int a;
    int b;
    int c=3;

}
class Girl extends Parent {

}
class Boy extends Parent{

}

public class Child extends Parent {


    void show(){
        System.out.println("Show Method is Working");
    }

    public static void main(String[] args) {
        Child obj = new Child();
        System.out.println(obj.a);
        System.out.println(obj.b);
        obj.show();

        Parent parent = new Parent();
        System.out.println(parent.a);
        System.out.println(parent.b);
        System.out.println(parent.c);
        obj.display();
    }
}
