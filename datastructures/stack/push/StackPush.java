package stack.push;

public class StackPush {

        private Node top;
        private int height;
    
        class Node {
            int value;
            Node next;
    
            Node(int value) {
                this.value = value;
            }
        }
    
        public StackPush(int value) {
            Node newNode = new Node(value);
            top = newNode;
            height = 1;
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
    
        /// WRITE PUSH METHOD HERE ///
        public void push(int value) {
        // Create a new node with the given value
        Node newNode = new Node(value);
        // If the stack is empty, set the new node as the top
        if(height == 0) {
            top = newNode;
        } else {
            // Otherwise, set the next node of the new node as the current top node,
            // and then set the new node as the new top node
            newNode.next = top;
            top = newNode;
        }
        // Increase the height of the stack by 1
        height++;
      }
    
}
    
    

