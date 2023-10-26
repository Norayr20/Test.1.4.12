import java.util.Arrays;
import java.util.List;

public class Dayoff {
    public static void main(String[] args) {

        String result=checkWeekend("Sunday");
        System.out.println(result);

    }
    public static String checkWeekend(String weekday) {
            List<String> weekends = Arrays.asList("Monday", "Sunday");
            return (weekends.contains(weekday)) ? "Ура, выходной!" : "Надо еще поработать!";
        }
    }
