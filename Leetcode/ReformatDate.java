import java.util.HashMap;
import java.util.Map;

public class ReformatDate {

    public static void main(String[] args) {
        ReformatDate obj = new ReformatDate();

        String input = "20th Oct 2052";
        String output = obj.reformatDate(input);

        System.out.println(output); 
    }
    
    public String reformatDate(String date) {
               
        String year = date.substring(date.length() - 4);
        String result = year + "-";
       
        Map<String, String> map = new HashMap<>();
        map.put("Jan", "01");
        map.put("Feb", "02");
        map.put("Mar", "03");
        map.put("Apr", "04");
        map.put("May", "05");
        map.put("Jun", "06");
        map.put("Jul", "07");
        map.put("Aug", "08");
        map.put("Sep", "09");
        map.put("Oct", "10");
        map.put("Nov", "11");
        map.put("Dec", "12");
       
        String[] words = date.split(" ");
       
        String month = words[1];
        result += map.get(month) + "-";
       
        String day_th = words[0];
        String day = "";

        for (int i = 0; i < day_th.length(); i++) {
            if (Character.isDigit(day_th.charAt(i))) {
                day += day_th.charAt(i);
            }
        }

        if (day.length() == 1) {
            result += "0" + day;
        } else {
            result += day;
        }

        return result;
    }
}
