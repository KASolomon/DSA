import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DynamicArray test = new DynamicArray(3);
//        test.insert(99);
//        test.insert(98);
//        test.removeAt(0);
        int index = test.indexOf(98);
        System.out.println(index);
        test.print();
    }
}