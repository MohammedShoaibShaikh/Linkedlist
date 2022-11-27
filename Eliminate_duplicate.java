package Linkedlist;
import java.util.Scanner;
public class Eliminate_duplicate {
    static Node delete_duplicate(Node head){
        Node t1 = head;
        Node t2 = t1.next;
        while(t2 != null){
            while(t1.data == t2.data){
                if(t2.next == null){
                    t1.next = null;
                    return head;
                }
                t2 = t2.next;
            }
            t1.next = t2;
            t1 = t2;
            t2 = t1.next;
        }

        return head;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL o2 = new LL();
        Node head = o2.input();
        o2.print(head);
        head = delete_duplicate(head);
        o2.print(head);
    }
}
