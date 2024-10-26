import java.util.ArrayList;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        DynamicArray test = new DynamicArray(3);
        test.insert(1);
        test.insert(2);
        test.insert(3);

        test.insert(4);
        test.insert(5);

        System.out.println(Arrays.toString(test.reverse()));

    }
}