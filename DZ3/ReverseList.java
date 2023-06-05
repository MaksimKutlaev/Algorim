package DZ3;

public class ReverseList {
    Node head;

    public void revers(){
        if (head != null && head.next != null){
            Node tmp = head;
            revers(head.next, head);
            tmp.next = null;
        }
    }
    private void revers (Node currNode, Node previousNode){
        if (currNode.next == null){
            head = currNode;
        }
        else{
            revers(currNode.next, currNode);
        }
        currNode.next = previousNode;

    }

    public class Node {
        int value;
        Node next;
    }
}