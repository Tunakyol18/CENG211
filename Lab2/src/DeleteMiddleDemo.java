/*
 * DeleteMiddleDemo.java
 *
 * Tests deleting the middle node of a singly linked list.
 *
 * Your Name:        Tunahan Akyol
 * Your Student ID:  240446002
 * Your Date:        12.10.2026
 */

public class DeleteMiddleDemo {

    public static void main(String[] args) {

        System.out.println("=== Delete Middle Node Demo ===");
        System.out.println();

        // Test 1: Odd number of nodes
        // 1. Created a singlyLinkedList
        // 2. Add 1,2,3,4,5 Nodes to the list
        // 3. Display the list
        // 4. Delete the Middle Node
        // 5. Display the list after deleting

        SinglyLinkedList list1 = new SinglyLinkedList();

        for (int i = 1; i < 6; i++){
            list1.add(i);
        }

        System.out.println("Original List 1:");
        list1.display();
        System.out.println();

        list1.deleteMiddle();

        System.out.println();
        System.out.println("After deleting middle:");
        list1.display();
        System.out.println();
        System.out.println();

        // -------------------------------------------------------
        // Test 2: Even number of nodes
        // 1. Created another singlyLinkedList
        // 2. Add 10,20,30,40,50,60 Nodes to the list
        // 3. Display the list
        // 4. Delete the Middle Node
        // 5. Display the list after deleting

        SinglyLinkedList list2 = new SinglyLinkedList();

        for (int i = 1; i < 7; i++){
            list2.add(i * 10);
        }

        System.out.println("Original List 2:");
        list2.display();
        System.out.println();

        list2.deleteMiddle();

        System.out.println();
        System.out.println("After deleting middle:");
        list2.display();
        System.out.println();
        System.out.println();

        // Test 3: One node
        // 1. Created another singlyLinkedList
        // 2. Add just 999 to the list
        // 3. Display the list
        // 4. Delete the Middle Node (because it has just one node, you just have to delete the head)
        // 5. Display the list after deleting

        SinglyLinkedList list3 = new SinglyLinkedList();

        list3.add(999);

        System.out.println("Original List 3:");
        list3.display();
        System.out.println();

        list3.deleteMiddle();

        System.out.println();
        System.out.println("After deleting middle:");
        list3.display();
        System.out.println();

    }
}