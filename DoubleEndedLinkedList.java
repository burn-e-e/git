import java.util.NoSuchElementException;
import java.util.Iterator;
public class DoubleEndedLinkedList<T> extends DoublyLinkedListNode<T> implements Iterable<T>{
    
    private DoublyLinkedListNode<T> head;
    private DoublyLinkedListNode<T> tail;
     @Override
    public Iterator<T> iterator() {
        return new DoubleEndedLinkedListIterator<>();
    }

    private class DoubleEndedLinkedListIterator<E> implements Iterator<E> {
        private DoublyLinkedListNode<E> current;

        @SuppressWarnings("unchecked")
        public DoubleEndedLinkedListIterator() {
            current = (DoublyLinkedListNode<E>) head;
        }

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            E data = current.getData();
            current = current.next;
            return data;
        }
    }

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
    public void removeByData(T data) {
        if (isEmpty()) {
            return;
        }
        if (head.getData().equals(data)) {
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {
                tail = null;
            }
            return;
        }
        DoublyLinkedListNode<T> pred = head;
        while (pred.next != null && !pred.next.getData().equals(data)) {
            pred = pred.next;
        }
        if (pred.next != null) {
            pred.next = pred.next.next;
            if (pred.next != null) {
                pred.next.prev = pred;
            } else {
                tail = pred;
            }
        }
    }
}
