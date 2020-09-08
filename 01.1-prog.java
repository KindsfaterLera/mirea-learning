import javax.swing.*;
class Loading1 {
    public static void main(String[] arg) {
        int[] arrSum = new int[10];
        int[] arr = {1, 5, 2, 10};
 
        int n = 10;
        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
 
        int i = 0;
        while (i < n) {
            i += 1;
            System.out.println(i);
        }
        
        i = 0;
        do {
            i += 1;
            System.out.println(i);
        }
        while (i < n); 
    }
}
