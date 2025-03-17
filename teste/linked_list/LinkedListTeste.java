package linked_list;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListTeste {
    ArrayList<String> Elements = new ArrayList<>();
        public void setStoredElements(String element){
            this.Elements.add(element);
        }
        
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();

        linkedList.push("A");
        linkedList.add("B");
        linkedList.push("C");
        linkedList.addLast("D");
        linkedList.offer("E");
        LinkedListTeste elementos = new LinkedListTeste();
        System.out.println(linkedList);
        elementos.setStoredElements(linkedList.get(1));
        System.out.println(elementos);
    }

    @Override
    public String toString() { 
        StringBuilder sb = new StringBuilder();
        sb.append("LinkedListStorageElements{");
        sb.append("Elements=").append(Elements);
        sb.append('}');
        return sb.toString();
    }
}
