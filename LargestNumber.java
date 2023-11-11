import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayNum = new ArrayList<>(3);

        for (int i = 1; i <= 3; i++) {
            System.out.print("Please enter INPUT" + i + " : ");
            arrayNum.add(scan.nextInt());
        }

        Collections.sort(arrayNum);

        System.out.println((arrayNum.get(0) == arrayNum.get(1) &&
                arrayNum.get(1) == arrayNum.get(2))
                        ? "All numbers are equal."
                        : "The biggest number is " + arrayNum.get(2));
    }
}