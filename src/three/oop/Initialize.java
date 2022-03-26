package three.oop;

public class Initialize {
    int id;
    String name;

    void insert(int id, String name) {

       this.id =id;
        this.name =name;
}

    public static void main(String[] args) {
        Initialize object = new Initialize();
        object.insert(34,"Myowinaung");

        System.out.println(object.id);
        System.out.println(object.name);
        Constructor obj = new Constructor(3,"aungaung");

    }
}

