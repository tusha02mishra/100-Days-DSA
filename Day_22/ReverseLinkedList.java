package Day_22;
import java.util.Scanner;

public class ReverseLinkedList {

    // Node class
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Function to reverse the linked list
    static Node reverseList(Node head) {

        Node prev = null;
        Node curr = head;

        while (curr != null) {

            Node next = curr.next; // Save next node

            curr.next = prev;      // Reverse the link

            prev = curr;           // Move prev
            curr = next;           // Move curr
        }

        return prev;
    }

    // Print linked list
    static void printList(Node head) {

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Input number of nodes
        int n = sc.nextInt();

        Node head = null;
        Node temp = null;

        // Create linked list
        for (int i = 0; i < n; i++) {

            int value = sc.nextInt();

            Node newNode = new Node(value);

            if (head == null) {
                head = newNode;
                temp = newNode;
            } else {
                temp.next = newNode;
                temp = newNode;
            }
        }

        // Reverse the list
        head = reverseList(head);

        // Print reversed list
        printList(head);

        sc.close();
    }
}

