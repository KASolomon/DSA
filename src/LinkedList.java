import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class LinkedList {
    private Node first;
    private Node last;

    private class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value = value;
        }
    }



    public void addFirst (int newValue){
        var newNode = new Node(newValue);
        if(first == null)
            first = last = newNode;
        else{
            newNode.next = first;
            first = newNode;
        }
    }
    public void addLast (int newValue){
        var newNode = new Node(newValue);
        if(first == null)
            first = last = newNode;
        else{
            last.next = newNode;
            last = newNode;
        }
    }

    public void deleteFirst(){
        if(isEmpty())
            throw new NoSuchElementException();
        if(first == last)
            first = last = null;
        else{
            var second = first.next;
            first.next = null;
            first = second;
        }
    }
    public void deleteLast(){
        if (isEmpty())
            throw new NoSuchElementException();
        var searchNode = first;
        if(searchNode != null && searchNode.next != null)
            while (searchNode.next != null){
                if(searchNode.next.next == null){
                    searchNode.next = null;
                    last = searchNode;
                    break;
                }
                searchNode = searchNode.next;
            }
        else
            first = last = null;
    }

    public boolean contains(int searchValue){
        var currentNode = first;
       while(currentNode != null){
           if(currentNode.value == searchValue){
               return true;
           }
           currentNode = currentNode.next;
       }
       return false;
    }

    public int indexOf(int searchValue){
       var count = 0;
       var currentNode = first;
       while(currentNode != null){
           if(currentNode.value == searchValue){
               return count;
           }
           currentNode = currentNode.next;
           count++;
       }
       return -1;
    }
    private boolean isEmpty(){
        return first == null && last == null;
    }
}
