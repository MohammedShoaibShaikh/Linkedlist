package Linkedlist;
import java.util.Objects;
import java.util.Scanner;
import java.lang.String;

class LL{
    Scanner sc = new Scanner(System.in);
    public int find_node_LL(Node head, int data){
        Node temp = head;
        int count = 0;

        while(temp != null){
            if(Objects.equals(temp.data, data)){
                return count;
            }
            temp = temp.next;
            count++;
        }
        return -1;
    }
    public Node input(){
        System.out.print("Enter Elements in Linked-list: ");
        int data = sc.nextInt();
        Node head = null;
        Node temp = null;
        while(data != -1){
            Node newnode = new Node(data);
            if(head == null){
                head = newnode;
                temp = head;
            }
            else{
                temp.next = newnode;
                temp = newnode;
            }
            data = sc.nextInt();
        }
        return head;
    }
    public void print(Node head){
        Node temp = head;
        System.out.print("Linked-list: ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Find_Node_LL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LL o1 = new LL();

        Node head = o1.input();
        o1.print(head);
        System.out.print("Enter data to Find: ");
        int i = sc.nextInt();
        int ans = o1.find_node_LL(head, i);
        System.out.println("Index of data is " + ans);

    }
}
