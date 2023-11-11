public class Dayoff {
    public static void main(String[] args) {
        System.out.println(checkWeekend("Monday"));
        System.out.println(checkWeekend("Sunday"));
    }

    public static String checkWeekend(String weekday) {
        return (weekday.equals("Saturday") || weekday.equals("Sunday")) ? "Ура, выходной!" : "Надо еще поработать";
    }
}