/**
 * MiddleNodeDemo.java
 *
 * Tests the singly linked list and findMiddle() method.
 *
 * Your Name:        Tunahan Akyol
 * Your Student ID:  240446002
 * Your Date:        12.10.2026
 */

public class MiddleNodeDemo {

    public static void main(String[] args) {

        System.out.println("=== Find Middle Node Demo ===");
        System.out.println();

        SinglyLinkedList list1 = new SinglyLinkedList();

        for (int i = 1; i < 22; i++){
            list1.add(i);
        }


        System.out.println("List 1:");
        list1.display();

        System.out.println();

        int middle1 = list1.findMiddle().data;

        System.out.println("Middle Node: " + middle1);
        System.out.println();

      SinglyLinkedList list2 = new SinglyLinkedList();

        for (int i = 1; i < 17; i++){
            list2.add(i*10);
        }


        System.out.println("List 2:");
        list2.display();
        System.out.println();

        int middle2 = list2.findMiddle().data;


        System.out.println("Middle Node: " + middle2);
        System.out.println();
    }
}