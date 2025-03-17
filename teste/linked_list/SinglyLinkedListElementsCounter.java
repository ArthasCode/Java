package linked_list;

public class SinglyLinkedListElementsCounter {
    public static void main(String[] args) {
        Node head = new Node(2);
        Node element2 = new Node(4);
        Node element3 = new Node(1);
        head.next = element2;
        element2.next = element3;

        System.out.println(countNodes(head));
    }

     static int countNodes(Node head){
        int counter = 0;

        while (head != null){
            System.out.println(head.val);

            head = head.next;
            counter++;
        }

        return counter;
    }
    
    
}

class Node{
        int val;
        Node next;
    
        public Node(int val){
            this.val = val;
        }
    }