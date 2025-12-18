public class ReformatDate {
    public static void 
main(String[] args) {
        ReformatDate obj = new ReformatDate();

        String date = "20th Oct 2052";
        String result = obj.reformatDate(date);

        System.out.println("Reformatted date: " + result);
    }
}
