import java.util.ArrayList;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DynamicArray test = new DynamicArray(3);
        test.insert(99);
        test.insert(98);
        test.insert(98);

        test.insert(98);
        test.insert(101);
ArrayList<Integer> duplicates = test.intersect(new int[]{99, 98, 2, 101, 3, 4});
        System.out.println(duplicates);

    }
}