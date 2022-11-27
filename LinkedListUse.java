package Linkedlist;
import java.util.Scanner;

public class LinkedListUse {

    static Node delete_ith_node(Node head, int i){
        Node temp = head;
        int j = 0;
        if(i == 0){
            head = temp.next;
            return head;
        }
        while(j < i-1 && temp != null){
            temp = temp.next;
            j++;
        }
        if(temp != null){
            Node A = temp.next;
            temp.next = A.next;
        }
        return head;
    }

    static Node delete_ith_node_recursivly(Node head, int i){
        if(head == null) return head;

        else if(i == 0){
            head = head.next;
            return head;
        }
        else{
            Node temp = delete_ith_node_recursivly(head.next, i-1);
            head.next = temp;
            return head;
        }
    }

    static Node insert_node_ith(Node head, int i, int data){
        Node newnode = new Node(data);
        Node temp = head;
        int j = 0;
        if(i == 0){
            newnode.next = head;
            head = newnode;
            return head;
        }
        while(j < i-1 && temp != null){
            temp = temp.next;
            j++;
        }
        if(temp != null){
            Node A = temp.next;
            temp.next = newnode;
            newnode.next = A;
        }
        return head;
    }

    static Node insert_node_ith_recursively(Node head, int i, int data){
        if(head == null) return head;

        if(i == 0){
            Node newnode = new Node(data);
            newnode.next = head;
            head = newnode;
            return head;
        }
        else{
            Node temp = insert_node_ith_recursively(head.next, i-1, data);
            head.next = temp;
            return head;
        }
    }

    static void print_ith_node(Node head){
        Scanner sc = new Scanner(System.in);
        int j = 0;
        System.out.print("Enter ith index: ");
        int i = sc.nextInt();
        Node temp = head;
        while(j < i){
            temp = temp.next;
            j++;
        }
        System.out.println("ith Element: " + temp.data);
    }

    static int length(Node head){
        Node temp = head;
        int ct = 0;
        while(temp != null){
            temp = temp.next;
            ct++;
        }
        return ct;
    }
    static int length_recursive(Node head){
        if(head == null) return 0;
        Node tmp = head.next;
        int a = length_recursive(tmp);
        return a+1;
    }
    public static Node input(){
        Scanner sc = new Scanner(System.in);
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

    public static void print(Node head){
        Node temp = head;
        System.out.print("Linked list: ");
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
//        Node n1 = new Node(1);
//        Node head = n1;
//        Node n2 = new Node(2);
//        Node n3 = new Node(3);
//        Node n4 = new Node(4);
//        Node n5 = new Node(5);
//        n1.next = n2;
//        n2.next = n3;
//        n3.next = n4;
//        n4.next = n5;
        Node head = input();
        print(head);
//        int l = length(head);
//        System.out.println("Length: " + l);
//
//        int l1 = length_recursive(head);
//        System.out.println("Length Through Resursion: " + l1);

//        print_ith_node(head);


//        System.out.print("Inserting Element Index and data: ");
//        int i = sc.nextInt();
//        int data = sc.nextInt();
//        head = insert_node_ith(head, i, data);
//        print(head);
//
//        System.out.print("Inserting Element Recursively, Index and data: ");
//        int x = sc.nextInt();
//        int data1 = sc.nextInt();
//        head = insert_node_ith_recursively(head, x, data1);
//        print(head);

        System.out.print("Deleting Element Index: ");
        int j = sc.nextInt();
        head = delete_ith_node(head, j);
        print(head);

        System.out.print("Deleting Element Recursivly Index: ");
        int j1 = sc.nextInt();
        head = delete_ith_node_recursivly(head, j1);
        print(head);



    }
}
