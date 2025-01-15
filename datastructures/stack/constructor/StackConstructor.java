package stack.constructor;

public class StackConstructor {
       // CREATE CLASS VARIABLES, NODE CLASS, AND CONSTRUCTOR HERE//

         // Initialize the top node of the stack and its height
        private Node top;
        private int height;
     
        // Create a Node class to represent individual nodes in the stack
        class Node {
            int value; // stores the value of the node
            Node next; // stores the reference to the next node in the stack
     
            // Constructor to create a new node with the given value
            Node(int value) {
                this.value = value;
            }
        }
        
        // Constructor to create a new stack with the given value as the top element
        public StackConstructor(int value) {
            Node newNode = new Node(value); // create a new node with the given value
            top = newNode; // set the new node as the top of the stack
            height = 1; // set the initial height of the stack to 1
        }
        
        public Node getTop() {
            return top;
        }
    
        public int getHeight() {
            return height;
        }
    
        public void printStack() {
            Node temp = top;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    
        public void printAll() {
            if (height == 0) {
                System.out.println("Top: null");
            } else {
                System.out.println("Top: " + top.value);
            }
            System.out.println("Height:" + height);
            System.out.println("\nStack:");
            if (height == 0) {
                System.out.println("empty");
            } else {
                printStack();
            }
        }
        
        public void makeEmpty() {
            top = null;
            height = 0;
        }
}
