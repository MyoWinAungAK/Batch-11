package Five;

class SuperParent1 {
    String name = "Mg Aung";
}

class SuperParent extends SuperParent1 {
    String name = "Mg Mg";
}

public class SuperKeyword extends SuperParent {
    String name = "Aung Aung";
    void show(){
        System.out.println(super.name);
    }

    public static void main(String[] args) {

        SuperKeyword obj = new SuperKeyword();
        System.out.println(obj.name);
        obj.show();

    }

}
