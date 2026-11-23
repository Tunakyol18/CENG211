public class Stack {
    private Node top;
    private int size;


    public Stack(){
        top = null;
    }

    public void delete(){
        top = null;
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return (top == null);
    }

    public void push(String data){
        if (isEmpty()){
            top = new Node(data);
            size++;
            return;
        }

        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
        size++;
    }

    public String pop(){
        if (isEmpty()){
            return null;
        }

        String data = top.data;
        top = top.next;
        return data;
    }

    public String peek(){
        if (isEmpty()){
            return null;
        }
        return top.data;
    }

    public void display(){
        if (isEmpty()){
            System.out.println("Empty!");
            return;
        }

        Node curr = top;
        while(curr != null){

            System.out.println(curr.data);

            if (curr.next != null){

                System.out.println("->");

            }

            curr = curr.next;
        }

        System.out.println();
    }


}

















