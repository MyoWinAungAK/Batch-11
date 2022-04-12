package Five;

public class AggregationEx {

    String name;
    int age;
    Location location;

    public AggregationEx(String name, int age,Location posation) {
        this.name = name;
        this.age = age;
        this.location = posation;
    }

    void showData (){
        System.out.println("Name is : \t"+name+ "\n Age is :\t"+age+ "\nLocation is :\t"+location.city+"\t"+location.state+"\t"+location.country);
    }


    public static void main(String[] args) {

        Location location1 = new Location("Yangon","Yangon","Myanmar");
        AggregationEx user1 = new AggregationEx("Mg Mg",23,location1);
        user1.showData();

    }
}
