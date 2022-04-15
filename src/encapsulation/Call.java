package encapsulation;

public class Call {
    public static void main(String[] args) {
        Model obj = new Model(1,"Aung Aung ",20);
        System.out.println(obj.getId());
        System.out.println(obj.getName());
        System.out.println(obj.getAge());
    }

}
