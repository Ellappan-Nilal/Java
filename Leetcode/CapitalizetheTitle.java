public class CapitalizetheTitle {
    public static void main(String[] args){
        CapitalizetheTitle obj = new CapitalizetheTitle();

        String title = "capiTalIze tHe titLe";          
    
        String result = obj.capitalizeTitle(title);

        System.out.println("Capitalized Title: " + result);
    }  
    public String capitalizeTitle(String title) {
        String[] words = title.split(" ");
        StringBuilder capitalizedTitle = new StringBuilder();

        for (String word : words) {
            if (word.length() <= 2) {
                capitalizedTitle.append(word.toLowerCase());
            } else {
                capitalizedTitle.append(Character.toUpperCase(word.charAt(0)));
                capitalizedTitle.append(word.substring(1).toLowerCase());
            }
            capitalizedTitle.append(" ");
        }

        return capitalizedTitle.toString().trim();
    }    
}
