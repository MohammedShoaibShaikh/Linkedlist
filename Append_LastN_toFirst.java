package Linkedlist;

import java.util.Scanner;

public class Append_LastN_toFirst {

    static Node append_L_toN(Node head, int n){
        Node fast = head;
        Node slow = head;
        Node initialhead = head;

        for(int i = 0; i < n; i++){
            fast = fast.next;
        }
        while(fast.next != null){
            slow = slow.next;
            fast = fast.next;
        }
        Node newhead = slow.next;
        slow.next = null;
        fast.next = initialhead;
        head = newhead;

        return head;
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        LL a1 = new LL();
        Node head = a1.input();
        System.out.print("Enter the L: ");
        int t = sc.nextInt();
        head = append_L_toN(head, t);
        a1.print(head);
    }
}
