package leetcodeExercise.isPalindrome;

public class IsPalindrome {
       
        private Node head;
        private Node tail;
        private int length;
    
        class Node {
            int value;
            Node next;
            Node prev;
    
            Node(int value) {
                this.value = value;
            }
        }
    
        public IsPalindrome(int value) {
            Node newNode = new Node(value);
            head = newNode;
            tail = newNode;
            length = 1;
        }
    
        public Node getHead() {
            return head;
        }
    
        public Node getTail() {
            return tail;
        }
    
        public int getLength() {
            return length;
        }
    
        public void printList() {
            Node temp = head;
            while (temp != null) {
                System.out.println(temp.value);
                temp = temp.next;
            }
        }
    
        public void printAll() {
            if (length == 0) {
                System.out.println("Head: null");
                System.out.println("Tail: null");
            } else {
                System.out.println("Head: " + head.value);
                System.out.println("Tail: " + tail.value);
            }
            System.out.println("Length:" + length);
            System.out.println("\nDoubly Linked List:");
            if (length == 0) {
                System.out.println("empty");
            } else {
                printList();
            }
        }
        
        public void makeEmpty() {
            head = null;
            tail = null;
            length = 0;
        }
        
        public void append (int value) {
            Node newNode = new Node(value);
            if(length == 0) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                newNode.prev = tail;
                tail = newNode;
            }
            length++;
        }
    
        // WRITE ISPALINDROME METHOD HERE //
        public boolean isPalindrome() {
           // if the list has only 1 or 0 nodes, it's automatically a palindrome
        if (length <= 1) return true;
        
        // set up two pointers starting from opposite ends of the list
        Node forwardNode = head;
        Node backwardNode = tail;
        
        // iterate through the list until the two pointers meet in the middle
        for (int i = 0; i < length / 2; i++) {
            // if the values at the two pointers don't match, the list is not a palindrome
            if (forwardNode.value != backwardNode.value) return false;
            
            // move the pointers toward the center of the list
            forwardNode = forwardNode.next;
            backwardNode = backwardNode.prev;
        }
        
        // if the loop completes without returning false, the list is a palindrome
        return true;
        }
}
