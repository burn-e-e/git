public class Main{
    public static void main(String[] args) {
        DoubleEndedLinkedList myList = new DoubleEndedLinkedList();
        for(int i = 0; i<10;i++){
            myList.insertLast(i);
        }
        System.out.println(myList);
    }
}