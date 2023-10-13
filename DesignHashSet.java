//Design HashSet using linkedlist
/* Input
["MyHashSet", "add", "add", "contains", "contains", "add", "contains", "remove", "contains"]
[[], [1], [2], [1], [3], [2], [2], [2], [2]]
Output
[null, null, null, true, false, null, true, null, false]*/
class Node {
    Node next;
    int val;
    public Node(int key) {
        this.val = key;
        this.next = null;
    }
}
class MyHashSet {
    Node head;
    public MyHashSet() {
        head = null;
    }
    
    public void add(int key) {
        if(head == null) {
            head = new Node(key);
            return;
        }
        boolean doesExists = contains(key);
        if(!doesExists) {
            Node tmp = head;
            while(tmp.next!=null)
                tmp = tmp.next;
            tmp.next = new Node(key);
        }
    }
    
    public void remove(int key) {
        if(head==null) return;
        if(head.val==key) {
            head = head.next;
            return;
        }
        Node tmp = head;
        while(tmp.next!=null) {
            if(tmp.next.val==key) {
                tmp.next = tmp.next.next;
            } else {
                tmp = tmp.next;
            }
        }
    }
    
    public boolean contains(int key) {
        if(head==null) return false;
        if(head.val == key) return true;

        Node tmp=head;
        while(tmp.next!=null) {
            if(tmp.next.val==key) return true;
            tmp = tmp.next;
        }
        return false;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */