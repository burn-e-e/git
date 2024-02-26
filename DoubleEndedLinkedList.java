public class DoubleEndedLinkedList {
    private DoublyLinkedListNode head;
    private DoublyLinkedListNode tail;
    public void insertLast(int value){
        DoublyLinkedListNode newNode = new DoublyLinkedListNode();
        newNode.setData(value);
        if (isEmpty()) {
            head = newNode;
            tail = newNode;
        }else{
            tail.next = newNode;
            tail = newNode;
        }
    }
    public DoublyLinkedListNode deleteLast(){
        if (isEmpty()) {
            return null;
        }
        DoublyLinkedListNode deletedNode = tail;
        if (head == tail) {
            head = null;
            tail = null;
        }else{
            DoublyLinkedListNode pred = head;
            while (pred.next != tail) {
                pred = pred.next;
            }
            pred.next = null;
            tail = pred;
        }
        return deletedNode;
    }
    private boolean isEmpty(){
        return head == null;
    }
}
