package CIG.Chapter2_LinkTbale;

public class Num1 {
    public static void main(String[] args) {

    }

    public static void printComaonPart(Node node1, Node node2) {
        while (node1 != null && node2 != null) {
            if (node1.value == node2.value) {
                System.out.println(node1.value);
                node1 = node1.next;
                node2 = node2.next;
            } else if (node1.value > node2.value) {
                node2 = node2.next;
            } else {
                node1 = node1.next;
            }
        }
    }

    public class Node {
        int value;
        Node next;

        public Node(int data) {
            this.value = data;
        }
    }
}
