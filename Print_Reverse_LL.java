package Linkedlist;


public class Print_Reverse_LL {
    static void reverse_LL(Node head){
        if(head == null) return;
        reverse_LL(head.next);
        System.out.print(head.data + " ");
    }
    public static void main(String[] args){
        LL o3 = new LL();
        Node head = o3.input();
        o3.print(head);
        System.out.println("Reverse Linked-List: ");
        reverse_LL(head);

    }
}
