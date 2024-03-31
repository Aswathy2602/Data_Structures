import java.util.Scanner;

public class First_Unq_in_String_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String: ");
        String s = sc.nextLine();
        Solution1 ob = new Solution1();
        int result = ob.FUCIS(s);
        if (result != -1)
            System.out.println("First unique character found at index: " + result);
        else
            System.out.println("No unique character found.");
    }
}

class Solution1 {
    int FUCIS(String s) {
        char ar[] = s.toCharArray();
        int n = ar.length;
        int i, j;
        for (i = 0; i < n; i++) {
            boolean isUnique = true;
            for (j = 0; j < n; j++) {
                if (i != j && ar[i] == ar[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                return i;
            }
        }
        return -1;
    }
}
