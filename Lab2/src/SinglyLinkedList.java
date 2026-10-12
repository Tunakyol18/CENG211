/**
 * SinglyLinkedList.java
 * Represents a singly linked list.
 * Your Name:        Tunahan Akyol
 * Your Student ID:  240446002
 * Your Date:        12.10.2026
 */


public class SinglyLinkedList {

    Node head;

    public SinglyLinkedList() {
        head = null;
    }

    public int numberOfElements() {
        Node temp = head;
        int count = 0;
        while (temp != null){
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void add(int data){
        Node newNode = new Node(data);


        if (head == null){head = newNode;}
        else {
            Node temp = head;
            while (temp.next != null){
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    public void display(){
        Node temp = head;
        System.out.print("[");
        while (temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.print("]");
    }

    public Node findMiddle() {
        if (head == null){
            System.out.println("Empty List!");
            return null;
        }else {
            boolean isOdd = (this.numberOfElements() % 2 == 1);
            int numberOfElements = this.numberOfElements();
            Node temp = head;
            if (isOdd) {
                for (int i = 0; i < (numberOfElements - 1) / 2; i++) {
                    temp = temp.next;
                }
                return temp;
            } else {
                for (int i = 0; i < (numberOfElements) / 2; i++) {
                    temp = temp.next;
                }
                return temp;
            }
        }

    }

    public void deleteMiddle() {
        if (head == null){
            System.out.println("Empty List!");

        }else {
            int numberOfElements = this.numberOfElements();

            boolean isOdd = (numberOfElements % 2 == 1);


            Node temp = head;
            Node prev = null;

            if (head.next == null){

                head = null;
                System.out.print("The Middle one has been deleted!");

            }
            else if (isOdd) {

                for (int i = 0; i < (numberOfElements - 1) / 2; i++) {

                    prev = temp;
                    temp = temp.next;

                }
                prev.next = temp.next;
                System.out.print("The Middle one has been deleted!");

            } else {

                for (int i = 0; i < (numberOfElements) / 2; i++) {

                    prev = temp;
                    temp = temp.next;

                }
                prev.next = temp.next;

                System.out.print("The Middle one has been deleted!");

            }
        }

    }

    public Node getHead() {
        return head;
    }



}
