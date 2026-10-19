/**
 * SongNode.java
 *
 * Represents the doubly linked list for the music playlist.
 *
 * Your Name:        Tunahan Akyol
 * Your Student ID:  240446002
 * Your Date:        19.10.26
 */


public class MusicPlaylist {

    private SongNode head;
    private SongNode tail;
    private SongNode current;

    public MusicPlaylist() {
        head = null;
        tail = null;
        current = null;
    }

    public void addSong(String title) {

        SongNode sarki = new SongNode(title);

        if (head == null) {
            head = sarki;
            tail = sarki;
            current = sarki;
        } else {
            tail.next = sarki;
            tail.next.prev = tail;
            tail = tail.next;
        }
    }

    public void removeSong(String title) {

        if (head == null) {
            System.out.println("Liste boş krşm.");
            return;
        }

        SongNode temp = head;

        while (temp != null) {
            if (temp.title.equals(title)) {

                if (temp == current) {
                    if (temp.next != null) {
                        current = temp.next;
                    } else {
                        current = temp.prev;
                    }
                }

                if (temp == head) {
                    head = temp.next;
                }

                if (temp == tail) {
                    tail = temp.prev;
                }

                if (temp.prev != null) {
                    temp.prev.next = temp.next;
                }

                if (temp.next != null) {
                    temp.next.prev = temp.prev;
                }

                if (head == null) {
                    tail = null;
                    current = null;
                }

                System.out.println("Removed: " + temp.title);
                return;
            }

            temp = temp.next;
        }

        System.out.println("Bulamadık krşm");
    }

    public void nextSong() {

        if (current != null && current.next != null) {
            current = current.next;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Zaten son musik krşm");
        }
    }

    public void previousSong() {

        if (current != null && current.prev != null) {
            current = current.prev;
            System.out.println("Playing: " + current.title);
        } else {
            System.out.println("Zaten ilk musik krşm");
        }
    }

    public void displayCurrentSong() {

        if (current == null) {
            System.out.println("Şu an çalan şarkı yok krşm.");
        } else {
            System.out.println("Current Song: " + current.title);
        }
    }

    public void displayPlaylist() {

        SongNode temp = head;

        while (temp != null) {
            System.out.print(temp.title + " <-> ");
            temp = temp.next;
        }

        System.out.println("END");
    }
}