package Controlflow;

public class SwitchStatement {
    public static void main(String[] args) {

  //     int a = 6;
  //     switch(a){
  //         case 1:
  //             System.out.println(a + " is equal to 1");
  //             System.out.println("something");
  //         case 2:
  //             System.out.println(a + " is equal to 2");
  //         case 3:
  //             System.out.println(a + " is equal to 3");
  //         case 4:
  //             System.out.println(a + " is equal to 4");
  //         case 5:
  //             System.out.println(a + " is equal to 5");
  //         default:
  //             System.out.println("something was wrong");
  //     }
        String day = "Friday";
        String str = " is weekday";
        switch (day){
            case"Monday":
                System.out.println(day + str);
                System.out.println("something");
                break;
            case "Tuesday":
                System.out.println(day + str);
                break;
            case "Wednesday":
                System.out.println(day + str);
                break;
            case "Thursday":
                System.out.println(day + str);
                break;
            case "Friday":
                System.out.println(day + str);
                break;
            case "Saturday":
                System.out.println(day + str);
                break;
            case "Sunday":
                System.out.println(day + str);
            default:
                System.out.println("Weekend");

        }
    }
}

//Switch cass