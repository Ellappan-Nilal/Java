
package solve_problems.DSA.Singly_Linked_list;

public class Bubble_sort {
    public static void main(String[] args){
        int n[]={21,2,8,7,4};
        int size=n.length;
        int temp=0;
        System.out.println("Before sorting");
        for(int num:n){
            System.out.print(num+" ");
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size-i-1;j++){
                if(n[j]>n[j+1]){
                    temp=n[j];
                    n[j]=n[j+1];
                    n[j+1]=temp;
                }
            }
        }
        System.out.println();
        System.out.println("After Sorting");
        for(int num:n){
            System.out.print(num+" ");
        }
    }
}
