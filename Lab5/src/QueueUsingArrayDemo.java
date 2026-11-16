/**
 - Queue.java

 - Your Name: Tunahan Akyol

 - Your Student Id: 240446002

 - Your Date: 16.11.2026

 */

public class QueueUsingArrayDemo {
    public static void main(String[] args){
        String[] students = {
                "Ali", "Ayse", "Mehmet", "Zeynep", "Ahmet",
                "Elif", "Mustafa", "Fatma", "Can", "Ece",
                "Burak", "Deniz", "Emre", "Selin", "Mert",
                "Ceren", "Kerem", "Dilan", "Onur", "Seda"
        };

        Queue<String> queue = new Queue<>(10);

        for (int i = 0; i < 10; i++){
            String student = students[i];
            queue.enqueue(student);
        }

        System.out.println("Original Queue: " + queue.toString());

        System.out.println("Queue Size: " + queue.size());

        System.out.println("First Student: " + queue.peek() + "\n\nRemoving three students:");

        for (int i = 0; i < 3; i++){
            System.out.println("Removed: " + queue.dequeue());
        }

        System.out.println("\nQueue After Removal: " + queue.toString());

        System.out.println("Final Queue Size: " + queue.size());

        queue.enqueue(students[11]);

        System.out.println("Queue Size: " + queue.size());
    }
}