/**
 * SongNode.java
 *
 * Represents a song of a playlist.
 *
 * Your Name:        Tunahan Akyol
 * Your Student ID:  240446002
 * Your Date:        19.10.26
 */

public class SongNode {

    String title;

    SongNode prev;
    SongNode next;

    public SongNode(String title) {
        this.title = title;
        this.prev = null;
        this.next = null;
    }
}