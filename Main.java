public class Main{
    public static void main(String[] args) {
        DoubleEndedLinkedList<Integer> myIntList = new DoubleEndedLinkedList<Integer>();
        for(int i = 0; i<10;i++){
            myIntList.insertLast(i+1);
        }
        myIntList.printList();
        DoubleEndedLinkedList<String> myStringList = new DoubleEndedLinkedList<String>();
        myStringList.insertLast("Hello");
        myStringList.insertLast("Bonjour");
        myStringList.insertLast("Hallo");
        myStringList.printList();
    }
}