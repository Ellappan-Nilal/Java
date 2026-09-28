package solve_problems.Java_class_Anudhip;
public class Largest_no_array {
    public static void main(String[] args){
        int[] n={23,45,12,54,8};
        
        int largest=n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]>largest){
                largest=n[i];
            }
        }
        System.out.println("Largest no : "+largest);
    }
}
