/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/
//Copy List with Random Pointer
//TC: O(n), SC:O(1)
//Input: head = [[7,null],[13,0],[11,4],[10,2],[1,0]]
//Output: [[7,null],[13,0],[11,4],[10,2],[1,0]]
class CopyListWithRandomPointer {
    public Node copyRandomList(Node head) {
        if(head == null)
            return head;
        Node curr = head;
        while(curr!=null) {
            Node tmp = curr.next;
            curr.next = new Node(curr.val,tmp,null);
            curr = tmp;
        }
        curr = head;
        while(curr!=null) {
            if(curr.random != null) {
                curr.next.random = curr.random.next;
            }
            curr = curr.next.next;
        }
        curr = head;
        Node copyHead = head.next;
        while(curr != null) {
            Node tmp = curr.next.next;
            Node copy = curr.next;
            curr.next = tmp;
            if(tmp!=null)
                copy.next = tmp.next;
            curr = tmp;
        }
        return copyHead;
    }
}