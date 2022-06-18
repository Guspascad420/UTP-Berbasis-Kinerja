import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void minimumBribes(List<Integer> q) {
        // Write your code here
        List<Integer> haewon = new ArrayList<>();
        int realPos = 0;

        for (int i = 1; i <= q.size(); i++) {
            if (i != q.get(i - 1)) {
                realPos = q.get(i - 1) - i;
                haewon.add(realPos);
            }
        }

        for (Integer i : haewon) {
            System.out.println(i);
        }

        haewon.removeIf(val -> val < 0);

        int sum = 0;
        boolean chaotic = false;


        for (Integer i : haewon) {
            if (i >= 3) {
                chaotic = true;
            } else {
                sum += i;
            }
        }

        if (chaotic) {
            System.out.println("Too chaotic");
        } else {
            System.out.println(sum);
        }
    }

    public static void main(String[] args) {
        List<Integer> lily = new ArrayList<>();
        lily.add(2);
        lily.add(1);
        lily.add(5);
        lily.add(3);
        lily.add(4);

        minimumBribes(lily);
    }
}
