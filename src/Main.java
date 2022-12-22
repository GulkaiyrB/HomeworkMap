import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.print("Напишите день недели на английском - ");
        Scanner sc = new Scanner(System.in);
        String day = sc.next();

        Map<String, String> days = new HashMap<>();
        days.put("Monday", "Понедельник");
        days.put("Tuesday", "Вторник");
        days.put("Wednesday", "Среда");
        days.put("Thursday", "Четверг");
        days.put("Friday", "Пятница");
        days.put("Saturday", "Суббота");
        days.put("Sunday", "Воскресенье");

        for (Map.Entry<String, String> item : days.entrySet()){
            if (item.getKey().equalsIgnoreCase(day)) {
                System.out.printf(item.getKey() + " - " + item.getValue());
            }
        }
    }
}

