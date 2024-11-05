import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
     var list = new LinkedList();
     list.addFirst(12);
     list.addFirst(17);
     list.addFirst(19);
     list.addLast(19);
     System.out.print(list);
     System.out.print("Deleted 19");
     System.out.print(list);
     list.deleteFirst();
     list.deleteLast();
     System.out.print("Deleted 19");
     System.out.print(list);
     System.out.println(list.contains(19));
     System.out.println("Index of 17");
     System.out.println(list.indexOf(17));

    }
}