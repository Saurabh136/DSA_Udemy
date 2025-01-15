package queue.dequeue;

public class Dequeue {
        private Node first;
        private Node last;
        private int length;
    
        class Node {
            int value;
            Node next;
    
            Node(int value) {
                this.value = value;
            }
        }
    
        public Dequeue(int value) {
            Node newNode = new Node(value);
            first = newNode;
            last = newNode;
            length = 1;
        }
    
        public Node getFirst() {
            return first;
        }
    
        public Node getLast() {
            return last;
        }
    
        public int getLength() {
            return length;
        }
    
        public void printList() {
            Node temp = first;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    
        public void printAll() {
            if (length == 0) {
                System.out.println("First: null");
                System.out.println("Last: null");
            } else {
                System.out.println("First: " + first.value);
                System.out.println("Last: " + last.value);
            }
            System.out.println("Length:" + length);
            System.out.println("\nQueue:");
            if (length == 0) {
                System.out.println("empty");
            } else {
                printList();
            }
        }
        
        public void makeEmpty() {
            first = null;
            last = null;
            length = 0;
        }
    
        public void enqueue(int value) {
            Node newNode = new Node(value);
            if (length == 0) {
                first = newNode;
                last = newNode;
            } else {
                last.next = newNode;
                last = newNode;
            }
            length++;
        }
    
        // WRITE DEQUEUE METHOD HERE //
       public Node dequeue() {
        // If the queue is empty, return null
        if(length == 0) return null;
        // Save a reference to the first node
        Node temp = first;
        // If there is only one node in the queue, set both first and last to null
        if(length == 1) {
            first = null;
            last = null;
        } else {
            // Otherwise, set the first node to be the next node in the queue
            first = first.next;
            // Set the next pointer of the removed node to null
            temp.next = null;
        }
        // Decrease the length of the queue by 1
        length--;
        // Return the removed node
        return temp;
    }
}
    
    
    

