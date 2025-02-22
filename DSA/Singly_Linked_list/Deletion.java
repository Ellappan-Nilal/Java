//Insertion at begin Detetion at Begin

import solve_problems.Java.Node;
import java.util.*;

class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class Deletion {

    public static void main(String args[]) {
        Node head = null, tail = null;
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        for (int i = 0; i < n; i++) {
            int v = x.nextInt();
            Node nn = new Node(v);
            if (head == null) {
                head = nn;
            } else {
                nn.next= head;
                head = nn;
            }
        }
        System.out.println();
        System.out.print("Enter the postion to delete");
        int pos=x.nextInt();
        int cnt=1;

        if (head == null) {
            System.out.print("Nothing to detete");
        } else if (head.next == null) {
            head = null;
        } else if(pos==1){
            temp=head;
            head=head.next;
            temp.next=null;
        }else{
               temp=head;
               while(cnt!=pos-1){
                   temp=temp.next;
                   cnt++;
        }
         temp.nxt=temp.next.next;
        }
        temp=head;
        System.out.print(temp.data);
    }

}
