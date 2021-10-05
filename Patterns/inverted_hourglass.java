import java.util.*;

public class inverted_hourglass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int osp = 0, star = n;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= osp; j++) {
                System.out.print("\t");
            }

            for (int j = 1; j <= star; j++) {
                if ((i > n / 2 + 1 && i < n) && (j > 1 && j < star)) {
                    System.out.print("\t");
                } else {
                    System.out.print("*\t");
                }
            }

            if (i < n / 2 + 1) {
                osp++;
                star -= 2;
            } else {
                osp--;
                star += 2;
            }

            System.out.println();
        }
    }
}
