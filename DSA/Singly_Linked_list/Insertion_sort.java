/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.DSA.Singly_Linked_list;

public class Insertion_sort {
    public static void main(String[] args){
        int n[]={4,6,3,8,1};
        System.out.println("Before sorting");
        for(int num:n){
            System.out.print(num+" ");
        }
        for(int i=1;i<n.length;i++){
            int key=n[i];
            int j=i-1;
            while(j>=0&&n[j]>key){
                n[j+1]=n[j];
                j--;
        }
            n[j+1]=key;
        }
        System.out.println();
        System.out.println("After sorting");
        for(int num:n){
            System.out.print(num+" ");
        }
    }
}
