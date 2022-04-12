package abstraction;

interface WorkFormMom{
    void homeWork();
}

public class OlderBrother implements WorkFormMom{
    @Override
    public void homeWork() {
        System.out.println("For eat");
    }

    public static void main(String[] args) {


        YoungerBrother object4 = new YoungerBrother(new OlderBrother());
        object4.doIt();
    }
}
