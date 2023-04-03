package zadaniaKlasy;
	
class Node {
    private int value;
    private Node next;
    
}


public class Zadanie67 {
    public static void main(String[] args) {
        // Tworzenie trzech elementów listy
        Node element1 = new Node(15, null);
        Node element2 = new Node(10, element1);
        Node element3 = new Node(5, element2);
        System.out.print("Że co? Że jak? no właśnie... "); // https://youtu.be/MXwrMXD0iqw?t=15
        // Wypisywanie elementów listy od początku do końca
        Node current = element3;
        while (current != null) {
            System.out.print(current.getValue() + " ");
            current = current.getNext();
        }
    }
}
