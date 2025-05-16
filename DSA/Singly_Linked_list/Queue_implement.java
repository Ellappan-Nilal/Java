/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package solve_problems.DSA.Singly_Linked_list;

public class Queue_implement {
    public static void main(String[] args){
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        
        System.out.println(queue.dequeue());
        //queue.show();
         queue.enqueue(60);
       
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        
        
    }
}
