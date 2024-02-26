    public class DoubleEndedLinkedList<T> extends DoublyLinkedListNode<T>{
        private DoublyLinkedListNode<T> head;
        private DoublyLinkedListNode<T> tail;
        public void insertLast(T value){
            DoublyLinkedListNode<T> newNode = new DoublyLinkedListNode<T>();
            newNode.setData(value);
            if (isEmpty()) {
                head = newNode;
                tail = newNode;
            }else{
                tail.next = newNode;
                tail = newNode;
            }
        }
        public DoublyLinkedListNode<T> deleteLast(){
            if (isEmpty()) {
                return null;
            }
            DoublyLinkedListNode<T> deletedNode = tail;
            if (head == tail) {
                head = null;
                tail = null;
            }else{
                DoublyLinkedListNode<T> pred = head;
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
        public void printList() {
            DoublyLinkedListNode<T> temp = head;
            while (temp != null) {
                System.out.print(temp.getData() + " ");
                temp = temp.next;
            }
            System.out.println(); 
        }
    }
