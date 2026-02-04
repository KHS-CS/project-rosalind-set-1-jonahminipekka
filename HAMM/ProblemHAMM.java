import java.util.Scanner;

public class PointMutations {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read the two DNA strings (one per line)
        String s = sc.nextLine();
        String t = sc.nextLine();

        int count = 0;

        // Compare letters at the same position
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                count++;
            }
        }

        // Print the Hamming distance
        System.out.println(count);
    }
}
