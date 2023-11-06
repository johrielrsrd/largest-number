import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> arrayNum = new ArrayList<>();

        System.out.print("Please enter the first number: ");
        arrayNum.add(scan.nextInt());

        System.out.print("Please enter the second number: ");
        arrayNum.add(scan.nextInt());

        System.out.print("Please enter the third number: ");
        arrayNum.add(scan.nextInt());
        scan.close();

        Collections.sort(arrayNum);

        System.out.println((arrayNum.get(0) == arrayNum.get(1) &&
                arrayNum.get(1) == arrayNum.get(2) &&
                arrayNum.get(0) == arrayNum.get(2))
                        ? "All numbers are equal."
                        : "The biggest number is " + arrayNum.get(2));
    }
}