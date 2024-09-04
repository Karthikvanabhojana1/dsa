package day1;

public class LogicalSwitchNew {
    public static void main(String[] args) {
         String day ="Monday";

         // after java 12 we can use switch as expression and no break; if not using colon you can use yield: "Wakeup on 6:00AM";"
         String result=switch (day){
             case "Saturday","Sunday"->
                 "Wakeup on 6:00AM";
             case "Monday"->
                "Wakeup on 8:00AM";
             default->
                "Wakeup on 7:00AM";

         };
        System.out.println(result);
    }
}
